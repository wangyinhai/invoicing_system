package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.JxcGather;

public interface JxcGatherMapper {
    int deleteByPrimaryKey(Integer jgId);

    int insert(JxcGather record);

    int insertSelective(JxcGather record);

    JxcGather selectByPrimaryKey(Integer jgId);

    int updateByPrimaryKeySelective(JxcGather record);

    int updateByPrimaryKey(JxcGather record);
}