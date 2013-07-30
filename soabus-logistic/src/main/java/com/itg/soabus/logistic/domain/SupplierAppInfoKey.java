package com.itg.soabus.logistic.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;

@Embeddable
@RooJavaBean
public class SupplierAppInfoKey implements Serializable {

	@Size(max = 10)
	private String lgfnr; // SAP供应商编号

	@Size(max = 4)
	private String opeType; // 操作类型 新增，复评

	@Size(max = 2)
	private String opeKind; // 复评轮次
}
