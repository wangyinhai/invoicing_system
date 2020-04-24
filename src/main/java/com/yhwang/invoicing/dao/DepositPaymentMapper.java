package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.DepositPayment;

public interface DepositPaymentMapper {
    int deleteByPrimaryKey(Integer dpId);

    int insert(DepositPayment record);

    int insertSelective(DepositPayment record);

    DepositPayment selectByPrimaryKey(Integer dpId);

    int updateByPrimaryKeySelective(DepositPayment record);

    int updateByPrimaryKey(DepositPayment record);
}