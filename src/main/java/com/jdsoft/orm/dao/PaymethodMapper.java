package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.Paymethod;
import java.util.List;

public interface PaymethodMapper {
    int deleteByPrimaryKey(Integer paymethodId);

    int insert(Paymethod record);

    Paymethod selectByPrimaryKey(Integer paymethodId);

    List<Paymethod> selectAll();

    int updateByPrimaryKey(Paymethod record);
}