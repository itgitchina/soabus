
package weaver.soa.workflow.request;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MainTableInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MainTableInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://request.workflow.soa.weaver}ArrayOfProperty" minOccurs="0"/>
 *         &lt;element name="propertyCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainTableInfo", propOrder = {
    "property",
    "propertyCount"
})
//@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
public class MainTableInfo {

    @XmlElementRef(name = "property", namespace = "http://request.workflow.soa.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<ArrayOfProperty> property;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer propertyCount;

    /**
     * ��ȡproperty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProperty }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<ArrayOfProperty> getProperty() {
        return property;
    }

    /**
     * ����property���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProperty }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setProperty(JAXBElement<ArrayOfProperty> value) {
        this.property = value;
    }

    /**
     * ��ȡpropertyCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getPropertyCount() {
        return propertyCount;
    }

    /**
     * ����propertyCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setPropertyCount(Integer value) {
        this.propertyCount = value;
    }

}
