package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Stor;

public interface StorMapper {
    int deleteByPrimaryKey(Integer storId);

    int insert(Stor record);

    int insertSelective(Stor record);

    Stor selectByPrimaryKey(Integer storId);

    int updateByPrimaryKeySelective(Stor record);

    int updateByPrimaryKey(Stor record);
}