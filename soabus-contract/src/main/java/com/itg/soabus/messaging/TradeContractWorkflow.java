package com.itg.soabus.messaging;

import java.io.Serializable;

import org.springframework.roo.addon.javabean.RooJavaBean;

import com.itg.soabus.contract.domain.TradeContract;

@RooJavaBean
public class TradeContractWorkflow implements Serializable {

	private String salesTemplateName;
	private String purchaseTemplateName;
	private TradeContract tradeContract;
	private String userName;
	private String documentServerAddress;
	

}
