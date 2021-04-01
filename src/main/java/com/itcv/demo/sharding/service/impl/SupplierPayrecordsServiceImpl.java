package com.itcv.demo.sharding.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.itcv.demo.sharding.dao.SupplierPayrecordsMapper;
import com.itcv.demo.sharding.po.SupplierPayrecords;
import com.itcv.demo.sharding.service.SupplierPayrecordsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SupplierPayrecordsServiceImpl implements SupplierPayrecordsService {

  private static final Logger logger = LoggerFactory.getLogger(SupplierPayrecordsServiceImpl.class);
    @Autowired
    private SupplierPayrecordsMapper supplierPayrecordsMapper;

	

    @Override
    public int insertSupplierPayrecords(SupplierPayrecords supplierPayrecords) throws Exception{
        try {
            supplierPayrecords.setYn(new Byte("1"));
            logger.info("插入供应商往来账{}", JSONObject.toJSONString(supplierPayrecords));
            supplierPayrecordsMapper.insert(supplierPayrecords);
            return 1;
        } catch (Exception e) {
            logger.error("SupplierPayrecordsServiceImpl_insertSupplierPayrecords 插入供应商往来账异常{}",e);
            throw e;
        }

    }

    @Override
    public BigDecimal getSupplierBalance(SupplierPayrecords supplierPayrecords) throws Exception {
        logger.info("查询供应商余额{}", JSONObject.toJSONString(supplierPayrecords));
        BigDecimal bigDecimal;
        if("".equals(supplierPayrecords.getSupplierNo()) && null == supplierPayrecords){
            bigDecimal = new BigDecimal(0.00);
            return bigDecimal;
        }
        try {
                /**
                 * 供应商往来账页中的最后一条记录为当前供应商的余额
                 */
                SupplierPayrecords balanceRecords = supplierPayrecordsMapper.selectBalance(supplierPayrecords);
                if (null == balanceRecords) {

                    return new BigDecimal(0.00);
                } else {
                    return balanceRecords.getBalance();
                }

        } catch (Exception e) {
            logger.error("查询供应商余额异常",e);
            throw e;
        }
    }



}