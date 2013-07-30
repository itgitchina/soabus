package com.itg.soabus.logistic.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itg.soabus.logistic.domain.SupplierAppInfo;
import com.itg.soabus.logistic.domain.SupplierAppInfoKey;
import com.itg.soabus.logistic.domain.SupplierProperty;

@ContextConfiguration(locations = {
		// "/META-INF/spring/applicationContext-jms.xml",
		"/META-INF/spring/applicationContext-cxf.xml",
		"/META-INF/spring/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SupplierServiceImplTest {

	@Autowired
	private SupplierServiceImpl service;

	@Test
	public void testStartSupplierAppWorkflow() {
		SupplierAppInfo supplier = new SupplierAppInfo();

		SupplierAppInfoKey key = new SupplierAppInfoKey();
		key.setLgfnr("000100000");
		key.setOpeKind("001");
		key.setOpeType("02");
		supplier.setKey(key);

		List<SupplierProperty> properties = new ArrayList<SupplierProperty>();

		SupplierProperty p = new SupplierProperty();
		p.setName("供应商");
		p.setValue("供应商名称!");
		p.setName("法人代表");
		p.setValue("法人代表!");

		properties.add(p);

		supplier.setProperties(properties);
		service.startSupplierAppWorkflow("clw", "630821", supplier);
		supplier.merge();
	}
}
