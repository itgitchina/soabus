package com.itg.soabus.contract;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itg.soabus.contract.common.Result;
import com.itg.soabus.contract.domain.TradeContract;
import com.itg.soabus.messaging.TradeContractWorkflow;

@Controller
@Service
public class DocumentTemplateServiceImpl implements DocumentTemplateService {

	final Logger logger = LoggerFactory
			.getLogger(DocumentTemplateServiceImpl.class);

	@Autowired
	private transient JmsOperations jmsOperations;

	@Resource(name = "wsContext")
	private WebServiceContext wsCtxt;

	@RequestMapping("/downloadcontracttxt.doc")
	public @ResponseBody
	ResponseEntity<byte[]> downloadContractTxt(
			@RequestParam(value = "contractno", required = true) String contractNo,
			HttpServletResponse response) throws IOException {

		response.setContentType("application/x-msword");

		List<TradeContract> tcs = TradeContract
				.findTradeContractsByContractNoEquals(contractNo)
				.getResultList();

		HttpHeaders headers = new HttpHeaders();
		if (tcs.size() == 0) {

			headers.add("Content-Type", "text/html; charset=utf-8");
			return new ResponseEntity<byte[]>(null, headers,
					HttpStatus.NOT_FOUND);

		}

		TradeContract tc = tcs.get(0);

		InputStream is = new ByteArrayInputStream(tc.getDoc());

		headers.setContentLength(tc.getDoc().length);

		headers.add("Content-Disposition",
				"attachment; filename=\"" + tc.getContractNo() + ".doc\"");

		return new ResponseEntity<byte[]>(tc.getDoc(), headers, HttpStatus.OK);

	}

	public Result generateDocument(String userName, String password,
			TradeContract tradeContract, String templateName)
			throws SerialException, SQLException {
		Result result = new Result();
		boolean b = checkAuthByLdap(userName, password);
		if (!b) {
			result.setMsg("user auth failed");
			result.setResult(1);
			return result;
		}
		TradeContractWorkflow flow = new TradeContractWorkflow();
		flow.setTemplateName(templateName);
		flow.setTradeContract(tradeContract);
		flow.setUserName(userName);

		MessageContext msgCtxt = wsCtxt.getMessageContext();
		if (msgCtxt != null) {
			HttpServletRequest req = (HttpServletRequest) msgCtxt
					.get(MessageContext.SERVLET_REQUEST);
			flow.setDocumentServerAddress(req.getServerName() + ":"
					+ req.getServerPort());

		} else {
			flow.setDocumentServerAddress("127.0.0.1:8080");

		}

		jmsOperations.convertAndSend(flow);

		result.setResult(0);
		result.setMsg("Document has been send to Queue. Please Wait...");
		return result;
	}

	private Boolean checkAuthByLdap(String username, String password) {
		Hashtable<String, String> env = new Hashtable<String, String>(11);
		boolean b = false;
		env.put(Context.INITIAL_CONTEXT_FACTORY,
				"com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://itgpdc.itg.net:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.REFERRAL, "follow");

		if (!username.contains("@itg.net")) {
			username = username.concat("@itg.net");
		}
		env.put(Context.SECURITY_PRINCIPAL, username);
		env.put(Context.SECURITY_CREDENTIALS, password);
		try {
			DirContext ctx = new InitialDirContext(env);
			b = true;
			ctx.close();
			logger.info("user " + username + " successful checked!");
		} catch (NamingException e) {
			b = false;
			logger.error("user " + username + e.getMessage());
		}
		return b;
	}

	public void sendMessage(Object messageObject) {
		jmsOperations.convertAndSend(messageObject);
	}
}
