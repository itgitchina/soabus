
package com.itg.soabus.oaservice;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="out" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlRootElement(name = "nextNodeBySubmitResponse")
//@Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
public class NextNodeBySubmitResponse {

//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    protected boolean out;

    /**
     * ��ȡout���Ե�ֵ��
     * 
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public boolean isOut() {
        return out;
    }

    /**
     * ����out���Ե�ֵ��
     * 
     */
//    @Generated(value = "com.sun.tools.xjc.Driver", date = "2013-06-26T09:48:41+08:00", comments = "JAXB RI v2.2.6")
    public void setOut(boolean value) {
        this.out = value;
    }

}
