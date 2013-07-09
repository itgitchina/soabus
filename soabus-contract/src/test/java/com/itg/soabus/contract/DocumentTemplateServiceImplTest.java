package com.itg.soabus.contract;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.rowset.serial.SerialException;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itg.soabus.contract.common.Result;
import com.itg.soabus.contract.domain.TradeContract;
import com.itg.soabus.contract.domain.TradeContractItem;
import com.itg.soabus.contract.service.DocumentTemplateServiceImpl;

@ContextConfiguration(locations = {
		"/META-INF/spring/applicationContext-jms.xml",
		"/META-INF/spring/applicationContext.xml",
		"/META-INF/spring/applicationContext-cxf.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class DocumentTemplateServiceImplTest {

	@Autowired
	private DocumentTemplateServiceImpl s;

	final Logger logger = LoggerFactory
			.getLogger(DocumentTemplateServiceImplTest.class);

	@Test
	public void testStartContractAduitWorkflow() {
		TradeContract tradeContract = TradeContract
				.findTradeContractsByContractNoEquals("contract_no")
				.getSingleResult();
		s.startContractAduitWorkflow("clw", tradeContract, "172.16.10.54:8080");

	}

	@Test
	public void testCheckAuthByLdap() throws NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class[] parameterTypes = new Class[2];
		parameterTypes[0] = java.lang.String.class;
		parameterTypes[1] = java.lang.String.class;

		Method method = s.getClass().getDeclaredMethod("checkAuthByLdap",
				parameterTypes);
		method.setAccessible(true);

		Object[] argObjects = new String[2];
		argObjects[0] = "clw@itg.net";

		argObjects[1] = "630821";

		boolean b = (Boolean) method.invoke(s, argObjects);

		Assert.assertTrue(b);

		argObjects[1] = "abc";

		b = (Boolean) method.invoke(s, argObjects);

		Assert.assertFalse(b);

	}

	@Test
	public void testGenerateDocumnent() throws SerialException, SQLException {

		TradeContract tc = new TradeContract();
		tc.setCompany("company");
		tc.setContractNo("contract_no");
		tc.setCustomer("customer");
		tc.setSalesLastDelivery(new Date());
		tc.setPurchaseLastDelivery(new Date());
		tc.setSignDate(new Date());
		tc.setPurchaseCurrency("USD");
		tc.setSalesCurrency("USD");

		tc.setSupplier("supplier");
		tc.setExternalNo("Externel No");

		ArrayList<TradeContractItem> items = new ArrayList<TradeContractItem>();

		TradeContractItem item = new TradeContractItem();

		item.setArticle("article1");
		item.setSalesUnitPrice(800d);
		item.setSalesAmount(90000d);
		item.setPurchaseAmount(90000d);
		item.setPurchaseUnitPrice(90000d);

		item.setQuantity(800d);

		items.add(item);

		item = new TradeContractItem();

		item.setArticle("article2");
		item.setSalesUnitPrice(800d);
		item.setSalesAmount(90000d);
		item.setQuantity(800d);

		item.setPurchaseAmount(90000d);
		item.setPurchaseUnitPrice(90000d);

		items.add(item);

		tc.setItems(items);

		Result r = s.generateDocument("clw@itg.net", "630821", tc,
				"\u4E70\u5356\u5408\u540C");

		Assert.assertEquals(new Integer(0), r.getResult());

		logger.info(r.getMsg());

	}

}
