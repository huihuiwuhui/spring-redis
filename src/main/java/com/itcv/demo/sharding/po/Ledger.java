package com.itcv.demo.sharding.po;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Ledger {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 药品编码
     */
    private String drugCode;

    /**
     * 单据类型
     */
    private String orderType;

    /**
     * 单据编号
     */
    private String orderCode;

    /**
     * 行号
     */
    private Integer seqNum;

    /**
     * 单据日期
     */
    private Date orderDate;

    /**
     * 往来单位编号
     */
    private String intercourseNum;

    /**
     * 入库数量
     */
    private BigDecimal amountIn;

    /**
     * 入库单价
     */
    private BigDecimal priceIn;

    /**
     * 入库金额
     */
    private BigDecimal sumIn;

    /**
     * 出库数量
     */
    private BigDecimal amountOut;

    /**
     * 出库金额
     */
    private BigDecimal sumOut;

    /**
     * 出库单价
     */
    private BigDecimal priceOut;

    /**
     * 总结存数量
     */
    private BigDecimal inventoryAmount;

    /**
     * 总结存金额
     */
    private BigDecimal inventorySum;

    /**
     * 总结存单价
     */
    private BigDecimal inventoryPrice;

    /**
     * 过账时间
     */
    private Date postDate;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 机构编号
     */
    private String orgCode;

    /**
     * 逻辑删除 1 有效 0 删除
     */
    private Integer yn;

    /**
     * 是否初始化数据 1 是 0 否
     */
    private Integer isInit;

    /**
     * 移动类型
     */
    private String moveType;

    /**
     * 大类
     */
    private String drugClass;

    /**
     * 移动类型是“采购入库” 需要记采购订单号
     */
    private String purchaseOrder;

    /**
     * 移动类型是“销售出库”需要记销售订单号
     */
    private String salesOrder;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 税率
     */
    private BigDecimal taxRate;

    /**
     * 原药品编码
     */
    private String originalDrugCode;

    /**
     * 含税入库单价
     */
    private BigDecimal taxPriceIn;

    /**
     * 含税入库金额
     */
    private BigDecimal taxSumIn;

    /**
     * 含税出库金额
     */
    private BigDecimal taxSumOut;

    /**
     * 含税出库单价
     */
    private BigDecimal taxPriceOut;

    /**
     * 含税结存金额
     */
    private BigDecimal taxInventorySum;

    /**
     * 含税结存单价
     */
    private BigDecimal taxInventoryPrice;

    /**
     * 往来单位名称
     */
    private String companyName;

    /**
     * 商品名称
     */
    private String drugName;

    List<String> drugCodes;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getIntercourseNum() {
        return intercourseNum;
    }

    public void setIntercourseNum(String intercourseNum) {
        this.intercourseNum = intercourseNum == null ? null : intercourseNum.trim();
    }

    public BigDecimal getAmountIn() {
        return amountIn;
    }

    public void setAmountIn(BigDecimal amountIn) {
        this.amountIn = amountIn;
    }

    public BigDecimal getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(BigDecimal priceIn) {
        this.priceIn = priceIn;
    }

    public BigDecimal getSumIn() {
        return sumIn;
    }

    public void setSumIn(BigDecimal sumIn) {
        this.sumIn = sumIn;
    }

    public BigDecimal getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(BigDecimal amountOut) {
        this.amountOut = amountOut;
    }

    public BigDecimal getSumOut() {
        return sumOut;
    }

    public void setSumOut(BigDecimal sumOut) {
        this.sumOut = sumOut;
    }

    public BigDecimal getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(BigDecimal priceOut) {
        this.priceOut = priceOut;
    }

    public BigDecimal getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(BigDecimal inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public BigDecimal getInventorySum() {
        return inventorySum;
    }

    public void setInventorySum(BigDecimal inventorySum) {
        this.inventorySum = inventorySum;
    }

    public BigDecimal getInventoryPrice() {
        return inventoryPrice;
    }

    public void setInventoryPrice(BigDecimal inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Integer getIsInit() {
        return isInit;
    }

    public void setIsInit(Integer isInit) {
        this.isInit = isInit;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType == null ? null : moveType.trim();
    }

    public String getDrugClass() {
        return drugClass;
    }

    public void setDrugClass(String drugClass) {
        this.drugClass = drugClass == null ? null : drugClass.trim();
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder == null ? null : purchaseOrder.trim();
    }

    public String getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(String salesOrder) {
        this.salesOrder = salesOrder == null ? null : salesOrder.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getOriginalDrugCode() {
        return originalDrugCode;
    }

    public void setOriginalDrugCode(String originalDrugCode) {
        this.originalDrugCode = originalDrugCode == null ? null : originalDrugCode.trim();
    }

    public BigDecimal getTaxPriceIn() {
        return taxPriceIn;
    }

    public void setTaxPriceIn(BigDecimal taxPriceIn) {
        this.taxPriceIn = taxPriceIn;
    }

    public BigDecimal getTaxSumIn() {
        return taxSumIn;
    }

    public void setTaxSumIn(BigDecimal taxSumIn) {
        this.taxSumIn = taxSumIn;
    }

    public BigDecimal getTaxSumOut() {
        return taxSumOut;
    }

    public void setTaxSumOut(BigDecimal taxSumOut) {
        this.taxSumOut = taxSumOut;
    }

    public BigDecimal getTaxPriceOut() {
        return taxPriceOut;
    }

    public void setTaxPriceOut(BigDecimal taxPriceOut) {
        this.taxPriceOut = taxPriceOut;
    }

    public BigDecimal getTaxInventorySum() {
        return taxInventorySum;
    }

    public void setTaxInventorySum(BigDecimal taxInventorySum) {
        this.taxInventorySum = taxInventorySum;
    }

    public BigDecimal getTaxInventoryPrice() {
        return taxInventoryPrice;
    }

    public void setTaxInventoryPrice(BigDecimal taxInventoryPrice) {
        this.taxInventoryPrice = taxInventoryPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public List<String> getDrugCodes() {
        return drugCodes;
    }

    public void setDrugCodes(List<String> drugCodes) {
        this.drugCodes = drugCodes;
    }
}