package com.itcv.demo.sharding.po;

import java.math.BigDecimal;
import java.util.Date;

public class SupplierPayrecords {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 供应商编号
     */
    private String supplierNo;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 记账日期
     */
    private Date tallyTime;

    /**
     * 单据类型
     */
    private String billType;

    /**
     * 单据编号
     */
    private String billNo;

    /**
     * 借方
     */
    private BigDecimal debteAmount;

    /**
     * 贷方
     */
    private BigDecimal creditAmount;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 机构编号
     */
    private String orgCode;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除标志位：1有效，0删除
     */
    private Byte yn;

    /**
     * 制单时间
     */
    private Date billTime;

    /**
     * 制单人
     */
    private String billUser;
    /**
     * 备注
     */
    private String remarks;

    //开始时间
    private String startDate;
    //结束时间
    private String endDate;
    
    private Integer hexiaoState;
    
    private BigDecimal hexiaoMoney;
    
    public Integer getHexiaoState() {
		return hexiaoState;
	}

	public void setHexiaoState(Integer hexiaoState) {
		this.hexiaoState = hexiaoState;
	}

	public BigDecimal getHexiaoMoney() {
		return hexiaoMoney;
	}

	public void setHexiaoMoney(BigDecimal hexiaoMoney) {
		this.hexiaoMoney = hexiaoMoney;
	}

	public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public String getBillUser() {
        return billUser;
    }

    public void setBillUser(String billUser) {
        this.billUser = billUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo == null ? null : supplierNo.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Date getTallyTime() {
        return tallyTime;
    }

    public void setTallyTime(Date tallyTime) {
        this.tallyTime = tallyTime;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public BigDecimal getDebteAmount() {
        return debteAmount;
    }

    public void setDebteAmount(BigDecimal debteAmount) {
        this.debteAmount = debteAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
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

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}