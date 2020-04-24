package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Posa;

public interface PosaMapper {
    int deleteByPrimaryKey(Integer posaId);

    int insert(Posa record);

    int insertSelective(Posa record);

    Posa selectByPrimaryKey(Integer posaId);

    int updateByPrimaryKeySelective(Posa record);

    int updateByPrimaryKey(Posa record);
}