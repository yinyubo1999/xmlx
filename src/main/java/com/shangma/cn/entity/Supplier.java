package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;

public class Supplier extends BaseEntity {


    private String supplierName;

    private String supplierCnntact;

    private String supplierEmail;

    private String supplierAddress;

    private String supplierBrank;

    private String supplierBrankCode;



    private String supplierPhone;



    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierCnntact() {
        return supplierCnntact;
    }

    public void setSupplierCnntact(String supplierCnntact) {
        this.supplierCnntact = supplierCnntact == null ? null : supplierCnntact.trim();
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    public String getSupplierBrank() {
        return supplierBrank;
    }

    public void setSupplierBrank(String supplierBrank) {
        this.supplierBrank = supplierBrank == null ? null : supplierBrank.trim();
    }

    public String getSupplierBrankCode() {
        return supplierBrankCode;
    }

    public void setSupplierBrankCode(String supplierBrankCode) {
        this.supplierBrankCode = supplierBrankCode == null ? null : supplierBrankCode.trim();
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }
}