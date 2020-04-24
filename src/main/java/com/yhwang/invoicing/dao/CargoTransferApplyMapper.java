package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.CargoTransferApply;

public interface CargoTransferApplyMapper {
    int deleteByPrimaryKey(Integer ctaId);

    int insert(CargoTransferApply record);

    int insertSelective(CargoTransferApply record);

    CargoTransferApply selectByPrimaryKey(Integer ctaId);

    int updateByPrimaryKeySelective(CargoTransferApply record);

    int updateByPrimaryKey(CargoTransferApply record);
}