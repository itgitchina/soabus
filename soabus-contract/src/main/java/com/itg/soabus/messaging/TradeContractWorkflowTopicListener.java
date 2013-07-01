package com.itg.soabus.messaging;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import org.apache.velocity.tools.generic.DateTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import weaver.soa.workflow.request.ArrayOfLog;
import weaver.soa.workflow.request.ArrayOfProperty;
import weaver.soa.workflow.request.Log;
import weaver.soa.workflow.request.MainTableInfo;
import weaver.soa.workflow.request.ObjectFactory;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.RequestLog;

import com.itg.soabus.contract.DocumentTemplateServiceImpl;
import com.itg.soabus.contract.common.AmtInChsWords;
import com.itg.soabus.contract.common.Result;
import com.itg.soabus.contract.domain.TradeContract;
import com.itg.soabus.contract.domain.TradeContractItem;
import com.itg.soabus.oaservice.RequestService;
import com.itg.soabus.oaservice.RequestServicePortType;

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;

public class TradeContractWorkflowTopicListener {

	final Logger logger = LoggerFactory
			.getLogger(TradeContractWorkflowTopicListener.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public void onMessage(Object message) {
		// System.out.println("JMS message received: " + message);
		logger.info(message.toString());

		TradeContractWorkflow flow = (TradeContractWorkflow) message;

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

		properties.getProperty().add(makeProperty("BB", "2"));

		properties.getProperty().add(makeProperty("hqfs", creatorid));
		properties.getProperty().add(
				makeProperty("title", tradeContract.getExternalNo()));

		properties.getProperty().add(makeProperty("dept", "12"));
		properties.getProperty().add(makeProperty("corp", "1"));

		properties.getProperty().add(
				makeProperty("appfj", "http://" + documentServerAddress
						+ "/soabus/downloadcontracttxt.doc?contractno="
						+ tradeContract.getContractNo()));

		properties.getProperty().add(makeProperty("ptxz", "0"));
		// properties.getProperty().add(makeProperty("content", "1000"));

		mainTable.setProperty(objFactory
				.createMainTableInfoProperty(properties));

		in0.setMainTableInfo(objFactory
				.createRequestInfoMainTableInfo(mainTable));

		in0.setIsNextFlow(objFactory.createRequestInfoIsNextFlow("0"));

		String r = port.createRequest(in0);

		logger.debug("call webservice result:" + r);
		//RequestInfo out2 = port.getRequest(77079);

		//JAXBElement<ArrayOfProperty> pp = out2.getMainTableInfo().getValue()
		//		.getProperty();

		//ArrayOfProperty ap = pp.getValue();

		//for (Property p : ap.getProperty()) {

		//	if (p.getValue().getValue().equals("")) {
		//		continue;
		//	}
		//	System.out.println(p.getName().getValue() + ":"
		//			+ p.getValue().getValue());
		//}

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

		Property p = new Property();
		ObjectFactory objFactory = new ObjectFactory();
		p.setName(objFactory.createPropertyName(name));
		p.setValue(objFactory.createPropertyValue(value));
		return p;

	}
}
