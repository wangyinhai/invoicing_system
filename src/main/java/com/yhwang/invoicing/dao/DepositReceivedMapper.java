package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.DepositReceived;

public interface DepositReceivedMapper {
    int deleteByPrimaryKey(Integer drId);

    int insert(DepositReceived record);

    int insertSelective(DepositReceived record);

    DepositReceived selectByPrimaryKey(Integer drId);

    int updateByPrimaryKeySelective(DepositReceived record);

    int updateByPrimaryKey(DepositReceived record);
}