package com.itcv.demo.sharding.controller;

import com.itcv.demo.sharding.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: redisdemo
 * @description:
 * @author: zf
 * @create: 2020-06-23 16:14
 */
@Controller
@RequestMapping("/finance/report/")
public class LedgerController {
    @Autowired
    private LedgerService ledgerService;

    @RequestMapping("test")
    @ResponseBody
    public void test(String orgCode){
        ledgerService.testLeftJoin(orgCode);
    }
}