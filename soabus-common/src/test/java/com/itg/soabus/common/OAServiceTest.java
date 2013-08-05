package com.itg.soabus.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
import junit.framework.TestCase;

@ContextConfiguration(locations = { "/META-INF/spring/applicationContext-soabus-common.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OAServiceTest extends TestCase {

	@Autowired
	private OAService service;

	@Override
	protected void setUp() throws Exception {

	}

	@Test
	public void testGetOAUserCorp() {

		Integer corp = service.getOAUserCorp("clw");
		Assert.assertEquals(new Integer(1), corp);

	}

	@Test
	public void testCheckAuthByLdap() {
		service.checkAuthByLdap("CLW@ITG.NET", "630821");
	}
}
