package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(Customer record);

    Customer selectByPrimaryKey(String customerId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}