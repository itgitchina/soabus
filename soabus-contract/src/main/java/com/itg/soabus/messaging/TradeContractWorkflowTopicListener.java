package com.itg.soabus.messaging;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
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

import com.itg.soabus.contract.common.AmtInChsWords;
import com.itg.soabus.contract.common.Result;
import com.itg.soabus.contract.domain.TradeContract;
import com.itg.soabus.contract.domain.TradeContractItem;
import com.itg.soabus.contract.service.DocumentTemplateService;
import com.itg.soabus.contract.service.DocumentTemplateServiceImpl;
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
	private DocumentTemplateService documentTemplateService;

	public void onMessage(Object message) throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		// System.out.println("JMS message received: " + message);
		logger.info(message.toString());

		TradeContractWorkflow flow = (TradeContractWorkflow) message;
		documentTemplateService.processMessage(flow);

	}

}
