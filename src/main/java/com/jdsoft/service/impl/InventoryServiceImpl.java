package com.jdsoft.service.impl;

import com.jdsoft.exception.enums.ErrorEnum;
import com.jdsoft.orm.dao.InventoryMapper;
import com.jdsoft.orm.model.Inventory;
import com.jdsoft.service.InventoryService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryMapper  inventoryMapper;
    @Override
    public Result qryInventory(String inventoryId, String commodityId, String commodityName) {
        List<Inventory> inventories = inventoryMapper.qryInventory(inventoryId, commodityId, commodityName);
        if (inventories.isEmpty()){
            return Result.fail(ErrorEnum.QUERY.getCode(), ErrorEnum.QUERY.getMsg());
        }
        return Result.success("success",inventories);
    }
}
