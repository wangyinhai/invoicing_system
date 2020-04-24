package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.UpdatePurchasePrice;

public interface UpdatePurchasePriceMapper {
    int deleteByPrimaryKey(Integer uppId);

    int insert(UpdatePurchasePrice record);

    int insertSelective(UpdatePurchasePrice record);

    UpdatePurchasePrice selectByPrimaryKey(Integer uppId);

    int updateByPrimaryKeySelective(UpdatePurchasePrice record);

    int updateByPrimaryKey(UpdatePurchasePrice record);
}