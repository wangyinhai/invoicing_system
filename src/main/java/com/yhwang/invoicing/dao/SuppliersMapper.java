package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Suppliers;

public interface SuppliersMapper {
    int deleteByPrimaryKey(Integer suppId);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);

    Suppliers selectByPrimaryKey(Integer suppId);

    int updateByPrimaryKeySelective(Suppliers record);

    int updateByPrimaryKey(Suppliers record);
}