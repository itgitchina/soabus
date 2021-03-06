package com.itg.soabus.common;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.ObjectFactory;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import com.itg.soabus.oaservice.RequestService;
import com.itg.soabus.oaservice.RequestServicePortType;

public class OAService {

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	// @Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean checkAuthByLdap(String username, String password) {
		Hashtable<String, String> env = new Hashtable<String, String>(11);
		boolean b = false;
		env.put(Context.INITIAL_CONTEXT_FACTORY,
				"com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://itgpdc.itg.net:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.REFERRAL, "follow");

		if (!username.toLowerCase().contains("@itg.net")) {
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
			logger.error("user " + username + "password: " + password
					+ e.getMessage());
		}
		return b;
	}

	public String getOACurrencyId(String currency) {

		Map<String, String> paramMap = new HashMap<String, String>();
		if (currency.equals("CNY")) {
			currency = "RMB";
		}
		paramMap.put("currencyname", currency);
		Integer id = jdbcTemplate.query(
				"select  id from fnaCurrency where currencyname=:currencyname",
				paramMap, new ResultSetExtractor<Integer>() {

					// @Override
					public Integer extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						Integer id = -1;
						if (rs.next()) {
							id = rs.getInt(1);
						}
						return id;
					}

				});

		return id.toString();

	}

	public String getOADomainValue(String fieldId, String selectName) {

		Map<String, String> paramMap = new HashMap<String, String>();

		paramMap.put("fieldid", fieldId);
		paramMap.put("selectname", selectName);
		Integer id = jdbcTemplate
				.query("select selectvalue from workflow_selectitem where fieldid=:fieldid and selectname=:selectname",
						paramMap, new ResultSetExtractor<Integer>() {

							// @Override
							public Integer extractData(ResultSet rs)
									throws SQLException, DataAccessException {

								Integer loginId = -1;
								if (rs.next()) {
									loginId = rs.getInt(1);
								}
								return loginId;
							}

						});

		return id.toString();

	}

	public Integer getOAUserCorp(String userName) {

		Map<String, String> paramMap = new HashMap<String, String>();
		if (userName.contains("@itg.net")) {
			userName = userName.replace("@itg.net", "");
		}
		paramMap.put("loginid", userName);

		Integer loginId = jdbcTemplate.query(
				"select id, corp from hrmresource where loginid=:loginid",
				paramMap, new ResultSetExtractor<Integer>() {

					// @Override
					public Integer extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						Integer loginId = -1;
						if (rs.next()) {
							loginId = rs.getInt(2);
						}
						return loginId;
					}

				});

		if (loginId == -1) {
			logger.error("Can't find user " + userName
					+ "'s OA login id, start workflow fail!!");
		}
		return loginId;

	}

	public boolean checkWorkFlowExists(Integer requestId, String oaWsdlLocation) throws MalformedURLException {

		RequestService service = new RequestService(new URL(oaWsdlLocation));
		RequestServicePortType port = service.getRequestServiceHttpPort();

		RequestInfo requestInfo = port.getRequest(requestId);

		if (requestInfo != null) {
			return true;
		} else {
			return false;
		}
	}

	public Integer getOAUserId(String userName) {

		Map<String, String> paramMap = new HashMap<String, String>();
		if (userName.contains("@itg.net")) {
			userName = userName.replace("@itg.net", "");
		}
		paramMap.put("loginid", userName);

		Integer loginId = jdbcTemplate.query(
				"select id, loginid from hrmresource where loginid=:loginid",
				paramMap, new ResultSetExtractor<Integer>() {

					// @Override
					public Integer extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						Integer loginId = -1;
						if (rs.next()) {
							loginId = rs.getInt(1);
						}
						return loginId;
					}

				});

		if (loginId == -1) {
			logger.error("Can't find user " + userName
					+ "'s OA login id, start workflow fail!!");
		}
		return loginId;

	}

	public Integer getOAUserDept(String userName) {

		Map<String, String> paramMap = new HashMap<String, String>();
		if (userName.contains("@itg.net")) {
			userName = userName.replace("@itg.net", "");
		}
		paramMap.put("loginid", userName);

		Integer loginId = jdbcTemplate.query(
				"select id, dept from hrmresource where loginid=:loginid",
				paramMap, new ResultSetExtractor<Integer>() {

					// @Override
					public Integer extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						Integer loginId = -1;
						if (rs.next()) {
							loginId = rs.getInt(2);
						}
						return loginId;
					}

				});

		if (loginId == -1) {
			logger.error("Can't find user " + userName
					+ "'s OA login id, start workflow fail!!");
		}
		return loginId;

	}

	public Property makeProperty(String name, String value) {
		return makeProperty(name, value, null);

	}

	public Property makeProperty(String name, String value, String type) {

		Property p = new Property();
		ObjectFactory objFactory = new ObjectFactory();
		p.setName(objFactory.createPropertyName(name));
		p.setValue(objFactory.createPropertyValue(value));
		p.setType(objFactory.createPropertyType(type));
		return p;

	}

	public Cell makeCell(String name, String value) {
		ObjectFactory objFactory = new ObjectFactory();
		Cell cell = objFactory.createCell();
		cell.setName(objFactory.createCellName(name));
		if (value != null) {
			cell.setValue(objFactory.createCellValue(value));
		} else {
			cell.setValue(objFactory.createCellValue(""));
		}
		return cell;
	}

}
