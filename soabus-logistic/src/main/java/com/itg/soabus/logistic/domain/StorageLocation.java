package com.itg.soabus.logistic.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class StorageLocation {

	private String itemNo;
	private String locationNo;
	private String name;
	private String address;
}
