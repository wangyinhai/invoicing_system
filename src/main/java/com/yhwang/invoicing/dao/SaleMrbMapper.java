package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.SaleMrb;

public interface SaleMrbMapper {
    int deleteByPrimaryKey(Integer smId);

    int insert(SaleMrb record);

    int insertSelective(SaleMrb record);

    SaleMrb selectByPrimaryKey(Integer smId);

    int updateByPrimaryKeySelective(SaleMrb record);

    int updateByPrimaryKey(SaleMrb record);
}