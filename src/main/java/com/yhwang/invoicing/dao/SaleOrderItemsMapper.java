package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.SaleOrderItems;

public interface SaleOrderItemsMapper {
    int deleteByPrimaryKey(Integer soiId);

    int insert(SaleOrderItems record);

    int insertSelective(SaleOrderItems record);

    SaleOrderItems selectByPrimaryKey(Integer soiId);

    int updateByPrimaryKeySelective(SaleOrderItems record);

    int updateByPrimaryKey(SaleOrderItems record);
}