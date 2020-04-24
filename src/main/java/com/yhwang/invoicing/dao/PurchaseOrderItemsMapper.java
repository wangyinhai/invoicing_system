package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.PurchaseOrderItems;

public interface PurchaseOrderItemsMapper {
    int deleteByPrimaryKey(Integer poiId);

    int insert(PurchaseOrderItems record);

    int insertSelective(PurchaseOrderItems record);

    PurchaseOrderItems selectByPrimaryKey(Integer poiId);

    int updateByPrimaryKeySelective(PurchaseOrderItems record);

    int updateByPrimaryKey(PurchaseOrderItems record);
}