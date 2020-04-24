package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.SaleOrder;

public interface SaleOrderMapper {
    int deleteByPrimaryKey(Integer soId);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    SaleOrder selectByPrimaryKey(Integer soId);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
}