package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.InventoryoprDtl;
import java.util.List;

public interface InventoryoprDtlMapper {
    int deleteByPrimaryKey(String inventoryoprMainCode);

    int insert(InventoryoprDtl record);

    InventoryoprDtl selectByPrimaryKey(String inventoryoprMainCode);

    List<InventoryoprDtl> selectAll();

    int updateByPrimaryKey(InventoryoprDtl record);
}