package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.PurchaseContract;

public interface PurchaseContractMapper {
    int deleteByPrimaryKey(Integer pcId);

    int insert(PurchaseContract record);

    int insertSelective(PurchaseContract record);

    PurchaseContract selectByPrimaryKey(Integer pcId);

    int updateByPrimaryKeySelective(PurchaseContract record);

    int updateByPrimaryKey(PurchaseContract record);
}