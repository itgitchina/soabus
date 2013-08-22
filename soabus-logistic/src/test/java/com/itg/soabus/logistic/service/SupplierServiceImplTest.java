package com.itg.soabus.logistic.service;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.itg.soabus.logistic.domain.SupplierAppInfo;
import com.itg.soabus.logistic.domain.SupplierAppInfoKey;
import com.itg.soabus.logistic.domain.SupplierProperty;

@ContextConfiguration(locations = {
		// "/META-INF/spring/applicationContext-jms.xml",
		"/META-INF/spring/applicationContext.xml",
		"/META-INF/spring/applicationContext-cxf.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SupplierServiceImplTest {

	@Autowired
	private SupplierServiceImpl service;

	@Test
	@Transactional
	public void testStartSupplierAppWorkflow2() throws MalformedURLException {

		SupplierAppInfoKey key = new SupplierAppInfoKey();
		key.setLgfnr("0000000019");
		key.setOpeKind("00");
		key.setOpeType("01");

		SupplierAppInfo supplier = SupplierAppInfo.findSupplierAppInfo(key);
		SupplierProperty p = new SupplierProperty();
		p.setName("供应商");
		p.setValue("供应商名称!");
		supplier.getProperties().add(p);
		p = new SupplierProperty();
		p.setName("法人代表");
		p.setValue("法人代表!");

		supplier.getProperties().add(p);

		service.startSupplierAppWorkflow("clw", "630821", supplier);

		supplier.merge();

	}

	// @Test
	@Transactional
	public void testStartSupplierAppWorkflow() throws MalformedURLException {

		SupplierAppInfoKey key = new SupplierAppInfoKey();
		key.setLgfnr("000100000");
		key.setOpeKind("001");
		key.setOpeType("02");

		SupplierAppInfo supplier = SupplierAppInfo.findSupplierAppInfo(key); // new
																				// SupplierAppInfo();
		// supplier.setKey(key);

		// List<SupplierProperty> properties = new
		// ArrayList<SupplierProperty>();

		SupplierProperty p = new SupplierProperty();
		p.setName("供应商");
		p.setValue("供应商名称!");
		supplier.getProperties().add(p);
		p = new SupplierProperty();
		p.setName("法人代表");
		p.setValue("法人代表!");

		supplier.getProperties().add(p);

		// supplier.setProperties(properties);
		service.startSupplierAppWorkflow("clw", "630821", supplier);
		supplier.merge();
	}
}
