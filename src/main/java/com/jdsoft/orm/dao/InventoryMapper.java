package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.Inventory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryMapper {
    int deleteByPrimaryKey(@Param("warehouseId") String warehouseId, @Param("item") String item);

    int insert(Inventory record);

    Inventory selectByPrimaryKey(@Param("warehouseId") String warehouseId, @Param("item") String item);

    List<Inventory> selectAll();

    int updateByPrimaryKey(Inventory record);
}