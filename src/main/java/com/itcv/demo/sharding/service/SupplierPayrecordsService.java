package com.itcv.demo.sharding.service;

import com.itcv.demo.sharding.po.SupplierPayrecords;

import java.math.BigDecimal;

public interface SupplierPayrecordsService {

	int insertSupplierPayrecords(SupplierPayrecords supplierPayrecordsDto) throws Exception;

	/**
	 * 查询供应商余额
	 * @param supplierPayrecords
	 * @return
	 */
	BigDecimal getSupplierBalance(SupplierPayrecords supplierPayrecords) throws Exception;



}