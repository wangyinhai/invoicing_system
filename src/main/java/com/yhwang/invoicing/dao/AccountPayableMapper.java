package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.AccountPayable;

public interface AccountPayableMapper {
    int deleteByPrimaryKey(Integer apId);

    int insert(AccountPayable record);

    int insertSelective(AccountPayable record);

    AccountPayable selectByPrimaryKey(Integer apId);

    int updateByPrimaryKeySelective(AccountPayable record);

    int updateByPrimaryKey(AccountPayable record);
}