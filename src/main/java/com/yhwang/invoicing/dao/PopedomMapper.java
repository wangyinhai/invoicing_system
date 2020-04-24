package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Popedom;

public interface PopedomMapper {
    int deleteByPrimaryKey(Integer popeId);

    int insert(Popedom record);

    int insertSelective(Popedom record);

    Popedom selectByPrimaryKey(Integer popeId);

    int updateByPrimaryKeySelective(Popedom record);

    int updateByPrimaryKey(Popedom record);
}