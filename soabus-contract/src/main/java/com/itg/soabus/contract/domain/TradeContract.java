package com.itg.soabus.contract.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;

import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
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
	private Double ttlSalesAmount;
	private Double ttlPurchaseAmount;

	private String purchaseCurrency;
	private String salesCurrency;

	private String oaResponse;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] doc;

	public void copyTo(TradeContract dest) {
		dest.setCompany(getCompany());
		dest.setContractNo(getContractNo());
		dest.setCustomer(getCustomer());
		dest.setExternalNo(getExternalNo());
		dest.setItems(getItems());
		dest.setSalesLastDelivery(getSalesLastDelivery());
		dest.setPurchaseLastDelivery(getPurchaseLastDelivery());

		dest.setSalesAmtInWords(getSalesAmtInWords());
		dest.setPurchaseAmtInWords(getPurchaseAmtInWords());

		dest.setSignDate(getSignDate());
		dest.setSupplier(getSupplier());

		dest.setTtlSalesAmount(getTtlSalesAmount());
		dest.setTtlPurchaseAmount(getTtlPurchaseAmount());

		dest.setSalesCurrency(getSalesCurrency());
		dest.setPurchaseCurrency(getPurchaseCurrency());

		dest.setTtlQuantity(getTtlQuantity());

	}

}
