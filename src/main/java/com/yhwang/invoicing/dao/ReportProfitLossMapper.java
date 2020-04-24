package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.ReportProfitLoss;

public interface ReportProfitLossMapper {
    int deleteByPrimaryKey(Integer rplId);

    int insert(ReportProfitLoss record);

    int insertSelective(ReportProfitLoss record);

    ReportProfitLoss selectByPrimaryKey(Integer rplId);

    int updateByPrimaryKeySelective(ReportProfitLoss record);

    int updateByPrimaryKey(ReportProfitLoss record);
}