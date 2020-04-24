package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.OperatorBill;

public interface OperatorBillMapper {
    int deleteByPrimaryKey(Integer operId);

    int insert(OperatorBill record);

    int insertSelective(OperatorBill record);

    OperatorBill selectByPrimaryKey(Integer operId);

    int updateByPrimaryKeySelective(OperatorBill record);

    int updateByPrimaryKey(OperatorBill record);
}