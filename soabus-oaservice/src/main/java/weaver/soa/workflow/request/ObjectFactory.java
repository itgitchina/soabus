
package weaver.soa.workflow.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import weaver.conn.RecordSetTrans;
import weaver.workflow.request.RequestManager;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the weaver.soa.workflow.request package. 
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

    private final static QName _CellValue_QNAME = new QName("http://request.workflow.soa.weaver", "value");
    private final static QName _CellType_QNAME = new QName("http://request.workflow.soa.weaver", "type");
    private final static QName _CellName_QNAME = new QName("http://request.workflow.soa.weaver", "name");
    private final static QName _MainTableInfoProperty_QNAME = new QName("http://request.workflow.soa.weaver", "property");
    private final static QName _RequestBaseCreater_QNAME = new QName("http://request.workflow.soa.weaver", "creater");
    private final static QName _RequestBaseLastOperator_QNAME = new QName("http://request.workflow.soa.weaver", "lastOperator");
    private final static QName _RequestBaseLastOperateTime_QNAME = new QName("http://request.workflow.soa.weaver", "lastOperateTime");
    private final static QName _RequestBaseCurrentNodeId_QNAME = new QName("http://request.workflow.soa.weaver", "currentNodeId");
    private final static QName _RequestBaseCreatertype_QNAME = new QName("http://request.workflow.soa.weaver", "creatertype");
    private final static QName _RequestBaseRequestName_QNAME = new QName("http://request.workflow.soa.weaver", "requestName");
    private final static QName _RequestBaseLastOperatortype_QNAME = new QName("http://request.workflow.soa.weaver", "lastOperatortype");
    private final static QName _RequestBaseCurrentNodeType_QNAME = new QName("http://request.workflow.soa.weaver", "currentNodeType");
    private final static QName _RequestBaseCreateTime_QNAME = new QName("http://request.workflow.soa.weaver", "createTime");
    private final static QName _RequestBaseWorkflowId_QNAME = new QName("http://request.workflow.soa.weaver", "workflowId");
    private final static QName _RequestBaseRequestId_QNAME = new QName("http://request.workflow.soa.weaver", "requestId");
    private final static QName _RowId_QNAME = new QName("http://request.workflow.soa.weaver", "id");
    private final static QName _RowCell_QNAME = new QName("http://request.workflow.soa.weaver", "cell");
    private final static QName _LogSigndocids_QNAME = new QName("http://request.workflow.soa.weaver", "signdocids");
    private final static QName _LogOperatorid_QNAME = new QName("http://request.workflow.soa.weaver", "operatorid");
    private final static QName _LogNodeid_QNAME = new QName("http://request.workflow.soa.weaver", "nodeid");
    private final static QName _LogOperator_QNAME = new QName("http://request.workflow.soa.weaver", "operator");
    private final static QName _LogOptype_QNAME = new QName("http://request.workflow.soa.weaver", "optype");
    private final static QName _LogSignworkflowids_QNAME = new QName("http://request.workflow.soa.weaver", "signworkflowids");
    private final static QName _LogOperatortype_QNAME = new QName("http://request.workflow.soa.weaver", "operatortype");
    private final static QName _LogOptime_QNAME = new QName("http://request.workflow.soa.weaver", "optime");
    private final static QName _LogOperatordept_QNAME = new QName("http://request.workflow.soa.weaver", "operatordept");
    private final static QName _LogReceiver_QNAME = new QName("http://request.workflow.soa.weaver", "receiver");
    private final static QName _LogAnnexdocids_QNAME = new QName("http://request.workflow.soa.weaver", "annexdocids");
    private final static QName _LogAgenttype_QNAME = new QName("http://request.workflow.soa.weaver", "agenttype");
    private final static QName _LogOpdate_QNAME = new QName("http://request.workflow.soa.weaver", "opdate");
    private final static QName _LogRequestLogId_QNAME = new QName("http://request.workflow.soa.weaver", "requestLogId");
    private final static QName _LogComment_QNAME = new QName("http://request.workflow.soa.weaver", "comment");
    private final static QName _LogNode_QNAME = new QName("http://request.workflow.soa.weaver", "node");
    private final static QName _LogAgentorbyagentid_QNAME = new QName("http://request.workflow.soa.weaver", "agentorbyagentid");
    private final static QName _DetailTableRow_QNAME = new QName("http://request.workflow.soa.weaver", "row");
    private final static QName _DetailTableInfoDetailTable_QNAME = new QName("http://request.workflow.soa.weaver", "detailTable");
    private final static QName _RequestLogLog_QNAME = new QName("http://request.workflow.soa.weaver", "log");
    private final static QName _RequestInfoDetailTableInfo_QNAME = new QName("http://request.workflow.soa.weaver", "detailTableInfo");
    private final static QName _RequestInfoMainTableInfo_QNAME = new QName("http://request.workflow.soa.weaver", "mainTableInfo");
    private final static QName _RequestInfoRequestLog_QNAME = new QName("http://request.workflow.soa.weaver", "requestLog");
    private final static QName _RequestInfoWorkflowid_QNAME = new QName("http://request.workflow.soa.weaver", "workflowid");
    private final static QName _RequestInfoLastoperator_QNAME = new QName("http://request.workflow.soa.weaver", "lastoperator");
    private final static QName _RequestInfoIsNextFlow_QNAME = new QName("http://request.workflow.soa.weaver", "isNextFlow");
    private final static QName _RequestInfoRsTrans_QNAME = new QName("http://request.workflow.soa.weaver", "rsTrans");
    private final static QName _RequestInfoRequestlevel_QNAME = new QName("http://request.workflow.soa.weaver", "requestlevel");
    private final static QName _RequestInfoRequestid_QNAME = new QName("http://request.workflow.soa.weaver", "requestid");
    private final static QName _RequestInfoCreatorid_QNAME = new QName("http://request.workflow.soa.weaver", "creatorid");
    private final static QName _RequestInfoHostid_QNAME = new QName("http://request.workflow.soa.weaver", "hostid");
    private final static QName _RequestInfoRequestManager_QNAME = new QName("http://request.workflow.soa.weaver", "requestManager");
    private final static QName _RequestInfoDescription_QNAME = new QName("http://request.workflow.soa.weaver", "description");
    private final static QName _RequestInfoRemindtype_QNAME = new QName("http://request.workflow.soa.weaver", "remindtype");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: weaver.soa.workflow.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestInfo }
     * 
     */
    public RequestInfo createRequestInfo() {
        return new RequestInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRequestBase }
     * 
     */
    public ArrayOfRequestBase createArrayOfRequestBase() {
        return new ArrayOfRequestBase();
    }

    /**
     * Create an instance of {@link ArrayOfLog }
     * 
     */
    public ArrayOfLog createArrayOfLog() {
        return new ArrayOfLog();
    }

    /**
     * Create an instance of {@link RequestLog }
     * 
     */
    public RequestLog createRequestLog() {
        return new RequestLog();
    }

    /**
     * Create an instance of {@link Cell }
     * 
     */
    public Cell createCell() {
        return new Cell();
    }

    /**
     * Create an instance of {@link ArrayOfDetailTable }
     * 
     */
    public ArrayOfDetailTable createArrayOfDetailTable() {
        return new ArrayOfDetailTable();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link ArrayOfProperty }
     * 
     */
    public ArrayOfProperty createArrayOfProperty() {
        return new ArrayOfProperty();
    }

    /**
     * Create an instance of {@link ArrayOfRow }
     * 
     */
    public ArrayOfRow createArrayOfRow() {
        return new ArrayOfRow();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link DetailTableInfo }
     * 
     */
    public DetailTableInfo createDetailTableInfo() {
        return new DetailTableInfo();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link DetailTable }
     * 
     */
    public DetailTable createDetailTable() {
        return new DetailTable();
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link ArrayOfCell }
     * 
     */
    public ArrayOfCell createArrayOfCell() {
        return new ArrayOfCell();
    }

    /**
     * Create an instance of {@link MainTableInfo }
     * 
     */
    public MainTableInfo createMainTableInfo() {
        return new MainTableInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "value", scope = Cell.class)
    public JAXBElement<String> createCellValue(String value) {
        return new JAXBElement<String>(_CellValue_QNAME, String.class, Cell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "type", scope = Cell.class)
    public JAXBElement<String> createCellType(String value) {
        return new JAXBElement<String>(_CellType_QNAME, String.class, Cell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "name", scope = Cell.class)
    public JAXBElement<String> createCellName(String value) {
        return new JAXBElement<String>(_CellName_QNAME, String.class, Cell.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "property", scope = MainTableInfo.class)
    public JAXBElement<ArrayOfProperty> createMainTableInfoProperty(ArrayOfProperty value) {
        return new JAXBElement<ArrayOfProperty>(_MainTableInfoProperty_QNAME, ArrayOfProperty.class, MainTableInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "creater", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseCreater(String value) {
        return new JAXBElement<String>(_RequestBaseCreater_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "lastOperator", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseLastOperator(String value) {
        return new JAXBElement<String>(_RequestBaseLastOperator_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "lastOperateTime", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseLastOperateTime(String value) {
        return new JAXBElement<String>(_RequestBaseLastOperateTime_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "currentNodeId", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseCurrentNodeId(String value) {
        return new JAXBElement<String>(_RequestBaseCurrentNodeId_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "creatertype", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseCreatertype(String value) {
        return new JAXBElement<String>(_RequestBaseCreatertype_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "requestName", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseRequestName(String value) {
        return new JAXBElement<String>(_RequestBaseRequestName_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "lastOperatortype", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseLastOperatortype(String value) {
        return new JAXBElement<String>(_RequestBaseLastOperatortype_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "currentNodeType", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseCurrentNodeType(String value) {
        return new JAXBElement<String>(_RequestBaseCurrentNodeType_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "createTime", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseCreateTime(String value) {
        return new JAXBElement<String>(_RequestBaseCreateTime_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "workflowId", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseWorkflowId(String value) {
        return new JAXBElement<String>(_RequestBaseWorkflowId_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "requestId", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseRequestId(String value) {
        return new JAXBElement<String>(_RequestBaseRequestId_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "id", scope = Row.class)
    public JAXBElement<String> createRowId(String value) {
        return new JAXBElement<String>(_RowId_QNAME, String.class, Row.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "cell", scope = Row.class)
    public JAXBElement<ArrayOfCell> createRowCell(ArrayOfCell value) {
        return new JAXBElement<ArrayOfCell>(_RowCell_QNAME, ArrayOfCell.class, Row.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "value", scope = Property.class)
    public JAXBElement<String> createPropertyValue(String value) {
        return new JAXBElement<String>(_CellValue_QNAME, String.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "type", scope = Property.class)
    public JAXBElement<String> createPropertyType(String value) {
        return new JAXBElement<String>(_CellType_QNAME, String.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "name", scope = Property.class)
    public JAXBElement<String> createPropertyName(String value) {
        return new JAXBElement<String>(_CellName_QNAME, String.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "signdocids", scope = Log.class)
    public JAXBElement<String> createLogSigndocids(String value) {
        return new JAXBElement<String>(_LogSigndocids_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "operatorid", scope = Log.class)
    public JAXBElement<String> createLogOperatorid(String value) {
        return new JAXBElement<String>(_LogOperatorid_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "nodeid", scope = Log.class)
    public JAXBElement<String> createLogNodeid(String value) {
        return new JAXBElement<String>(_LogNodeid_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "operator", scope = Log.class)
    public JAXBElement<String> createLogOperator(String value) {
        return new JAXBElement<String>(_LogOperator_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "optype", scope = Log.class)
    public JAXBElement<String> createLogOptype(String value) {
        return new JAXBElement<String>(_LogOptype_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "signworkflowids", scope = Log.class)
    public JAXBElement<String> createLogSignworkflowids(String value) {
        return new JAXBElement<String>(_LogSignworkflowids_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "operatortype", scope = Log.class)
    public JAXBElement<String> createLogOperatortype(String value) {
        return new JAXBElement<String>(_LogOperatortype_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "optime", scope = Log.class)
    public JAXBElement<String> createLogOptime(String value) {
        return new JAXBElement<String>(_LogOptime_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "operatordept", scope = Log.class)
    public JAXBElement<String> createLogOperatordept(String value) {
        return new JAXBElement<String>(_LogOperatordept_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "receiver", scope = Log.class)
    public JAXBElement<String> createLogReceiver(String value) {
        return new JAXBElement<String>(_LogReceiver_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "annexdocids", scope = Log.class)
    public JAXBElement<String> createLogAnnexdocids(String value) {
        return new JAXBElement<String>(_LogAnnexdocids_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "agenttype", scope = Log.class)
    public JAXBElement<String> createLogAgenttype(String value) {
        return new JAXBElement<String>(_LogAgenttype_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "opdate", scope = Log.class)
    public JAXBElement<String> createLogOpdate(String value) {
        return new JAXBElement<String>(_LogOpdate_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "requestLogId", scope = Log.class)
    public JAXBElement<String> createLogRequestLogId(String value) {
        return new JAXBElement<String>(_LogRequestLogId_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "comment", scope = Log.class)
    public JAXBElement<String> createLogComment(String value) {
        return new JAXBElement<String>(_LogComment_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "node", scope = Log.class)
    public JAXBElement<String> createLogNode(String value) {
        return new JAXBElement<String>(_LogNode_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "agentorbyagentid", scope = Log.class)
    public JAXBElement<String> createLogAgentorbyagentid(String value) {
        return new JAXBElement<String>(_LogAgentorbyagentid_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "id", scope = Log.class)
    public JAXBElement<String> createLogId(String value) {
        return new JAXBElement<String>(_RowId_QNAME, String.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "row", scope = DetailTable.class)
    public JAXBElement<ArrayOfRow> createDetailTableRow(ArrayOfRow value) {
        return new JAXBElement<ArrayOfRow>(_DetailTableRow_QNAME, ArrayOfRow.class, DetailTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "id", scope = DetailTable.class)
    public JAXBElement<String> createDetailTableId(String value) {
        return new JAXBElement<String>(_RowId_QNAME, String.class, DetailTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetailTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "detailTable", scope = DetailTableInfo.class)
    public JAXBElement<ArrayOfDetailTable> createDetailTableInfoDetailTable(ArrayOfDetailTable value) {
        return new JAXBElement<ArrayOfDetailTable>(_DetailTableInfoDetailTable_QNAME, ArrayOfDetailTable.class, DetailTableInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "log", scope = RequestLog.class)
    public JAXBElement<ArrayOfLog> createRequestLogLog(ArrayOfLog value) {
        return new JAXBElement<ArrayOfLog>(_RequestLogLog_QNAME, ArrayOfLog.class, RequestLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailTableInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "detailTableInfo", scope = RequestInfo.class)
    public JAXBElement<DetailTableInfo> createRequestInfoDetailTableInfo(DetailTableInfo value) {
        return new JAXBElement<DetailTableInfo>(_RequestInfoDetailTableInfo_QNAME, DetailTableInfo.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MainTableInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "mainTableInfo", scope = RequestInfo.class)
    public JAXBElement<MainTableInfo> createRequestInfoMainTableInfo(MainTableInfo value) {
        return new JAXBElement<MainTableInfo>(_RequestInfoMainTableInfo_QNAME, MainTableInfo.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "requestLog", scope = RequestInfo.class)
    public JAXBElement<RequestLog> createRequestInfoRequestLog(RequestLog value) {
        return new JAXBElement<RequestLog>(_RequestInfoRequestLog_QNAME, RequestLog.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "workflowid", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoWorkflowid(String value) {
        return new JAXBElement<String>(_RequestInfoWorkflowid_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "lastoperator", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoLastoperator(String value) {
        return new JAXBElement<String>(_RequestInfoLastoperator_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "isNextFlow", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoIsNextFlow(String value) {
        return new JAXBElement<String>(_RequestInfoIsNextFlow_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordSetTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "rsTrans", scope = RequestInfo.class)
    public JAXBElement<RecordSetTrans> createRequestInfoRsTrans(RecordSetTrans value) {
        return new JAXBElement<RecordSetTrans>(_RequestInfoRsTrans_QNAME, RecordSetTrans.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "requestlevel", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoRequestlevel(String value) {
        return new JAXBElement<String>(_RequestInfoRequestlevel_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "requestid", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoRequestid(String value) {
        return new JAXBElement<String>(_RequestInfoRequestid_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "creatorid", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoCreatorid(String value) {
        return new JAXBElement<String>(_RequestInfoCreatorid_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "hostid", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoHostid(String value) {
        return new JAXBElement<String>(_RequestInfoHostid_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "requestManager", scope = RequestInfo.class)
    public JAXBElement<RequestManager> createRequestInfoRequestManager(RequestManager value) {
        return new JAXBElement<RequestManager>(_RequestInfoRequestManager_QNAME, RequestManager.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "description", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoDescription(String value) {
        return new JAXBElement<String>(_RequestInfoDescription_QNAME, String.class, RequestInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.workflow.soa.weaver", name = "remindtype", scope = RequestInfo.class)
    public JAXBElement<String> createRequestInfoRemindtype(String value) {
        return new JAXBElement<String>(_RequestInfoRemindtype_QNAME, String.class, RequestInfo.class, value);
    }

}
