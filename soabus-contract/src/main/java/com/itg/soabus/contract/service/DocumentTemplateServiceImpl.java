package com.itg.soabus.contract.service;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Locale;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.velocity.tools.generic.DateTool;
import org.apache.velocity.tools.generic.NumberTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import weaver.soa.workflow.request.ArrayOfProperty;
import weaver.soa.workflow.request.MainTableInfo;
import weaver.soa.workflow.request.ObjectFactory;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import com.itg.soabus.common.AmtInChsWords;
import com.itg.soabus.common.OAService;
import com.itg.soabus.common.Result;
import com.itg.soabus.common.AmtInEngWords.DefaultProcessor;
import com.itg.soabus.contract.domain.TradeContract;
import com.itg.soabus.contract.domain.TradeContractItem;
import com.itg.soabus.messaging.TradeContractWorkflow;
import com.itg.soabus.oaservice.RequestService;
import com.itg.soabus.oaservice.RequestServicePortType;

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.config.ITemplateEngineConfiguration;

@Service
public class DocumentTemplateServiceImpl implements DocumentTemplateService {

	final Logger logger = LoggerFactory
			.getLogger(DocumentTemplateServiceImpl.class);

	@Autowired
	private transient JmsOperations jmsOperations;

	// @Autowired
	// private transient JmsTemplate jmsTemplate;

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private OAService oAService;

	@Resource(name = "wsContext")
	private WebServiceContext wsCtxt;

	private void fillTcField(TradeContract tc) {
		tc.setTtlSalesAmount(0.0d);
		tc.setTtlPurchaseAmount(0.0d);
		tc.setTtlQuantity(0.0d);
		for (TradeContractItem item : tc.getItems()) {

			if (item.getQuantity() == null) {
				item.setQuantity(0.0d);
			}

			if (item.getSalesAmount() == null) {
				item.setSalesAmount(0.0d);
			}

			if (item.getPurchaseAmount() == null) {
				item.setPurchaseAmount(0.0d);
			}

			tc.setTtlQuantity(tc.getTtlQuantity() + item.getQuantity());
			tc.setUnit(item.getUnit());
			tc.setTtlSalesAmount(tc.getTtlSalesAmount() + item.getSalesAmount());
			tc.setTtlPurchaseAmount(tc.getTtlPurchaseAmount()
					+ item.getPurchaseAmount());
		}
		tc.setSalesAmtInWords(AmtInChsWords.convertMoney(tc.getTtlSalesAmount()));
		tc.setPurchaseAmtInWords(AmtInChsWords.convertMoney(tc
				.getTtlPurchaseAmount()));
		DefaultProcessor processor = new DefaultProcessor();

		tc.setPurchaseAmtInEnWords(processor.getName(tc.getTtlPurchaseAmount()));
	}

	public Result generateDocument(String userName, String password,
			TradeContract tradeContract, String salesTemplateName,
			String purchaseTemplateName) throws SerialException, SQLException {
		Result result = new Result();
		boolean b = oAService.checkAuthByLdap(userName, password);
		if (!b) {
			result.setMsg("\u7528\u6237\u540D\u5BC6\u7801\u9519\u8BEF"); // user
																			// auth
																			// failed
			result.setResult(-1);
			return result;
		}

		if (checkWorkflowExists(tradeContract.getContractNo())) {

			result.setMsg("\u4E0D\u80FD\u91CD\u590D\u542F\u52A8\u5408\u540C\u5BA1\u6279\u6D41\u7A0B\uFF0C\u8BF7\u5148\u5220\u9664\u4E4B\u524D\u7684\u6D41\u7A0B\u3002");

			// Workflow has been started!
			result.setResult(-2);
			return result;
		}

		List<TradeContract> tcs = TradeContract
				.findTradeContractsByContractNoEquals(
						tradeContract.getContractNo()).getResultList();
		if (tcs.size() > 0) {
			TradeContract tcToSave = tcs.get(0);
			tcToSave.setOaResponse(null);
			tcToSave.merge();

		}
		TradeContractWorkflow flow = new TradeContractWorkflow();
		flow.setSalesTemplateName(salesTemplateName);
		flow.setPurchaseTemplateName(purchaseTemplateName);
		flow.setTradeContract(tradeContract);
		flow.setUserName(userName);

		MessageContext msgCtxt = null;
		if (wsCtxt != null) {
			msgCtxt = wsCtxt.getMessageContext();
		}
		if (msgCtxt != null) {
			HttpServletRequest req = (HttpServletRequest) msgCtxt
					.get(MessageContext.SERVLET_REQUEST);
			flow.setDocumentServerAddress(req.getServerName() + ":"
					+ req.getServerPort());

		} else {
			flow.setDocumentServerAddress("127.0.0.1:8080");

		}

		jmsOperations.convertAndSend(flow);

		result.setResult(0);
		result.setMsg("Document has been send to Queue. Please Wait...");
		return result;
	}

	private boolean checkWorkflowExists(String contractNo) {

		TradeContract tc = getTradeContractByNo(contractNo);

		if (tc == null) {
			return false;
		}
		Integer requestId = 0;
		try {
			requestId = Integer.parseInt(tc.getOaResponse());
		} catch (NumberFormatException e) {

			return false;
		}

		if (requestId < 0) {
			return false;
		}

		return oAService.checkWorkFlowExists(requestId);

	}

	public void sendMessage(Object messageObject) {
		jmsOperations.convertAndSend(messageObject);
	}

	public byte[] makeDocFile(TradeContract tradeContract, String templateName)
			throws IOException, XDocReportException {

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		InputStream in = this.getClass().getResourceAsStream(
				"/template/" + templateName + ".docx");
		// InputStreamReader in2 = new InputStreamReader(in, "UTF-8");

		IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in,
				TemplateEngineKind.Velocity);

		IContext context = report.createContext();

		context.put("tradeContract", tradeContract);
		context.put("date", new DateTool());

		context.put("englishLocale", java.util.Locale.ENGLISH);
		// DateTool date = new DateTool();

		logger.debug("yyyy-MM-dd", new Date());

		context.put("numberTool", new NumberTool());
		// OutputStream outdisk = new FileOutputStream(new File("处理过的合同-"
		// + templateName + ".docx"));

		report.process(context, out);

		// out.writeTo(outdisk);
		return out.toByteArray();

	}

	public TradeContract getTradeContractByNo(String contractNo) {

		TradeContract tradeContract = null;

		try {
			tradeContract = TradeContract.findTradeContractsByContractNoEquals(
					contractNo).getSingleResult();
		} catch (Exception e) {

		}
		return tradeContract;
	}

	public void processMessage(TradeContractWorkflow flow)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {

		TradeContract tradeContract = flow.getTradeContract();
		String salesTemplateName = flow.getSalesTemplateName();
		String purchaseTemplateName = flow.getPurchaseTemplateName();

		Result result = new Result();

		List<TradeContract> tcs = TradeContract
				.findTradeContractsByContractNoEquals(
						tradeContract.getContractNo()).getResultList();
		TradeContract tcToSave;
		if (tcs.size() > 0) {
			tcToSave = tcs.get(0);
		} else {
			tcToSave = new TradeContract();
		}
		tradeContract.copyTo(tcToSave);

		fillTcField(tcToSave);
		result.setResult(1);
		result.setMsg("success!");
		try {
			tcToSave.setSalesDoc(makeDocFile(tcToSave, salesTemplateName));
			tcToSave.setPurchaseDoc(makeDocFile(tcToSave, purchaseTemplateName));

		} catch (IOException e) {
			e.printStackTrace();
			result.setResult(0);
			result.setMsg(e.getMessage());
			logger.error(e.getMessage());
		} catch (XDocReportException e) {
			e.printStackTrace();
			result.setResult(0);
			result.setMsg(e.getMessage());
			logger.error(e.getMessage());
		}

		tcToSave = tcToSave.merge();

		startContractAduitWorkflow(flow.getUserName(), tcToSave,
				flow.getDocumentServerAddress());

		tcToSave.merge();

		logger.info("start workfolow for contract "
				+ tradeContract.getContractNo());

	}

	public Integer startContractAduitWorkflow(String userName,
			TradeContract tradeContract, String documentServerAddress) {
		RequestService service = new RequestService();
		RequestServicePortType port = service.getRequestServiceHttpPort();
		ObjectFactory objFactory = new ObjectFactory();
		RequestInfo in0 = new RequestInfo();
		String creatorid = oAService.getOAUserId(userName).toString();
		in0.setCreatorid(objFactory.createRequestInfoCreatorid(creatorid));
		in0.setWorkflowid(objFactory.createRequestInfoWorkflowid("383"));

		DecimalFormat df = new DecimalFormat("#,##0.00");

		in0.setDescription(objFactory
				.createRequestInfoDescription(tradeContract.getCompanyCode()
						+ " " + tradeContract.getPurchaseGroup() + " "
						+ df.format(tradeContract.getTtlQuantity())
						+ tradeContract.getUnit()));
		in0.setRequestlevel(objFactory.createRequestInfoRequestlevel("0"));// 紧急程度
		in0.setRemindtype(objFactory.createRequestInfoRemindtype("0"));// 提醒类型

		MainTableInfo mainTable = new MainTableInfo();

		ArrayOfProperty properties = objFactory.createArrayOfProperty();

		properties.getProperty().add(makeProperty("sqrzjbr", creatorid));
		properties.getProperty().add(
				makeProperty("ztc", tradeContract.getExternalNo()));
		properties.getProperty().add(
				makeProperty("kh", tradeContract.getSupplier()));
		properties.getProperty().add(
				makeProperty("zje", tradeContract.getTtlPurchaseAmount()
						.toString()));

		properties.getProperty().add(
				makeProperty("BB", oAService.getOACurrencyId(tradeContract
						.getPurchaseCurrency())));

		properties.getProperty().add(makeProperty("hqfs", creatorid));
		properties.getProperty().add(
				makeProperty("title", tradeContract.getExternalNo()));

		properties.getProperty().add(
				makeProperty("dept", oAService.getOAUserDept(userName)
						.toString()));
		properties.getProperty().add(
				makeProperty("corp", oAService.getOAUserCorp(userName)
						.toString()));

		properties
				.getProperty()
				.add(makeProperty(
						"appfj",
						"http://"
								+ documentServerAddress
								+ "/soabus/contract/downloadtxt?type=purchase&contractno="
								+ tradeContract.getContractNo(), "http:"
								+ tradeContract.getContractNo()
								+ "-\u91C7\u8D2D.docx"));

		properties
				.getProperty()
				.add(makeProperty("appfj", "http://" + documentServerAddress
						+ "/soabus/contract/downloadtxt?type=sales&contractno="
						+ tradeContract.getContractNo(), "http:"
						+ tradeContract.getContractNo() + "-\u9500\u552E.docx"));

		properties.getProperty().add(
				makeProperty(
						"ptxz",
						oAService.getOADomainValue("7869",
								tradeContract.getCompanyCode())));

		mainTable.setProperty(objFactory
				.createMainTableInfoProperty(properties));

		in0.setMainTableInfo(objFactory
				.createRequestInfoMainTableInfo(mainTable));

		in0.setIsNextFlow(objFactory.createRequestInfoIsNextFlow("0"));

		String r = port.createRequest(in0);

		logger.debug("call webservice result:" + r);

		// RequestInfo out2 = port.getRequest(77093);

		// JAXBElement<ArrayOfProperty> pp = out2.getMainTableInfo().getValue()
		// .getProperty();

		// ArrayOfProperty ap = pp.getValue();

		// for (Property p : ap.getProperty()) {

		// if (p.getValue().getValue().equals("")) {
		// continue;
		// }
		// logger.debug(p.getName().getValue() + ":"
		// + p.getValue().getValue());
		// }

		tradeContract.setOaResponse(r);

		return 0;
	}

	private Property makeProperty(String name, String value) {
		return makeProperty(name, value, null);

	}

	private Property makeProperty(String name, String value, String type) {

		Property p = new Property();
		ObjectFactory objFactory = new ObjectFactory();
		p.setName(objFactory.createPropertyName(name));
		p.setValue(objFactory.createPropertyValue(value));
		p.setType(objFactory.createPropertyType(type));
		return p;

	}
}
