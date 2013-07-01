package com.itg.soabus.messaging;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itg.soabus.contract.domain.TradeContract;

@ContextConfiguration(locations = {
		"/META-INF/spring/applicationContext-jms.xml",
		"/META-INF/spring/applicationContext.xml",
		"/META-INF/spring/applicationContext-cxf.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TradeContractWorkflowTopicListenerTest {

	@Autowired
	private TradeContractWorkflowTopicListener tradeContractWorkflowTopicListener;




}
