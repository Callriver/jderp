package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.SaleMain;

import java.util.Date;
import java.util.List;

public interface SaleMainMapper {
    int deleteByPrimaryKey(String saleMainCode);

    int insert(SaleMain record);

    SaleMain selectByPrimaryKey(String saleMainCode);

    List<SaleMain> selectAll();

    int updateByPrimaryKey(SaleMain record);

    List<SaleMain> qrySaleOrder(String saleCode, String saleType, String salePerson, Date beginDate, Date endDate);
}