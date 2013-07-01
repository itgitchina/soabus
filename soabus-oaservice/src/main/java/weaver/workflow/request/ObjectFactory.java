
package weaver.workflow.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.itg.soabus.oaservice.AnyType2AnyType2AnyTypeMapMap;
import weaver.conn.RecordSetTrans;
import weaver.hrm.User;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the weaver.workflow.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestManagerRequestname_QNAME = new QName("http://request.workflow.weaver", "requestname");
    private final static QName _RequestManagerIscreate_QNAME = new QName("http://request.workflow.weaver", "iscreate");
    private final static QName _RequestManagerLastnodetype_QNAME = new QName("http://request.workflow.weaver", "lastnodetype");
    private final static QName _RequestManagerIsFromEditDocument_QNAME = new QName("http://request.workflow.weaver", "isFromEditDocument");
    private final static QName _RequestManagerSrc_QNAME = new QName("http://request.workflow.weaver", "src");
    private final static QName _RequestManagerMessageid_QNAME = new QName("http://request.workflow.weaver", "messageid");
    private final static QName _RequestManagerNodetype_QNAME = new QName("http://request.workflow.weaver", "nodetype");
    private final static QName _RequestManagerCreatetime_QNAME = new QName("http://request.workflow.weaver", "createtime");
    private final static QName _RequestManagerNeedwfback_QNAME = new QName("http://request.workflow.weaver", "needwfback");
    private final static QName _RequestManagerCoadsigntype_QNAME = new QName("http://request.workflow.weaver", "coadsigntype");
    private final static QName _RequestManagerBillTableName_QNAME = new QName("http://request.workflow.weaver", "billTableName");
    private final static QName _RequestManagerSigndocids_QNAME = new QName("http://request.workflow.weaver", "signdocids");
    private final static QName _RequestManagerCreatedate_QNAME = new QName("http://request.workflow.weaver", "createdate");
    private final static QName _RequestManagerCurrentOperator_QNAME = new QName("http://request.workflow.weaver", "currentOperator");
    private final static QName _RequestManagerRemark_QNAME = new QName("http://request.workflow.weaver", "remark");
    private final static QName _RequestManagerRsTrans_QNAME = new QName("http://request.workflow.weaver", "rsTrans");
    private final static QName _RequestManagerSignworkflowids_QNAME = new QName("http://request.workflow.weaver", "signworkflowids");
    private final static QName _RequestManagerWorkflowtype_QNAME = new QName("http://request.workflow.weaver", "workflowtype");
    private final static QName _RequestManagerClientType_QNAME = new QName("http://request.workflow.weaver", "clientType");
    private final static QName _RequestManagerUser_QNAME = new QName("http://request.workflow.weaver", "user");
    private final static QName _RequestManagerRequestlevel_QNAME = new QName("http://request.workflow.weaver", "requestlevel");
    private final static QName _RequestManagerNextNodetype_QNAME = new QName("http://request.workflow.weaver", "nextNodetype");
    private final static QName _RequestManagerLastoperatedate_QNAME = new QName("http://request.workflow.weaver", "lastoperatedate");
    private final static QName _RequestManagerCurrentDate_QNAME = new QName("http://request.workflow.weaver", "currentDate");
    private final static QName _RequestManagerCurrentTime_QNAME = new QName("http://request.workflow.weaver", "currentTime");
    private final static QName _RequestManagerMessage_QNAME = new QName("http://request.workflow.weaver", "message");
    private final static QName _RequestManagerLastoperatetime_QNAME = new QName("http://request.workflow.weaver", "lastoperatetime");
    private final static QName _RequestManagerHasTriggeredSubwf_QNAME = new QName("http://request.workflow.weaver", "hasTriggeredSubwf");
    private final static QName _RequestManagerMessageType_QNAME = new QName("http://request.workflow.weaver", "messageType");
    private final static QName _RequestManagerDocrowindex_QNAME = new QName("http://request.workflow.weaver", "docrowindex");
    private final static QName _RequestManagerMessagecontent_QNAME = new QName("http://request.workflow.weaver", "messagecontent");
    private final static QName _RequestManagerStatus_QNAME = new QName("http://request.workflow.weaver", "status");
    private final static QName _RequestManagerSubmitNodeId_QNAME = new QName("http://request.workflow.weaver", "submitNodeId");
    private final static QName _RequestManagerIntervenorid_QNAME = new QName("http://request.workflow.weaver", "intervenorid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: weaver.workflow.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestManager }
     * 
     */
    public RequestManager createRequestManager() {
        return new RequestManager();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "requestname", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerRequestname(String value) {
        return new JAXBElement<String>(_RequestManagerRequestname_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "iscreate", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerIscreate(String value) {
        return new JAXBElement<String>(_RequestManagerIscreate_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "lastnodetype", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerLastnodetype(String value) {
        return new JAXBElement<String>(_RequestManagerLastnodetype_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "isFromEditDocument", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerIsFromEditDocument(String value) {
        return new JAXBElement<String>(_RequestManagerIsFromEditDocument_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "src", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerSrc(String value) {
        return new JAXBElement<String>(_RequestManagerSrc_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "messageid", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerMessageid(String value) {
        return new JAXBElement<String>(_RequestManagerMessageid_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "nodetype", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerNodetype(String value) {
        return new JAXBElement<String>(_RequestManagerNodetype_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "createtime", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerCreatetime(String value) {
        return new JAXBElement<String>(_RequestManagerCreatetime_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "needwfback", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerNeedwfback(String value) {
        return new JAXBElement<String>(_RequestManagerNeedwfback_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "coadsigntype", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerCoadsigntype(String value) {
        return new JAXBElement<String>(_RequestManagerCoadsigntype_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "billTableName", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerBillTableName(String value) {
        return new JAXBElement<String>(_RequestManagerBillTableName_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "signdocids", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerSigndocids(String value) {
        return new JAXBElement<String>(_RequestManagerSigndocids_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "createdate", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerCreatedate(String value) {
        return new JAXBElement<String>(_RequestManagerCreatedate_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType2AnyType2AnyTypeMapMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "currentOperator", scope = RequestManager.class)
    public JAXBElement<AnyType2AnyType2AnyTypeMapMap> createRequestManagerCurrentOperator(AnyType2AnyType2AnyTypeMapMap value) {
        return new JAXBElement<AnyType2AnyType2AnyTypeMapMap>(_RequestManagerCurrentOperator_QNAME, AnyType2AnyType2AnyTypeMapMap.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "remark", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerRemark(String value) {
        return new JAXBElement<String>(_RequestManagerRemark_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordSetTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "rsTrans", scope = RequestManager.class)
    public JAXBElement<RecordSetTrans> createRequestManagerRsTrans(RecordSetTrans value) {
        return new JAXBElement<RecordSetTrans>(_RequestManagerRsTrans_QNAME, RecordSetTrans.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "signworkflowids", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerSignworkflowids(String value) {
        return new JAXBElement<String>(_RequestManagerSignworkflowids_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "workflowtype", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerWorkflowtype(String value) {
        return new JAXBElement<String>(_RequestManagerWorkflowtype_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "clientType", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerClientType(String value) {
        return new JAXBElement<String>(_RequestManagerClientType_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "user", scope = RequestManager.class)
    public JAXBElement<User> createRequestManagerUser(User value) {
        return new JAXBElement<User>(_RequestManagerUser_QNAME, User.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "requestlevel", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerRequestlevel(String value) {
        return new JAXBElement<String>(_RequestManagerRequestlevel_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "nextNodetype", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerNextNodetype(String value) {
        return new JAXBElement<String>(_RequestManagerNextNodetype_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "lastoperatedate", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerLastoperatedate(String value) {
        return new JAXBElement<String>(_RequestManagerLastoperatedate_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "currentDate", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerCurrentDate(String value) {
        return new JAXBElement<String>(_RequestManagerCurrentDate_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "currentTime", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerCurrentTime(String value) {
        return new JAXBElement<String>(_RequestManagerCurrentTime_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "message", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerMessage(String value) {
        return new JAXBElement<String>(_RequestManagerMessage_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "lastoperatetime", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerLastoperatetime(String value) {
        return new JAXBElement<String>(_RequestManagerLastoperatetime_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "hasTriggeredSubwf", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerHasTriggeredSubwf(String value) {
        return new JAXBElement<String>(_RequestManagerHasTriggeredSubwf_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "messageType", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerMessageType(String value) {
        return new JAXBElement<String>(_RequestManagerMessageType_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "docrowindex", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerDocrowindex(String value) {
        return new JAXBElement<String>(_RequestManagerDocrowindex_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "messagecontent", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerMessagecontent(String value) {
        return new JAXBElement<String>(_RequestManagerMessagecontent_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "status", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerStatus(String value) {
        return new JAXBElement<String>(_RequestManagerStatus_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "submitNodeId", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerSubmitNodeId(String value) {
        return new JAXBElement<String>(_RequestManagerSubmitNodeId_QNAME, String.class, RequestManager.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.weaver", name = "intervenorid", scope = RequestManager.class)
    public JAXBElement<String> createRequestManagerIntervenorid(String value) {
        return new JAXBElement<String>(_RequestManagerIntervenorid_QNAME, String.class, RequestManager.class, value);
    }

}
