package com.itg.soabus.logistic.service;

import java.net.MalformedURLException;

import javax.jws.WebService;

import com.itg.soabus.common.Result;
import com.itg.soabus.logistic.domain.SupplierAppInfo;

@WebService
public interface SupplierService {

	public Result apply(String userName, String password,
			SupplierAppInfo supplierAppInfo) throws MalformedURLException;

}
