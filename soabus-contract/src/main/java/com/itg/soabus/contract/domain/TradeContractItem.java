package com.itg.soabus.contract.domain;

import java.io.Serializable;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooJpaActiveRecord
@RooToString
public class TradeContractItem implements Serializable{
	
	
	private String article;
	private String model;   
	private Double quantity; 
	private String unit; 
	
	private Double salesUnitPrice;   
	private Double salesAmount; 
	
	private Double purchaseUnitPrice;   
	private Double purchaseAmount; 

}
