package com.itg.soabus.contract.service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.itg.soabus.contract.common.Result;
import com.itg.soabus.contract.domain.TradeContract;
import com.itg.soabus.messaging.TradeContractWorkflow;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@WebService
public interface DocumentTemplateService {

	@WebMethod(operationName = "generateDocument")
	public Result generateDocument(String userName, String password,
			TradeContract tradeContract, String salesTemplateName,
			String purchaseTemplateName) throws SerialException, SQLException;

	public void processMessage(TradeContractWorkflow flow)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException;

	public Integer startContractAduitWorkflow(String userName,
			TradeContract tradeContract, String documentServerAddress);
}
