package com.itg.soabus.logistic.service;

import java.util.Date;
import java.text.DecimalFormat;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import weaver.soa.workflow.request.ArrayOfCell;
import weaver.soa.workflow.request.ArrayOfDetailTable;
import weaver.soa.workflow.request.ArrayOfProperty;
import weaver.soa.workflow.request.ArrayOfRow;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.DetailTableInfo;
import weaver.soa.workflow.request.MainTableInfo;
import weaver.soa.workflow.request.ObjectFactory;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;

import com.ibm.icu.text.SimpleDateFormat;
import com.itg.soabus.common.OAService;
import com.itg.soabus.common.Result;
import com.itg.soabus.logistic.domain.SupplierAppInfo;
import com.itg.soabus.logistic.domain.SupplierProperty;
import com.itg.soabus.oaservice.RequestService;
import com.itg.soabus.oaservice.RequestServicePortType;

public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private OAService oaService;

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Result apply(String userName, String password,
			SupplierAppInfo supplierAppInfo) {

		Result result = new Result();
		if (checkWorkFlowExists(supplierAppInfo)) {
			result.setResult(-1);
			// result.setMsg("流程已经存在！");
			return result;
		}

		result = startSupplierAppWorkflow(userName, password, supplierAppInfo);
		supplierAppInfo.merge();
		result.setResult(0);
		result.setMsg("success!");
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
		in0.setWorkflowid(objFactory.createRequestInfoWorkflowid("425"));

		in0.setDescription(objFactory.createRequestInfoDescription(getProperty(
				supplierAppInfo.getProperties(), "供应商")));
		in0.setRequestlevel(objFactory.createRequestInfoRequestlevel("0"));// 紧急程度
		in0.setRemindtype(objFactory.createRequestInfoRemindtype("0"));// 提醒类型

		MainTableInfo mainTable = new MainTableInfo();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		ArrayOfProperty properties = objFactory.createArrayOfProperty();

		properties.getProperty().add(
				oaService.makeProperty("ernam", creatorid));
		properties.getProperty().add(
				oaService.makeProperty("sqrq", sdf.format(new Date())));
		properties.getProperty().add(
				oaService.makeProperty("ergrp",
						oaService.getOAUserDept(userName).toString()));

		mainTable.setProperty(objFactory
				.createMainTableInfoProperty(properties));

		in0.setMainTableInfo(objFactory
				.createRequestInfoMainTableInfo(mainTable));

		in0.setIsNextFlow(objFactory.createRequestInfoIsNextFlow("0"));

		ArrayOfRow rows = objFactory.createArrayOfRow();

		for (SupplierProperty p : supplierAppInfo.getProperties()) {
			Row row = objFactory.createRow();
			ArrayOfCell cells = objFactory.createArrayOfCell();
			cells.getCell().add(oaService.makeCell("MC", p.getName()));
			cells.getCell().add(oaService.makeCell("NR", p.getValue()));
			row.setCell(objFactory.createRowCell(cells));
			rows.getRow().add(row);

		}

		ArrayOfDetailTable arrayDetailTable = objFactory
				.createArrayOfDetailTable();
		DetailTable detailTable = objFactory.createDetailTable();

		arrayDetailTable.getDetailTable().add(detailTable);

		detailTable.setId(objFactory.createDetailTableId("1"));
		detailTable.setRow(objFactory.createDetailTableRow(rows));

		DetailTableInfo detailTableInfo = objFactory.createDetailTableInfo();
		detailTableInfo.setDetailTable(objFactory
				.createDetailTableInfoDetailTable(arrayDetailTable));

		in0.setDetailTableInfo(objFactory
				.createRequestInfoDetailTableInfo(detailTableInfo));

		String r = port.createRequest(in0);

		supplierAppInfo.setOaResponse(r);

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
