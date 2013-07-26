package com.itg.soabus.logistic.service;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import weaver.soa.workflow.request.ArrayOfProperty;
import weaver.soa.workflow.request.MainTableInfo;
import weaver.soa.workflow.request.ObjectFactory;
import weaver.soa.workflow.request.RequestInfo;

import com.itg.soabus.common.OAService;
import com.itg.soabus.common.Result;
import com.itg.soabus.logistic.domain.SupplierAppInfo;
import com.itg.soabus.logistic.domain.SupplierProperty;
import com.itg.soabus.oaservice.RequestService;
import com.itg.soabus.oaservice.RequestServicePortType;

public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private OAService oaService;

	@Override
	public Result apply(String userName, String password,
			SupplierAppInfo supplierAppInfo) {

		Result result = new Result();
		if (checkWorkFlowExists(supplierAppInfo)) {
			result.setResult(-1);
			result.setMsg("流程已经存在！");
			return result;
		}

		result = startSupplierAppWorkflow(userName, password, supplierAppInfo);
		return result;

	}

	private String getProperty(List<SupplierProperty> properties,
			String propertyName) {

		for (SupplierProperty p : properties) {
			if (p.getName().equals(propertyName)) {
				return p.getValue();
			}
		}

		return null;
	}

	public Result startSupplierAppWorkflow(String userName, String password,
			SupplierAppInfo supplierAppInfo) {

		RequestService service = new RequestService();
		RequestServicePortType port = service.getRequestServiceHttpPort();
		ObjectFactory objFactory = new ObjectFactory();
		RequestInfo in0 = new RequestInfo();
		String creatorid = oaService.getOAUserId(userName).toString();
		in0.setCreatorid(objFactory.createRequestInfoCreatorid(creatorid));
		in0.setWorkflowid(objFactory.createRequestInfoWorkflowid("383"));


		in0.setDescription(objFactory.createRequestInfoDescription(getProperty(
				supplierAppInfo.getProperties(), "供应商")));
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
				makeProperty("BB", oaService.getOACurrencyId(tradeContract
						.getPurchaseCurrency())));

		properties.getProperty().add(makeProperty("hqfs", creatorid));
		properties.getProperty().add(
				makeProperty("title", tradeContract.getExternalNo()));

		properties.getProperty().add(
				makeProperty("dept", oaService.getOAUserDept(userName)
						.toString()));
		properties.getProperty().add(
				makeProperty("corp", oaService.getOAUserCorp(userName)
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
						oaService.getOADomainValue("7869",
								tradeContract.getCompanyCode())));

		mainTable.setProperty(objFactory
				.createMainTableInfoProperty(properties));

		in0.setMainTableInfo(objFactory
				.createRequestInfoMainTableInfo(mainTable));

		in0.setIsNextFlow(objFactory.createRequestInfoIsNextFlow("0"));

		String r = port.createRequest(in0);

		logger.debug("call webservice result:" + r);

		
		return null;

	}

	public boolean checkWorkFlowExists(SupplierAppInfo supplierAppInfo) {

		SupplierAppInfo app = SupplierAppInfo
				.findSupplierAppInfo(supplierAppInfo.getKey());
		if (app == null) {
			return false;
		}
		Integer requestId = 0;
		try {
			requestId = Integer.parseInt(app.getOaResponse());
		} catch (NumberFormatException e) {

			return false;
		}

		if (requestId < 0) {
			return false;
		}

		return oaService.checkWorkFlowExists(requestId);

	}

}
