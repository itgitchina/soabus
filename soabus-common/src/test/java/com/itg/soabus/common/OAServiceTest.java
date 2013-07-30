package com.itg.soabus.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
import junit.framework.TestCase;

//@ContextConfiguration(locations = { "/META-INF/spring/applicationContext.xml" })
//@RunWith(SpringJUnit4ClassRunner.class)
public class OAServiceTest extends TestCase {

	private OAService service;

	@Override
	protected void setUp() throws Exception {

		service = new OAService();

		super.setUp();
	}

	@Test
	public void testGetOAUserCorp() {

		Integer corp = service.getOAUserCorp("clw");
		Assert.assertEquals(new Integer(1), corp);

	}
}
