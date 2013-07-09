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

	@RequestMapping("/openworkflow")
	public @ResponseBody
	ResponseEntity<String> redirectToOA(
			@RequestParam(value = "contractno", required = true) String contractNo,
			HttpServletResponse response) {

		List<TradeContract> tcs = TradeContract
				.findTradeContractsByContractNoEquals(contractNo)
				.getResultList();
		TradeContract tc;

		HttpHeaders headers = new HttpHeaders();
		if (tcs.size() == 0) {

			headers.add("Content-Type", "text/html; charset=utf-8");
			return new ResponseEntity<String>(null, headers,
					HttpStatus.NOT_FOUND);

		}

		tc = tcs.get(0);

		// response.sendRedirect(arg0);

		String redirectTo = "http://"
				+ oaServerAddress
				+ "/workflow/request/ManageRequestNoForm.jsp?fromFlowDoc=&requestid="
				+ tc.getOaResponse()
				+ "&isrequest=0&isovertime=0&isaffirmance=&reEdit=1&seeflowdoc=0&isworkflowdoc=0&isfromtab=false";

		headers.add("Location", redirectTo);
		return new ResponseEntity<String>(redirectTo, headers,
				HttpStatus.MOVED_PERMANENTLY);

		// return "redirect:http://yahoo.com"

	}

}
