
package weaver.workflow.request;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.itg.soabus.oaservice.AnyType2AnyType2AnyTypeMapMap;
import weaver.conn.RecordSetTrans;
import weaver.hrm.User;


/**
 * <p>RequestManager complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RequestManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beAgenter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="canModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="clientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coadsigntype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creater" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="creatertype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="createtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentOperator" type="{http://localhost/services/RequestService}anyType2anyType2anyTypeMapMap" minOccurs="0"/>
 *         &lt;element name="currentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docrowindex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="handWrittenSign" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hasTriggeredSubwf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intervenorid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFromEditDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPending" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isagentCreater" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isbill" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iscreate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isremark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastNodeid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastnodetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastoperatedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastoperatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastoperator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastoperatortype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messagecontent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="needwfback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextNodeid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nextNodetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nodelefttime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nodepasstime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nodetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passedGroups" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="requestid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="requestlevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rsTrans" type="{http://conn.weaver}RecordSetTrans" minOccurs="0"/>
 *         &lt;element name="signdocids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signworkflowids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="speechAttachment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalGroups" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user" type="{http://hrm.weaver}User" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workflowid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workflowtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestManager", propOrder = {
    "beAgenter",
    "billTableName",
    "billid",
    "canModify",
    "clientType",
    "coadsigntype",
    "createdate",
    "creater",
    "creatertype",
    "createtime",
    "currentDate",
    "currentOperator",
    "currentTime",
    "docrowindex",
    "formid",
    "handWrittenSign",
    "hasTriggeredSubwf",
    "intervenorid",
    "isFromEditDocument",
    "isPending",
    "isagentCreater",
    "isbill",
    "iscreate",
    "isremark",
    "lastNodeid",
    "lastnodetype",
    "lastoperatedate",
    "lastoperatetime",
    "lastoperator",
    "lastoperatortype",
    "message",
    "messageType",
    "messagecontent",
    "messageid",
    "needwfback",
    "nextNodeid",
    "nextNodetype",
    "nodeid",
    "nodelefttime",
    "nodepasstime",
    "nodetype",
    "passedGroups",
    "remark",
    "requestKey",
    "requestid",
    "requestlevel",
    "requestname",
    "rsTrans",
    "signdocids",
    "signworkflowids",
    "speechAttachment",
    "src",
    "status",
    "submitNodeId",
    "totalGroups",
    "user",
    "userId",
    "userType",
    "workflowid",
    "workflowtype"
})
//@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
public class RequestManager {

//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer beAgenter;
    @XmlElementRef(name = "billTableName", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> billTableName;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer billid;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Boolean canModify;
    @XmlElementRef(name = "clientType", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> clientType;
    @XmlElementRef(name = "coadsigntype", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> coadsigntype;
    @XmlElementRef(name = "createdate", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> createdate;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer creater;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer creatertype;
    @XmlElementRef(name = "createtime", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> createtime;
    @XmlElementRef(name = "currentDate", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> currentDate;
    @XmlElementRef(name = "currentOperator", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<AnyType2AnyType2AnyTypeMapMap> currentOperator;
    @XmlElementRef(name = "currentTime", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> currentTime;
    @XmlElementRef(name = "docrowindex", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> docrowindex;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer formid;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer handWrittenSign;
    @XmlElementRef(name = "hasTriggeredSubwf", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> hasTriggeredSubwf;
    @XmlElementRef(name = "intervenorid", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> intervenorid;
    @XmlElementRef(name = "isFromEditDocument", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> isFromEditDocument;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer isPending;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer isagentCreater;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer isbill;
    @XmlElementRef(name = "iscreate", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> iscreate;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer isremark;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer lastNodeid;
    @XmlElementRef(name = "lastnodetype", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> lastnodetype;
    @XmlElementRef(name = "lastoperatedate", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> lastoperatedate;
    @XmlElementRef(name = "lastoperatetime", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> lastoperatetime;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer lastoperator;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer lastoperatortype;
    @XmlElementRef(name = "message", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> message;
    @XmlElementRef(name = "messageType", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> messageType;
    @XmlElementRef(name = "messagecontent", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> messagecontent;
    @XmlElementRef(name = "messageid", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> messageid;
    @XmlElementRef(name = "needwfback", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> needwfback;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer nextNodeid;
    @XmlElementRef(name = "nextNodetype", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> nextNodetype;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer nodeid;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Float nodelefttime;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Float nodepasstime;
    @XmlElementRef(name = "nodetype", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> nodetype;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer passedGroups;
    @XmlElementRef(name = "remark", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> remark;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer requestKey;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer requestid;
    @XmlElementRef(name = "requestlevel", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> requestlevel;
    @XmlElementRef(name = "requestname", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> requestname;
    @XmlElementRef(name = "rsTrans", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<RecordSetTrans> rsTrans;
    @XmlElementRef(name = "signdocids", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> signdocids;
    @XmlElementRef(name = "signworkflowids", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> signworkflowids;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer speechAttachment;
    @XmlElementRef(name = "src", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> src;
    @XmlElementRef(name = "status", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> status;
    @XmlElementRef(name = "submitNodeId", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> submitNodeId;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer totalGroups;
    @XmlElementRef(name = "user", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<User> user;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer userId;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer userType;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer workflowid;
    @XmlElementRef(name = "workflowtype", namespace = "http://request.workflow.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<String> workflowtype;

    /**
     * ��ȡbeAgenter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getBeAgenter() {
        return beAgenter;
    }

    /**
     * ����beAgenter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setBeAgenter(Integer value) {
        this.beAgenter = value;
    }

    /**
     * ��ȡbillTableName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getBillTableName() {
        return billTableName;
    }

    /**
     * ����billTableName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setBillTableName(JAXBElement<String> value) {
        this.billTableName = value;
    }

    /**
     * ��ȡbillid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getBillid() {
        return billid;
    }

    /**
     * ����billid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setBillid(Integer value) {
        this.billid = value;
    }

    /**
     * ��ȡcanModify���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Boolean isCanModify() {
        return canModify;
    }

    /**
     * ����canModify���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCanModify(Boolean value) {
        this.canModify = value;
    }

    /**
     * ��ȡclientType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getClientType() {
        return clientType;
    }

    /**
     * ����clientType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setClientType(JAXBElement<String> value) {
        this.clientType = value;
    }

    /**
     * ��ȡcoadsigntype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getCoadsigntype() {
        return coadsigntype;
    }

    /**
     * ����coadsigntype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCoadsigntype(JAXBElement<String> value) {
        this.coadsigntype = value;
    }

    /**
     * ��ȡcreatedate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getCreatedate() {
        return createdate;
    }

    /**
     * ����createdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCreatedate(JAXBElement<String> value) {
        this.createdate = value;
    }

    /**
     * ��ȡcreater���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getCreater() {
        return creater;
    }

    /**
     * ����creater���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCreater(Integer value) {
        this.creater = value;
    }

    /**
     * ��ȡcreatertype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getCreatertype() {
        return creatertype;
    }

    /**
     * ����creatertype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCreatertype(Integer value) {
        this.creatertype = value;
    }

    /**
     * ��ȡcreatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getCreatetime() {
        return createtime;
    }

    /**
     * ����createtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCreatetime(JAXBElement<String> value) {
        this.createtime = value;
    }

    /**
     * ��ȡcurrentDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getCurrentDate() {
        return currentDate;
    }

    /**
     * ����currentDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCurrentDate(JAXBElement<String> value) {
        this.currentDate = value;
    }

    /**
     * ��ȡcurrentOperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnyType2AnyType2AnyTypeMapMap }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<AnyType2AnyType2AnyTypeMapMap> getCurrentOperator() {
        return currentOperator;
    }

    /**
     * ����currentOperator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnyType2AnyType2AnyTypeMapMap }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCurrentOperator(JAXBElement<AnyType2AnyType2AnyTypeMapMap> value) {
        this.currentOperator = value;
    }

    /**
     * ��ȡcurrentTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getCurrentTime() {
        return currentTime;
    }

    /**
     * ����currentTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setCurrentTime(JAXBElement<String> value) {
        this.currentTime = value;
    }

    /**
     * ��ȡdocrowindex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getDocrowindex() {
        return docrowindex;
    }

    /**
     * ����docrowindex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setDocrowindex(JAXBElement<String> value) {
        this.docrowindex = value;
    }

    /**
     * ��ȡformid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getFormid() {
        return formid;
    }

    /**
     * ����formid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setFormid(Integer value) {
        this.formid = value;
    }

    /**
     * ��ȡhandWrittenSign���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getHandWrittenSign() {
        return handWrittenSign;
    }

    /**
     * ����handWrittenSign���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setHandWrittenSign(Integer value) {
        this.handWrittenSign = value;
    }

    /**
     * ��ȡhasTriggeredSubwf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getHasTriggeredSubwf() {
        return hasTriggeredSubwf;
    }

    /**
     * ����hasTriggeredSubwf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setHasTriggeredSubwf(JAXBElement<String> value) {
        this.hasTriggeredSubwf = value;
    }

    /**
     * ��ȡintervenorid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getIntervenorid() {
        return intervenorid;
    }

    /**
     * ����intervenorid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setIntervenorid(JAXBElement<String> value) {
        this.intervenorid = value;
    }

    /**
     * ��ȡisFromEditDocument���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getIsFromEditDocument() {
        return isFromEditDocument;
    }

    /**
     * ����isFromEditDocument���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setIsFromEditDocument(JAXBElement<String> value) {
        this.isFromEditDocument = value;
    }

    /**
     * ��ȡisPending���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getIsPending() {
        return isPending;
    }

    /**
     * ����isPending���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setIsPending(Integer value) {
        this.isPending = value;
    }

    /**
     * ��ȡisagentCreater���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getIsagentCreater() {
        return isagentCreater;
    }

    /**
     * ����isagentCreater���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setIsagentCreater(Integer value) {
        this.isagentCreater = value;
    }

    /**
     * ��ȡisbill���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getIsbill() {
        return isbill;
    }

    /**
     * ����isbill���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setIsbill(Integer value) {
        this.isbill = value;
    }

    /**
     * ��ȡiscreate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getIscreate() {
        return iscreate;
    }

    /**
     * ����iscreate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setIscreate(JAXBElement<String> value) {
        this.iscreate = value;
    }

    /**
     * ��ȡisremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getIsremark() {
        return isremark;
    }

    /**
     * ����isremark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setIsremark(Integer value) {
        this.isremark = value;
    }

    /**
     * ��ȡlastNodeid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getLastNodeid() {
        return lastNodeid;
    }

    /**
     * ����lastNodeid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setLastNodeid(Integer value) {
        this.lastNodeid = value;
    }

    /**
     * ��ȡlastnodetype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getLastnodetype() {
        return lastnodetype;
    }

    /**
     * ����lastnodetype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setLastnodetype(JAXBElement<String> value) {
        this.lastnodetype = value;
    }

    /**
     * ��ȡlastoperatedate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getLastoperatedate() {
        return lastoperatedate;
    }

    /**
     * ����lastoperatedate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setLastoperatedate(JAXBElement<String> value) {
        this.lastoperatedate = value;
    }

    /**
     * ��ȡlastoperatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getLastoperatetime() {
        return lastoperatetime;
    }

    /**
     * ����lastoperatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setLastoperatetime(JAXBElement<String> value) {
        this.lastoperatetime = value;
    }

    /**
     * ��ȡlastoperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getLastoperator() {
        return lastoperator;
    }

    /**
     * ����lastoperator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setLastoperator(Integer value) {
        this.lastoperator = value;
    }

    /**
     * ��ȡlastoperatortype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getLastoperatortype() {
        return lastoperatortype;
    }

    /**
     * ����lastoperatortype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setLastoperatortype(Integer value) {
        this.lastoperatortype = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * ��ȡmessageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getMessageType() {
        return messageType;
    }

    /**
     * ����messageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setMessageType(JAXBElement<String> value) {
        this.messageType = value;
    }

    /**
     * ��ȡmessagecontent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getMessagecontent() {
        return messagecontent;
    }

    /**
     * ����messagecontent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setMessagecontent(JAXBElement<String> value) {
        this.messagecontent = value;
    }

    /**
     * ��ȡmessageid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getMessageid() {
        return messageid;
    }

    /**
     * ����messageid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setMessageid(JAXBElement<String> value) {
        this.messageid = value;
    }

    /**
     * ��ȡneedwfback���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getNeedwfback() {
        return needwfback;
    }

    /**
     * ����needwfback���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setNeedwfback(JAXBElement<String> value) {
        this.needwfback = value;
    }

    /**
     * ��ȡnextNodeid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getNextNodeid() {
        return nextNodeid;
    }

    /**
     * ����nextNodeid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setNextNodeid(Integer value) {
        this.nextNodeid = value;
    }

    /**
     * ��ȡnextNodetype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getNextNodetype() {
        return nextNodetype;
    }

    /**
     * ����nextNodetype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setNextNodetype(JAXBElement<String> value) {
        this.nextNodetype = value;
    }

    /**
     * ��ȡnodeid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getNodeid() {
        return nodeid;
    }

    /**
     * ����nodeid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setNodeid(Integer value) {
        this.nodeid = value;
    }

    /**
     * ��ȡnodelefttime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Float getNodelefttime() {
        return nodelefttime;
    }

    /**
     * ����nodelefttime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setNodelefttime(Float value) {
        this.nodelefttime = value;
    }

    /**
     * ��ȡnodepasstime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Float getNodepasstime() {
        return nodepasstime;
    }

    /**
     * ����nodepasstime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setNodepasstime(Float value) {
        this.nodepasstime = value;
    }

    /**
     * ��ȡnodetype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getNodetype() {
        return nodetype;
    }

    /**
     * ����nodetype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setNodetype(JAXBElement<String> value) {
        this.nodetype = value;
    }

    /**
     * ��ȡpassedGroups���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getPassedGroups() {
        return passedGroups;
    }

    /**
     * ����passedGroups���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setPassedGroups(Integer value) {
        this.passedGroups = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setRemark(JAXBElement<String> value) {
        this.remark = value;
    }

    /**
     * ��ȡrequestKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getRequestKey() {
        return requestKey;
    }

    /**
     * ����requestKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setRequestKey(Integer value) {
        this.requestKey = value;
    }

    /**
     * ��ȡrequestid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getRequestid() {
        return requestid;
    }

    /**
     * ����requestid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setRequestid(Integer value) {
        this.requestid = value;
    }

    /**
     * ��ȡrequestlevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getRequestlevel() {
        return requestlevel;
    }

    /**
     * ����requestlevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setRequestlevel(JAXBElement<String> value) {
        this.requestlevel = value;
    }

    /**
     * ��ȡrequestname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getRequestname() {
        return requestname;
    }

    /**
     * ����requestname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setRequestname(JAXBElement<String> value) {
        this.requestname = value;
    }

    /**
     * ��ȡrsTrans���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecordSetTrans }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<RecordSetTrans> getRsTrans() {
        return rsTrans;
    }

    /**
     * ����rsTrans���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecordSetTrans }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setRsTrans(JAXBElement<RecordSetTrans> value) {
        this.rsTrans = value;
    }

    /**
     * ��ȡsigndocids���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getSigndocids() {
        return signdocids;
    }

    /**
     * ����signdocids���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setSigndocids(JAXBElement<String> value) {
        this.signdocids = value;
    }

    /**
     * ��ȡsignworkflowids���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getSignworkflowids() {
        return signworkflowids;
    }

    /**
     * ����signworkflowids���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setSignworkflowids(JAXBElement<String> value) {
        this.signworkflowids = value;
    }

    /**
     * ��ȡspeechAttachment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getSpeechAttachment() {
        return speechAttachment;
    }

    /**
     * ����speechAttachment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setSpeechAttachment(Integer value) {
        this.speechAttachment = value;
    }

    /**
     * ��ȡsrc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getSrc() {
        return src;
    }

    /**
     * ����src���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setSrc(JAXBElement<String> value) {
        this.src = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * ��ȡsubmitNodeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getSubmitNodeId() {
        return submitNodeId;
    }

    /**
     * ����submitNodeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setSubmitNodeId(JAXBElement<String> value) {
        this.submitNodeId = value;
    }

    /**
     * ��ȡtotalGroups���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getTotalGroups() {
        return totalGroups;
    }

    /**
     * ����totalGroups���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setTotalGroups(Integer value) {
        this.totalGroups = value;
    }

    /**
     * ��ȡuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<User> getUser() {
        return user;
    }

    /**
     * ����user���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setUser(JAXBElement<User> value) {
        this.user = value;
    }

    /**
     * ��ȡuserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getUserId() {
        return userId;
    }

    /**
     * ����userId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * ��ȡuserType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getUserType() {
        return userType;
    }

    /**
     * ����userType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setUserType(Integer value) {
        this.userType = value;
    }

    /**
     * ��ȡworkflowid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getWorkflowid() {
        return workflowid;
    }

    /**
     * ����workflowid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setWorkflowid(Integer value) {
        this.workflowid = value;
    }

    /**
     * ��ȡworkflowtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<String> getWorkflowtype() {
        return workflowtype;
    }

    /**
     * ����workflowtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setWorkflowtype(JAXBElement<String> value) {
        this.workflowtype = value;
    }

}
