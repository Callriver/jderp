package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.InventoryoprMain;
import java.util.List;

public interface InventoryoprMainMapper {
    int deleteByPrimaryKey(String inventoryoprMainCode);

    int insert(InventoryoprMain record);

    InventoryoprMain selectByPrimaryKey(String inventoryoprMainCode);

    List<InventoryoprMain> selectAll();

    int updateByPrimaryKey(InventoryoprMain record);
}