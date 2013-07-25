package com.itg.soabus.logistic.domain;

import java.util.List;

import javax.persistence.OneToMany;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class SupplierAppInfo {

	@OneToMany
	private List<SupplierProperty> properties;

	@OneToMany
	private List<StorageLocation> storages;
}
