package com.yhwang.invoicing.dao;

import com.yhwang.invoicing.entity.Client;

public interface ClientMapper {
    int insert(Client record);

    int insertSelective(Client record);
}