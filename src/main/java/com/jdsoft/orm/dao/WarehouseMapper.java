package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.Warehouse;
import java.util.List;

public interface WarehouseMapper {
    int deleteByPrimaryKey(String warehouseId);

    int insert(Warehouse record);

    Warehouse selectByPrimaryKey(String warehouseId);

    List<Warehouse> selectAll();

    int updateByPrimaryKey(Warehouse record);
}