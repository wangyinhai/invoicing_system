package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Depot;

public interface DepotMapper {
    int deleteByPrimaryKey(Integer depotId);

    int insert(Depot record);

    int insertSelective(Depot record);

    Depot selectByPrimaryKey(Integer depotId);

    int updateByPrimaryKeySelective(Depot record);

    int updateByPrimaryKey(Depot record);
}