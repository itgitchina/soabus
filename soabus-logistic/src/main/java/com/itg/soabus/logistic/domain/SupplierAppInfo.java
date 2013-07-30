package com.itg.soabus.logistic.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.jpa.identifier.RooIdentifier;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class SupplierAppInfo {

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumns({ @JoinColumn(name = "lgfnr", nullable = false),
			@JoinColumn(name = "ope_kind", nullable = false),
			@JoinColumn(name = "ope_type", nullable = false) })
	private List<SupplierProperty> properties;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumns({ @JoinColumn(name = "lgfnr", nullable = false),
			@JoinColumn(name = "ope_kind", nullable = false),
			@JoinColumn(name = "ope_type", nullable = false) })
	private List<StorageLocation> storages;

	private String oaResponse;

	@EmbeddedId
	private SupplierAppInfoKey key;
}
