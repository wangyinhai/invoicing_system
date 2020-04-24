package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.CargoTransferBill;

public interface CargoTransferBillMapper {
    int deleteByPrimaryKey(Integer ctbId);

    int insert(CargoTransferBill record);

    int insertSelective(CargoTransferBill record);

    CargoTransferBill selectByPrimaryKey(Integer ctbId);

    int updateByPrimaryKeySelective(CargoTransferBill record);

    int updateByPrimaryKeyWithBLOBs(CargoTransferBill record);

    int updateByPrimaryKey(CargoTransferBill record);
}