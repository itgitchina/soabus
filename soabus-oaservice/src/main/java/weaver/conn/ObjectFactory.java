
package weaver.conn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.itg.soabus.oaservice.ArrayOfInt;
import com.itg.soabus.oaservice.ArrayOfString;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the weaver.conn package. 
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

    private final static QName _RecordSetTransMsg_QNAME = new QName("http://conn.weaver", "msg");
    private final static QName _RecordSetTransColumnName_QNAME = new QName("http://conn.weaver", "columnName");
    private final static QName _RecordSetTransDBType_QNAME = new QName("http://conn.weaver", "DBType");
    private final static QName _RecordSetTransColumnType_QNAME = new QName("http://conn.weaver", "columnType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: weaver.conn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecordSetTrans }
     * 
     */
    public RecordSetTrans createRecordSetTrans() {
        return new RecordSetTrans();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conn.weaver", name = "msg", scope = RecordSetTrans.class)
    public JAXBElement<String> createRecordSetTransMsg(String value) {
        return new JAXBElement<String>(_RecordSetTransMsg_QNAME, String.class, RecordSetTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conn.weaver", name = "columnName", scope = RecordSetTrans.class)
    public JAXBElement<ArrayOfString> createRecordSetTransColumnName(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_RecordSetTransColumnName_QNAME, ArrayOfString.class, RecordSetTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conn.weaver", name = "DBType", scope = RecordSetTrans.class)
    public JAXBElement<String> createRecordSetTransDBType(String value) {
        return new JAXBElement<String>(_RecordSetTransDBType_QNAME, String.class, RecordSetTrans.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conn.weaver", name = "columnType", scope = RecordSetTrans.class)
    public JAXBElement<ArrayOfInt> createRecordSetTransColumnType(ArrayOfInt value) {
        return new JAXBElement<ArrayOfInt>(_RecordSetTransColumnType_QNAME, ArrayOfInt.class, RecordSetTrans.class, value);
    }

}
