package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.PurchaseOrder;

public interface PurchaseOrderMapper {
    int deleteByPrimaryKey(Integer poId);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    PurchaseOrder selectByPrimaryKey(Integer poId);

    int updateByPrimaryKeySelective(PurchaseOrder record);

    int updateByPrimaryKey(PurchaseOrder record);
}