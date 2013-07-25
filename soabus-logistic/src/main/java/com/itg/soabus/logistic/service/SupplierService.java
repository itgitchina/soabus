package com.itg.soabus.logistic.service;

import javax.jws.WebService;

import com.itg.soabus.logistic.common.Result;
import com.itg.soabus.logistic.domain.SupplierAppInfo;

@WebService
public interface SupplierService {

	public Result apply(SupplierAppInfo supplierAppInfo);

}
