
package com.itg.soabus.oaservice;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out" type="{http://localhost/services/RequestService}anyType2anyTypeMap"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "out"
})
@XmlRootElement(name = "LoadTemplatePropResponse")
//@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
public class LoadTemplatePropResponse {

    @XmlElement(required = true, nillable = true)
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected AnyType2AnyTypeMap out;

    /**
     * ��ȡout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AnyType2AnyTypeMap }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public AnyType2AnyTypeMap getOut() {
        return out;
    }

    /**
     * ����out���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType2AnyTypeMap }
     *     
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setOut(AnyType2AnyTypeMap value) {
        this.out = value;
    }

}
