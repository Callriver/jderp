package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.Currency;
import java.util.List;

public interface CurrencyMapper {
    int deleteByPrimaryKey(String currencyId);

    int insert(Currency record);

    Currency selectByPrimaryKey(String currencyId);

    List<Currency> selectAll();

    int updateByPrimaryKey(Currency record);
}