package com.itg.soabus.contract.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itg.soabus.contract.domain.TradeContract;

@Controller
@RequestMapping("/contract")
public class TradeContractController {

	@Value("${oa_server_address}")
	private String oaServerAddress;

	@RequestMapping("/downloadtxt")
	public @ResponseBody
	ResponseEntity<byte[]> downloadContractTxt(
			@RequestParam(value = "contractno", required = true) String contractNo,
			@RequestParam(value = "type", required = true) String type,
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

		byte[] doc;

		if (type.equals("sales")) {
			doc = tc.getSalesDoc();
		} else {
			doc = tc.getPurchaseDoc();
		}

		InputStream is = new ByteArrayInputStream(doc);

		headers.setContentLength(doc.length);

		headers.setExpires(-1);
		headers.setCacheControl("no-cache");
		headers.setPragma("no-cache");

		headers.add("Content-Disposition",
				"attachment; filename=\"" + tc.getContractNo() + "-" + type
						+ ".doc\"");

		return new ResponseEntity<byte[]>(doc, headers, HttpStatus.OK);

	}

	@RequestMapping("/openworkflow")
	public ModelAndView redirectToOA(
			@RequestParam(value = "contractno", required = true) String contractNo,
			HttpServletResponse response) {

		List<TradeContract> tcs = TradeContract
				.findTradeContractsByContractNoEquals(contractNo)
				.getResultList();
		TradeContract tc;
		response.setHeader("Expires", "-1");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Paramga", "no-cache");

		ModelAndView modelAndView;

		if (tcs.size() == 0) {

			modelAndView = new ModelAndView("contractNoFound");

			return modelAndView;
		}

		tc = tcs.get(0);

		if (tc.getOaResponse() == null
				|| Integer.parseInt(tc.getOaResponse()) < 0) {
			modelAndView = new ModelAndView("contractNoFound");

			return modelAndView;

		}

		// response.sendRedirect(arg0);
		modelAndView = new ModelAndView("redirectToOA");

		String redirectTo = "http://"
				+ oaServerAddress
				// +
				// "/login/Login.jsp?gopage=/workflow/request/ViewRequest.jsp?requestid="
				+ "/workflow/request/ViewRequest.jsp?requestid="
				+ tc.getOaResponse();

		modelAndView.addObject("oaLink", redirectTo);
		return modelAndView;

	}
}
