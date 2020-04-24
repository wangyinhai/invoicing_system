package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.PurchaseInItems;

public interface PurchaseInItemsMapper {
    int deleteByPrimaryKey(Integer piiId);

    int insert(PurchaseInItems record);

    int insertSelective(PurchaseInItems record);

    PurchaseInItems selectByPrimaryKey(Integer piiId);

    int updateByPrimaryKeySelective(PurchaseInItems record);

    int updateByPrimaryKey(PurchaseInItems record);
}