package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer commId);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer commId);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}