package com.itcv.demo.sharding.dao;

import com.itcv.demo.sharding.po.Ledger;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface LedgerMapper {


    int insertSelective(Ledger record);

    /**
     * 批量插入商品账页
     * @param ledgerList
     * @return
     */
    int batchInsertLedger(List<Ledger> ledgerList);

    int deleteLedgerInit(String orgCode);

    List<Ledger> selectLedgerLast(Ledger ledger);

    List<Map<String,Object>> selectMaxId(@Param("drugCodes") List<String> drugCodes, @Param("orgCode") String orgCode);

    List<Ledger> selectLedgerLastById(@Param("idList") List<Integer> idList, @Param("orgCode") String orgCode);



}