package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.PurchaseInBill;

public interface PurchaseInBillMapper {
    int deleteByPrimaryKey(Integer pibId);

    int insert(PurchaseInBill record);

    int insertSelective(PurchaseInBill record);

    PurchaseInBill selectByPrimaryKey(Integer pibId);

    int updateByPrimaryKeySelective(PurchaseInBill record);

    int updateByPrimaryKey(PurchaseInBill record);
}