
package weaver.soa.workflow.request;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DetailTableInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DetailTableInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detailTable" type="{http://request.workflow.soa.weaver}ArrayOfDetailTable" minOccurs="0"/>
 *         &lt;element name="detailTableCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailTableInfo", propOrder = {
    "detailTable",
    "detailTableCount"
})
//@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
public class DetailTableInfo {

    @XmlElementRef(name = "detailTable", namespace = "http://request.workflow.soa.weaver", type = JAXBElement.class, required = false)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected JAXBElement<ArrayOfDetailTable> detailTable;
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected Integer detailTableCount;

    /**
     * ��ȡdetailTable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailTable }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public JAXBElement<ArrayOfDetailTable> getDetailTable() {
        return detailTable;
    }

    /**
     * ����detailTable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailTable }{@code >}
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setDetailTable(JAXBElement<ArrayOfDetailTable> value) {
        this.detailTable = value;
    }

    /**
     * ��ȡdetailTableCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public Integer getDetailTableCount() {
        return detailTableCount;
    }

    /**
     * ����detailTableCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setDetailTableCount(Integer value) {
        this.detailTableCount = value;
    }

}
