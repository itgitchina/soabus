package com.itg.soabus.contract;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.velocity.tools.generic.DateTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.itg.soabus.contract.common.AmtInChsWords;
import com.itg.soabus.contract.common.Result;
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

@Controller
@Service
public class DocumentTemplateServiceImpl implements DocumentTemplateService {

	final Logger logger = LoggerFactory
			.getLogger(DocumentTemplateServiceImpl.class);

	@Autowired
	private transient JmsOperations jmsOperations;

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Resource(name = "wsContext")
	private WebServiceContext wsCtxt;

	@RequestMapping("/downloadcontracttxt.doc")
	public @ResponseBody
	ResponseEntity<byte[]> downloadContractTxt(
			@RequestParam(value = "contractno", required = true) String contractNo,
			HttpServletResponse response) throws IOException {

		response.setContentType("application/x-msword");

		List<TradeContract> tcs = TradeContract
				.findTradeContractsByContractNoEquals(contractNo)
				.getResultList();

		HttpHeaders headers = new HttpHeaders();
		if (tcs.size() == 0) {

			headers.add("Content-Type", "text/html; charset=utf-8");
			return new ResponseEntity<byte[]>(null, headers,
					HttpStatus.NOT_FOUND);

		}

		TradeContract tc = tcs.get(0);

		InputStream is = new ByteArrayInputStream(tc.getDoc());

		headers.setContentLength(tc.getDoc().length);

		headers.add("Content-Disposition",
				"attachment; filename=\"" + tc.getContractNo() + ".doc\"");

		return new ResponseEntity<byte[]>(tc.getDoc(), headers, HttpStatus.OK);

	}

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
			tc.setTtlSalesAmount(tc.getTtlSalesAmount() + item.getSalesAmount());
			tc.setTtlPurchaseAmount(tc.getTtlPurchaseAmount()
					+ item.getPurchaseAmount());
		}
		tc.setSalesAmtInWords(AmtInChsWords.convertMoney(tc.getTtlSalesAmount()));
		tc.setPurchaseAmtInWords(AmtInChsWords.convertMoney(tc
				.getTtlPurchaseAmount()));
	}

	public Result generateDocument(String userName, String password,
			TradeContract tradeContract, String templateName)
			throws SerialException, SQLException {
		Result result = new Result();
		boolean b = checkAuthByLdap(userName, password);
		if (!b) {
			result.setMsg("user auth failed");
			result.setResult(1);
			return result;
		}
		TradeContractWorkflow flow = new TradeContractWorkflow();
		flow.setTemplateName(templateName);
		flow.setTradeContract(tradeContract);
		flow.setUserName(userName);

		MessageContext msgCtxt = wsCtxt.getMessageContext();
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

	private Boolean checkAuthByLdap(String username, String password) {
		Hashtable<String, String> env = new Hashtable<String, String>(11);
		boolean b = false;
		env.put(Context.INITIAL_CONTEXT_FACTORY,
				"com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://itgpdc.itg.net:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.REFERRAL, "follow");

		if (!username.contains("@itg.net")) {
			username = username.concat("@itg.net");
		}
		env.put(Context.SECURITY_PRINCIPAL, username);
		env.put(Context.SECURITY_CREDENTIALS, password);
		try {
			DirContext ctx = new InitialDirContext(env);
			b = true;
			ctx.close();
			logger.info("user " + username + " successful checked!");
		} catch (NamingException e) {
			b = false;
			logger.error("user " + username + e.getMessage());
		}
		return b;
	}

	public void sendMessage(Object messageObject) {
		jmsOperations.convertAndSend(messageObject);
	}

	public void processMessage(TradeContractWorkflow flow) {

		TradeContract tradeContract = flow.getTradeContract();
		String templateName = flow.getTemplateName();

		Result result = new Result();

		try {
			InputStream in = this.getClass().getResourceAsStream(
					"/template/" + templateName + ".docx");
			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(
					in, TemplateEngineKind.Velocity);
			IContext context = report.createContext();
			fillTcField(tradeContract);
			context.put("tradeContract", tradeContract);
			context.put("date", new DateTool());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			OutputStream outdisk = new FileOutputStream(new File("处理过的合同.docx"));
			report.process(context, out);
			outdisk.write(out.toByteArray());
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
			tcToSave.setDoc(out.toByteArray());

			result.setResult(1);
			result.setMsg("success!");

			startContractAduitWorkflow(flow.getUserName(), tcToSave,
					flow.getDocumentServerAddress());
			tcToSave.merge();
			logger.info("start workfolow for contract "
					+ tradeContract.getContractNo());
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

	}

	public Integer startContractAduitWorkflow(String userName,
			TradeContract tradeContract, String documentServerAddress) {
		RequestService service = new RequestService();
		RequestServicePortType port = service.getRequestServiceHttpPort();
		ObjectFactory objFactory = new ObjectFactory();
		RequestInfo in0 = new RequestInfo();
		String creatorid = getOAUserId(userName).toString();
		in0.setCreatorid(objFactory.createRequestInfoCreatorid(creatorid));
		in0.setWorkflowid(objFactory.createRequestInfoWorkflowid("383"));

		in0.setDescription(objFactory
				.createRequestInfoDescription(tradeContract.getExternalNo()));
		in0.setRequestlevel(objFactory.createRequestInfoRequestlevel("0"));// 紧急程度
		in0.setRemindtype(objFactory.createRequestInfoRemindtype("0"));// 提醒类型

		MainTableInfo mainTable = new MainTableInfo();

		ArrayOfProperty properties = objFactory.createArrayOfProperty();

		// properties.getProperty().add(makeProperty("syr", creatorid));
		// properties.getProperty().add(makeProperty("appMan", creatorid));

		properties.getProperty().add(makeProperty("sqrzjbr", creatorid));
		properties.getProperty().add(
				makeProperty("ztc", tradeContract.getExternalNo()));
		properties.getProperty().add(
				makeProperty("kh", tradeContract.getSupplier()));
		properties.getProperty().add(
				makeProperty("zje", tradeContract.getTtlPurchaseAmount()
						.toString()));

		String bb = port.getPropValue("BB", "USD");
		logger.debug(bb);
		properties.getProperty().add(makeProperty("BB", "2"));

		properties.getProperty().add(makeProperty("hqfs", creatorid));
		properties.getProperty().add(
				makeProperty("title", tradeContract.getExternalNo()));

		properties.getProperty().add(makeProperty("dept", "12"));
		properties.getProperty().add(makeProperty("corp", "1"));

		properties.getProperty().add(
				makeProperty("appfj", "http://" + documentServerAddress
						+ "/soabus/downloadcontracttxt.doc?contractno="
						+ tradeContract.getContractNo(), "http:"
						+ tradeContract.getContractNo() + ".doc"));

		properties.getProperty().add(makeProperty("ptxz", "0"));
		// properties.getProperty().add(makeProperty("content", "1000"));

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

	private Integer getOAUserId(String userName) {

		Map<String, String> paramMap = new HashMap<String, String>();
		if (userName.contains("@itg.net")) {
			userName = userName.replace("@itg.net", "");
		}
		paramMap.put("loginid", userName);

		Integer loginId = jdbcTemplate.query(
				"select id, loginid from hrmresource where loginid=:loginid",
				paramMap, new ResultSetExtractor<Integer>() {

					@Override
					public Integer extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						Integer loginId = -1;
						if (rs.next()) {
							loginId = rs.getInt(1);
						}
						return loginId;
					}

				});

		if (loginId == -1) {
			logger.error("Can't find user " + userName
					+ "'s OA login id, start workflow fail!!");
		}
		return loginId;

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
