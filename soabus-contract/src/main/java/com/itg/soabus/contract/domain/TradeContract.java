package com.itg.soabus.contract.domain;

import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;

import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooJpaActiveRecord(finders = { "findTradeContractsByContractNoEquals" })
@RooToString
public class TradeContract implements Serializable {

	private String contractNo;
	private String externalNo;
	private String company;
	private String companyCode;
	private String companyEn; // KNA1-name3+name4
	private String supplier;
	private String customer;

	private Date signDate;

	private Date salesLastDelivery;
	private Date purchaseLastDelivery;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<TradeContractItem> items;

	private Double ttlQuantity;
	private String salesAmtInWords;
	private String purchaseAmtInWords;
	private String purchaseAmtInEnWords;
	private Double ttlSalesAmount;
	private Double ttlPurchaseAmount;

	private String purchaseCurrency;

	private String salesCurrency;

	private String pruchaseTradingTerms;
	private String salesTradingTerms;

	private String oaResponse;

	private String supplierAddress;
	private String supplierTel;
	private String supplierFax;
	private String supplierLegalPerson;

	private String customerAddress;
	private String customerTel;
	private String customerFax;
	private String customerLegalPerson;

	private String companyAddress;
	private String companyLegalPerson;

	private String markTxt;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] salesDoc;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] purchaseDoc;

	public void copyTo(TradeContract dest) throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {

		// BeanUtils.copyProperties(this, dest);
		PropertyDescriptor[] properties = PropertyUtils
				.getPropertyDescriptors(dest);

		java.util.Date defaultValue = null;
		Converter converter = new DateConverter(defaultValue);
		BeanUtilsBean beanUtilsBean = BeanUtilsBean.getInstance();
		beanUtilsBean.getConvertUtils().register(converter,
				java.util.Date.class);

		for (PropertyDescriptor p : properties) {
			if (!"salesDoc, id, version, purchaseDoc, items, class".contains(p
					.getName())) {

				BeanUtils.setProperty(dest, p.getName(),
						BeanUtils.getProperty(this, p.getName()));
			}
		}
		dest.setSignDate(getSignDate());
		dest.setPurchaseLastDelivery(getPurchaseLastDelivery());
		dest.setSalesLastDelivery(getSalesLastDelivery());

		dest.setItems(getItems());

		/*
		 * dest.setCompany(getCompany()); dest.setContractNo(getContractNo());
		 * dest.setCustomer(getCustomer()); dest.setExternalNo(getExternalNo());
		 * dest.setItems(getItems());
		 * dest.setSalesLastDelivery(getSalesLastDelivery());
		 * dest.setPurchaseLastDelivery(getPurchaseLastDelivery());
		 * 
		 * dest.setSalesAmtInWords(getSalesAmtInWords());
		 * dest.setPurchaseAmtInWords(getPurchaseAmtInWords());
		 * 
		 * dest.setSignDate(getSignDate()); dest.setSupplier(getSupplier());
		 * 
		 * dest.setTtlSalesAmount(getTtlSalesAmount());
		 * dest.setTtlPurchaseAmount(getTtlPurchaseAmount());
		 * 
		 * dest.setSalesCurrency(getSalesCurrency());
		 * dest.setPurchaseCurrency(getPurchaseCurrency());
		 * 
		 * dest.setTtlQuantity(getTtlQuantity());
		 */

	}

}
