package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.AccountReceviable;

public interface AccountReceviableMapper {
    int deleteByPrimaryKey(Integer arId);

    int insert(AccountReceviable record);

    int insertSelective(AccountReceviable record);

    AccountReceviable selectByPrimaryKey(Integer arId);

    int updateByPrimaryKeySelective(AccountReceviable record);

    int updateByPrimaryKey(AccountReceviable record);
}