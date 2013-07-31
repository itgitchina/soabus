/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.itg.soabus.oaservice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.5 2013-06-26T12:48:16.022+08:00
 * Generated source version: 2.7.5
 * 
 */

@javax.jws.WebService(serviceName = "RequestService", portName = "RequestServiceHttpPort", targetNamespace = "http://localhost/services/RequestService", wsdlLocation = "http://oa.itg.net/services/RequestService?wsdl", endpointInterface = "com.itg.soabus.oaservice.RequestServicePortType")
public class RequestServicePortTypeImpl implements RequestServicePortType {

	private static final Logger LOG = Logger
			.getLogger(RequestServicePortTypeImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itg.soabus.oaservice.RequestServicePortType#nextNodeByReject(int
	 * in0 ,)int in1 ,)java.lang.String in2 )*
	 */
	public boolean nextNodeByReject(int in0, int in1, java.lang.String in2) {
		LOG.info("Executing operation nextNodeByReject");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		try {
			boolean _return = true;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#writeLog(java.lang.Object
	 * in0 )*
	 */
	public void writeLog(java.lang.Object in0) {
		LOG.info("Executing operation writeLog");
		System.out.println(in0);
		try {
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itg.soabus.oaservice.RequestServicePortType#getRequest(int in0
	 * )*
	 */
	public weaver.soa.workflow.request.RequestInfo getRequest(int in0) {
		LOG.info("Executing operation getRequest");
		System.out.println(in0);
		try {
			weaver.soa.workflow.request.RequestInfo _return = new weaver.soa.workflow.request.RequestInfo();
			javax.xml.bind.JAXBElement<java.lang.String> _returnCreatorid = null;
			_return.setCreatorid(_returnCreatorid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnDescription = null;
			_return.setDescription(_returnDescription);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.DetailTableInfo> _returnDetailTableInfo = null;
			_return.setDetailTableInfo(_returnDetailTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnHostid = null;
			_return.setHostid(_returnHostid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnIsNextFlow = null;
			_return.setIsNextFlow(_returnIsNextFlow);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLastoperator = null;
			_return.setLastoperator(_returnLastoperator);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.MainTableInfo> _returnMainTableInfo = null;
			_return.setMainTableInfo(_returnMainTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRemindtype = null;
			_return.setRemindtype(_returnRemindtype);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.RequestLog> _returnRequestLog = null;
			_return.setRequestLog(_returnRequestLog);
			javax.xml.bind.JAXBElement<weaver.workflow.request.RequestManager> _returnRequestManager = null;
			_return.setRequestManager(_returnRequestManager);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestid = null;
			_return.setRequestid(_returnRequestid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestlevel = null;
			_return.setRequestlevel(_returnRequestlevel);
			javax.xml.bind.JAXBElement<weaver.conn.RecordSetTrans> _returnRsTrans = null;
			_return.setRsTrans(_returnRsTrans);
			javax.xml.bind.JAXBElement<java.lang.String> _returnWorkflowid = null;
			_return.setWorkflowid(_returnWorkflowid);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getHendledRequestBySearch
	 * (int in0 ,)java.lang.String in1 ,)java.lang.String in2 ,)java.lang.String
	 * in3 )*
	 */
	public weaver.soa.workflow.request.ArrayOfRequestBase getHendledRequestBySearch(
			int in0, java.lang.String in1, java.lang.String in2,
			java.lang.String in3) {
		LOG.info("Executing operation getHendledRequestBySearch");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		try {
			weaver.soa.workflow.request.ArrayOfRequestBase _return = new weaver.soa.workflow.request.ArrayOfRequestBase();
			java.util.List<weaver.soa.workflow.request.RequestBase> _returnRequestBase = new java.util.ArrayList<weaver.soa.workflow.request.RequestBase>();
			weaver.soa.workflow.request.RequestBase _returnRequestBaseVal1 = new weaver.soa.workflow.request.RequestBase();
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CreateTime = null;
			_returnRequestBaseVal1
					.setCreateTime(_returnRequestBaseVal1CreateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creater = null;
			_returnRequestBaseVal1.setCreater(_returnRequestBaseVal1Creater);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creatertype = null;
			_returnRequestBaseVal1
					.setCreatertype(_returnRequestBaseVal1Creatertype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeId = null;
			_returnRequestBaseVal1
					.setCurrentNodeId(_returnRequestBaseVal1CurrentNodeId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeType = null;
			_returnRequestBaseVal1
					.setCurrentNodeType(_returnRequestBaseVal1CurrentNodeType);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperateTime = null;
			_returnRequestBaseVal1
					.setLastOperateTime(_returnRequestBaseVal1LastOperateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperator = null;
			_returnRequestBaseVal1
					.setLastOperator(_returnRequestBaseVal1LastOperator);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperatortype = null;
			_returnRequestBaseVal1
					.setLastOperatortype(_returnRequestBaseVal1LastOperatortype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestId = null;
			_returnRequestBaseVal1
					.setRequestId(_returnRequestBaseVal1RequestId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestName = null;
			_returnRequestBaseVal1
					.setRequestName(_returnRequestBaseVal1RequestName);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1WorkflowId = null;
			_returnRequestBaseVal1
					.setWorkflowId(_returnRequestBaseVal1WorkflowId);
			_returnRequestBase.add(_returnRequestBaseVal1);
			_return.getRequestBase().addAll(_returnRequestBase);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getRequest3(weaver.workflow
	 * .request.RequestManager in0 ,)int in1 )*
	 */
	public weaver.soa.workflow.request.RequestInfo getRequest3(
			weaver.workflow.request.RequestManager in0, int in1) {
		LOG.info("Executing operation getRequest3");
		System.out.println(in0);
		System.out.println(in1);
		try {
			weaver.soa.workflow.request.RequestInfo _return = new weaver.soa.workflow.request.RequestInfo();
			javax.xml.bind.JAXBElement<java.lang.String> _returnCreatorid = null;
			_return.setCreatorid(_returnCreatorid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnDescription = null;
			_return.setDescription(_returnDescription);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.DetailTableInfo> _returnDetailTableInfo = null;
			_return.setDetailTableInfo(_returnDetailTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnHostid = null;
			_return.setHostid(_returnHostid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnIsNextFlow = null;
			_return.setIsNextFlow(_returnIsNextFlow);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLastoperator = null;
			_return.setLastoperator(_returnLastoperator);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.MainTableInfo> _returnMainTableInfo = null;
			_return.setMainTableInfo(_returnMainTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRemindtype = null;
			_return.setRemindtype(_returnRemindtype);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.RequestLog> _returnRequestLog = null;
			_return.setRequestLog(_returnRequestLog);
			javax.xml.bind.JAXBElement<weaver.workflow.request.RequestManager> _returnRequestManager = null;
			_return.setRequestManager(_returnRequestManager);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestid = null;
			_return.setRequestid(_returnRequestid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestlevel = null;
			_return.setRequestlevel(_returnRequestlevel);
			javax.xml.bind.JAXBElement<weaver.conn.RecordSetTrans> _returnRsTrans = null;
			_return.setRsTrans(_returnRsTrans);
			javax.xml.bind.JAXBElement<java.lang.String> _returnWorkflowid = null;
			_return.setWorkflowid(_returnWorkflowid);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#createRequest(weaver.
	 * soa.workflow.request.RequestInfo in0 )*
	 */
	public java.lang.String createRequest(
			weaver.soa.workflow.request.RequestInfo in0) {
		LOG.info("Executing operation createRequest");
		System.out.println(in0);
		try {
			java.lang.String _return = "_return731834151";
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getRequestLogs(java.lang
	 * .String in0 ,)int in1 ,)int in2 )*
	 */
	public weaver.soa.workflow.request.ArrayOfLog getRequestLogs(
			java.lang.String in0, int in1, int in2) {
		LOG.info("Executing operation getRequestLogs");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		try {
			weaver.soa.workflow.request.ArrayOfLog _return = new weaver.soa.workflow.request.ArrayOfLog();
			java.util.List<weaver.soa.workflow.request.Log> _returnLog = new java.util.ArrayList<weaver.soa.workflow.request.Log>();
			weaver.soa.workflow.request.Log _returnLogVal1 = new weaver.soa.workflow.request.Log();
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Agentorbyagentid = null;
			_returnLogVal1.setAgentorbyagentid(_returnLogVal1Agentorbyagentid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Agenttype = null;
			_returnLogVal1.setAgenttype(_returnLogVal1Agenttype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Annexdocids = null;
			_returnLogVal1.setAnnexdocids(_returnLogVal1Annexdocids);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Comment = null;
			_returnLogVal1.setComment(_returnLogVal1Comment);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Id = null;
			_returnLogVal1.setId(_returnLogVal1Id);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Node = null;
			_returnLogVal1.setNode(_returnLogVal1Node);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Nodeid = null;
			_returnLogVal1.setNodeid(_returnLogVal1Nodeid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Opdate = null;
			_returnLogVal1.setOpdate(_returnLogVal1Opdate);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Operator = null;
			_returnLogVal1.setOperator(_returnLogVal1Operator);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Operatordept = null;
			_returnLogVal1.setOperatordept(_returnLogVal1Operatordept);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Operatorid = null;
			_returnLogVal1.setOperatorid(_returnLogVal1Operatorid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Operatortype = null;
			_returnLogVal1.setOperatortype(_returnLogVal1Operatortype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Optime = null;
			_returnLogVal1.setOptime(_returnLogVal1Optime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Optype = null;
			_returnLogVal1.setOptype(_returnLogVal1Optype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Receiver = null;
			_returnLogVal1.setReceiver(_returnLogVal1Receiver);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1RequestLogId = null;
			_returnLogVal1.setRequestLogId(_returnLogVal1RequestLogId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Signdocids = null;
			_returnLogVal1.setSigndocids(_returnLogVal1Signdocids);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLogVal1Signworkflowids = null;
			_returnLogVal1.setSignworkflowids(_returnLogVal1Signworkflowids);
			_returnLog.add(_returnLogVal1);
			_return.getLog().addAll(_returnLog);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getRequest1(weaver.workflow
	 * .request.RequestManager in0 )*
	 */
	public weaver.soa.workflow.request.RequestInfo getRequest1(
			weaver.workflow.request.RequestManager in0) {
		LOG.info("Executing operation getRequest1");
		System.out.println(in0);
		try {
			weaver.soa.workflow.request.RequestInfo _return = new weaver.soa.workflow.request.RequestInfo();
			javax.xml.bind.JAXBElement<java.lang.String> _returnCreatorid = null;
			_return.setCreatorid(_returnCreatorid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnDescription = null;
			_return.setDescription(_returnDescription);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.DetailTableInfo> _returnDetailTableInfo = null;
			_return.setDetailTableInfo(_returnDetailTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnHostid = null;
			_return.setHostid(_returnHostid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnIsNextFlow = null;
			_return.setIsNextFlow(_returnIsNextFlow);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLastoperator = null;
			_return.setLastoperator(_returnLastoperator);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.MainTableInfo> _returnMainTableInfo = null;
			_return.setMainTableInfo(_returnMainTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRemindtype = null;
			_return.setRemindtype(_returnRemindtype);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.RequestLog> _returnRequestLog = null;
			_return.setRequestLog(_returnRequestLog);
			javax.xml.bind.JAXBElement<weaver.workflow.request.RequestManager> _returnRequestManager = null;
			_return.setRequestManager(_returnRequestManager);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestid = null;
			_return.setRequestid(_returnRequestid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestlevel = null;
			_return.setRequestlevel(_returnRequestlevel);
			javax.xml.bind.JAXBElement<weaver.conn.RecordSetTrans> _returnRsTrans = null;
			_return.setRsTrans(_returnRsTrans);
			javax.xml.bind.JAXBElement<java.lang.String> _returnWorkflowid = null;
			_return.setWorkflowid(_returnWorkflowid);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getProcessedRequestBySearch
	 * (int in0 ,)java.lang.String in1 ,)java.lang.String in2 ,)java.lang.String
	 * in3 )*
	 */
	public weaver.soa.workflow.request.ArrayOfRequestBase getProcessedRequestBySearch(
			int in0, java.lang.String in1, java.lang.String in2,
			java.lang.String in3) {
		LOG.info("Executing operation getProcessedRequestBySearch");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		try {
			weaver.soa.workflow.request.ArrayOfRequestBase _return = new weaver.soa.workflow.request.ArrayOfRequestBase();
			java.util.List<weaver.soa.workflow.request.RequestBase> _returnRequestBase = new java.util.ArrayList<weaver.soa.workflow.request.RequestBase>();
			weaver.soa.workflow.request.RequestBase _returnRequestBaseVal1 = new weaver.soa.workflow.request.RequestBase();
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CreateTime = null;
			_returnRequestBaseVal1
					.setCreateTime(_returnRequestBaseVal1CreateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creater = null;
			_returnRequestBaseVal1.setCreater(_returnRequestBaseVal1Creater);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creatertype = null;
			_returnRequestBaseVal1
					.setCreatertype(_returnRequestBaseVal1Creatertype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeId = null;
			_returnRequestBaseVal1
					.setCurrentNodeId(_returnRequestBaseVal1CurrentNodeId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeType = null;
			_returnRequestBaseVal1
					.setCurrentNodeType(_returnRequestBaseVal1CurrentNodeType);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperateTime = null;
			_returnRequestBaseVal1
					.setLastOperateTime(_returnRequestBaseVal1LastOperateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperator = null;
			_returnRequestBaseVal1
					.setLastOperator(_returnRequestBaseVal1LastOperator);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperatortype = null;
			_returnRequestBaseVal1
					.setLastOperatortype(_returnRequestBaseVal1LastOperatortype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestId = null;
			_returnRequestBaseVal1
					.setRequestId(_returnRequestBaseVal1RequestId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestName = null;
			_returnRequestBaseVal1
					.setRequestName(_returnRequestBaseVal1RequestName);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1WorkflowId = null;
			_returnRequestBaseVal1
					.setWorkflowId(_returnRequestBaseVal1WorkflowId);
			_returnRequestBase.add(_returnRequestBaseVal1);
			_return.getRequestBase().addAll(_returnRequestBase);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#nextNodeBySubmit(weaver
	 * .soa.workflow.request.RequestInfo in0 ,)int in1 ,)int in2
	 * ,)java.lang.String in3 )*
	 */
	public boolean nextNodeBySubmit(
			weaver.soa.workflow.request.RequestInfo in0, int in1, int in2,
			java.lang.String in3) {
		LOG.info("Executing operation nextNodeBySubmit");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		try {
			boolean _return = true;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getMyRequestBySearch(int
	 * in0 ,)java.lang.String in1 ,)java.lang.String in2 ,)java.lang.String in3
	 * )*
	 */
	public weaver.soa.workflow.request.ArrayOfRequestBase getMyRequestBySearch(
			int in0, java.lang.String in1, java.lang.String in2,
			java.lang.String in3) {
		LOG.info("Executing operation getMyRequestBySearch");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		try {
			weaver.soa.workflow.request.ArrayOfRequestBase _return = new weaver.soa.workflow.request.ArrayOfRequestBase();
			java.util.List<weaver.soa.workflow.request.RequestBase> _returnRequestBase = new java.util.ArrayList<weaver.soa.workflow.request.RequestBase>();
			weaver.soa.workflow.request.RequestBase _returnRequestBaseVal1 = new weaver.soa.workflow.request.RequestBase();
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CreateTime = null;
			_returnRequestBaseVal1
					.setCreateTime(_returnRequestBaseVal1CreateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creater = null;
			_returnRequestBaseVal1.setCreater(_returnRequestBaseVal1Creater);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creatertype = null;
			_returnRequestBaseVal1
					.setCreatertype(_returnRequestBaseVal1Creatertype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeId = null;
			_returnRequestBaseVal1
					.setCurrentNodeId(_returnRequestBaseVal1CurrentNodeId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeType = null;
			_returnRequestBaseVal1
					.setCurrentNodeType(_returnRequestBaseVal1CurrentNodeType);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperateTime = null;
			_returnRequestBaseVal1
					.setLastOperateTime(_returnRequestBaseVal1LastOperateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperator = null;
			_returnRequestBaseVal1
					.setLastOperator(_returnRequestBaseVal1LastOperator);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperatortype = null;
			_returnRequestBaseVal1
					.setLastOperatortype(_returnRequestBaseVal1LastOperatortype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestId = null;
			_returnRequestBaseVal1
					.setRequestId(_returnRequestBaseVal1RequestId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestName = null;
			_returnRequestBaseVal1
					.setRequestName(_returnRequestBaseVal1RequestName);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1WorkflowId = null;
			_returnRequestBaseVal1
					.setWorkflowId(_returnRequestBaseVal1WorkflowId);
			_returnRequestBase.add(_returnRequestBaseVal1);
			_return.getRequestBase().addAll(_returnRequestBase);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itg.soabus.oaservice.RequestServicePortType#getRequest2(int in0
	 * ,)int in1 )*
	 */
	public weaver.soa.workflow.request.RequestInfo getRequest2(int in0, int in1) {
		LOG.info("Executing operation getRequest2");
		System.out.println(in0);
		System.out.println(in1);
		try {
			weaver.soa.workflow.request.RequestInfo _return = new weaver.soa.workflow.request.RequestInfo();
			javax.xml.bind.JAXBElement<java.lang.String> _returnCreatorid = null;
			_return.setCreatorid(_returnCreatorid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnDescription = null;
			_return.setDescription(_returnDescription);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.DetailTableInfo> _returnDetailTableInfo = null;
			_return.setDetailTableInfo(_returnDetailTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnHostid = null;
			_return.setHostid(_returnHostid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnIsNextFlow = null;
			_return.setIsNextFlow(_returnIsNextFlow);
			javax.xml.bind.JAXBElement<java.lang.String> _returnLastoperator = null;
			_return.setLastoperator(_returnLastoperator);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.MainTableInfo> _returnMainTableInfo = null;
			_return.setMainTableInfo(_returnMainTableInfo);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRemindtype = null;
			_return.setRemindtype(_returnRemindtype);
			javax.xml.bind.JAXBElement<weaver.soa.workflow.request.RequestLog> _returnRequestLog = null;
			_return.setRequestLog(_returnRequestLog);
			javax.xml.bind.JAXBElement<weaver.workflow.request.RequestManager> _returnRequestManager = null;
			_return.setRequestManager(_returnRequestManager);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestid = null;
			_return.setRequestid(_returnRequestid);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestlevel = null;
			_return.setRequestlevel(_returnRequestlevel);
			javax.xml.bind.JAXBElement<weaver.conn.RecordSetTrans> _returnRsTrans = null;
			_return.setRsTrans(_returnRsTrans);
			javax.xml.bind.JAXBElement<java.lang.String> _returnWorkflowid = null;
			_return.setWorkflowid(_returnWorkflowid);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getPropValue(java.lang
	 * .String in0 ,)java.lang.String in1 )*
	 */
	public java.lang.String getPropValue(java.lang.String in0,
			java.lang.String in1) {
		LOG.info("Executing operation getPropValue");
		System.out.println(in0);
		System.out.println(in1);
		try {
			java.lang.String _return = "_return1417945955";
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#writeLog1(java.lang.String
	 * in0 ,)java.lang.Object in1 )*
	 */
	public void writeLog1(java.lang.String in0, java.lang.Object in1) {
		LOG.info("Executing operation writeLog1");
		System.out.println(in0);
		System.out.println(in1);
		try {
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itg.soabus.oaservice.RequestServicePortType#getRightMenu(int in0
	 * ,)int in1 ,)int in2 ,)int in3 ,)int in4 ,)boolean in5 )*
	 */
	public java.lang.String getRightMenu(int in0, int in1, int in2, int in3,
			int in4, boolean in5) {
		LOG.info("Executing operation getRightMenu");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in4);
		System.out.println(in5);
		try {
			java.lang.String _return = "_return-1773268001";
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itg.soabus.oaservice.RequestServicePortType#forwardFlow(int in0
	 * ,)int in1 ,)java.lang.String in2 ,)java.lang.String in3
	 * ,)java.lang.String in4 )*
	 */
	public boolean forwardFlow(int in0, int in1, java.lang.String in2,
			java.lang.String in3, java.lang.String in4) {
		LOG.info("Executing operation forwardFlow");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in4);
		try {
			boolean _return = true;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#getPendingRequestBySearch
	 * (int in0 ,)java.lang.String in1 ,)java.lang.String in2 ,)java.lang.String
	 * in3 )*
	 */
	public weaver.soa.workflow.request.ArrayOfRequestBase getPendingRequestBySearch(
			int in0, java.lang.String in1, java.lang.String in2,
			java.lang.String in3) {
		LOG.info("Executing operation getPendingRequestBySearch");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		try {
			weaver.soa.workflow.request.ArrayOfRequestBase _return = new weaver.soa.workflow.request.ArrayOfRequestBase();
			java.util.List<weaver.soa.workflow.request.RequestBase> _returnRequestBase = new java.util.ArrayList<weaver.soa.workflow.request.RequestBase>();
			weaver.soa.workflow.request.RequestBase _returnRequestBaseVal1 = new weaver.soa.workflow.request.RequestBase();
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CreateTime = null;
			_returnRequestBaseVal1
					.setCreateTime(_returnRequestBaseVal1CreateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creater = null;
			_returnRequestBaseVal1.setCreater(_returnRequestBaseVal1Creater);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1Creatertype = null;
			_returnRequestBaseVal1
					.setCreatertype(_returnRequestBaseVal1Creatertype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeId = null;
			_returnRequestBaseVal1
					.setCurrentNodeId(_returnRequestBaseVal1CurrentNodeId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1CurrentNodeType = null;
			_returnRequestBaseVal1
					.setCurrentNodeType(_returnRequestBaseVal1CurrentNodeType);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperateTime = null;
			_returnRequestBaseVal1
					.setLastOperateTime(_returnRequestBaseVal1LastOperateTime);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperator = null;
			_returnRequestBaseVal1
					.setLastOperator(_returnRequestBaseVal1LastOperator);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1LastOperatortype = null;
			_returnRequestBaseVal1
					.setLastOperatortype(_returnRequestBaseVal1LastOperatortype);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestId = null;
			_returnRequestBaseVal1
					.setRequestId(_returnRequestBaseVal1RequestId);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1RequestName = null;
			_returnRequestBaseVal1
					.setRequestName(_returnRequestBaseVal1RequestName);
			javax.xml.bind.JAXBElement<java.lang.String> _returnRequestBaseVal1WorkflowId = null;
			_returnRequestBaseVal1
					.setWorkflowId(_returnRequestBaseVal1WorkflowId);
			_returnRequestBase.add(_returnRequestBaseVal1);
			_return.getRequestBase().addAll(_returnRequestBase);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#nextNodeBySubmit1(weaver
	 * .soa.workflow.request.RequestInfo in0 ,)int in1 ,)int in2
	 * ,)java.lang.String in3 ,)java.lang.String in4 )*
	 */
	public boolean nextNodeBySubmit1(
			weaver.soa.workflow.request.RequestInfo in0, int in1, int in2,
			java.lang.String in3, java.lang.String in4) {
		LOG.info("Executing operation nextNodeBySubmit1");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in4);
		try {
			boolean _return = false;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#whetherMustInputRemark
	 * (int in0 ,)int in1 ,)int in2 ,)int in3 ,)int in4 )*
	 */
	public boolean whetherMustInputRemark(int in0, int in1, int in2, int in3,
			int in4) {
		LOG.info("Executing operation whetherMustInputRemark");
		System.out.println(in0);
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in4);
		try {
			boolean _return = false;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itg.soabus.oaservice.RequestServicePortType#deleteRequest(int
	 * in0 )*
	 */
	public boolean deleteRequest(int in0) {
		LOG.info("Executing operation deleteRequest");
		System.out.println(in0);
		try {
			boolean _return = false;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.itg.soabus.oaservice.RequestServicePortType#loadTemplateProp(java
	 * .lang.String in0 )*
	 */
	public com.itg.soabus.oaservice.AnyType2AnyTypeMap loadTemplateProp(
			java.lang.String in0) {
		LOG.info("Executing operation loadTemplateProp");
		System.out.println(in0);
		try {
			com.itg.soabus.oaservice.AnyType2AnyTypeMap _return = new com.itg.soabus.oaservice.AnyType2AnyTypeMap();
			java.util.List<com.itg.soabus.oaservice.AnyType2AnyTypeMap.Entry> _returnEntry = new java.util.ArrayList<com.itg.soabus.oaservice.AnyType2AnyTypeMap.Entry>();
			com.itg.soabus.oaservice.AnyType2AnyTypeMap.Entry _returnEntryVal1 = new com.itg.soabus.oaservice.AnyType2AnyTypeMap.Entry();
			java.lang.Object _returnEntryVal1Key = null;
			_returnEntryVal1.setKey(_returnEntryVal1Key);
			java.lang.Object _returnEntryVal1Value = null;
			_returnEntryVal1.setValue(_returnEntryVal1Value);
			_returnEntry.add(_returnEntryVal1);
			_return.getEntry().addAll(_returnEntry);
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
