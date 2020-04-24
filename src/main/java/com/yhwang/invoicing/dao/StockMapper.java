package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(Integer commId);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer commId);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}