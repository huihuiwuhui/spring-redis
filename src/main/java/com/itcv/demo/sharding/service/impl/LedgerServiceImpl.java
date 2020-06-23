package com.itcv.demo.sharding.service.impl;

import com.itcv.demo.sharding.dao.LedgerMapper;
import com.itcv.demo.sharding.dao.OrderDao;
import com.itcv.demo.sharding.po.Ledger;
import com.itcv.demo.sharding.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: redisdemo
 * @description:
 * @author: zf
 * @create: 2020-06-23 16:05
 */
@Service
public class LedgerServiceImpl implements LedgerService {
    @Autowired
    private LedgerMapper ledgerMapper;
    @Autowired
    private OrderDao orderDao;

    @Override
    public void testLeftJoin(String orgCode) {
        Ledger ledgerQuery = new Ledger();
        ledgerQuery.setOrgCode(orgCode);
        List<String> drugCodes = new ArrayList<>();
        drugCodes.add("Y1015269");
        drugCodes.add("Y1017363");
        ledgerQuery.setDrugCodes(drugCodes);
        ledgerMapper.selectLedgerLast(ledgerQuery);
        for (int i = 0; i < 10; i++) {
            orderDao.insertOrder(new BigDecimal((i + 1) * 5), 1L, "WAIT_PAY");
        }
    }
}