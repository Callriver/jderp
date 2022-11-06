package com.jdsoft.service;

import com.jdsoft.util.Result;

public interface InventoryService {
    Result qryInventory(String inventoryId,String commodityId,String commodityName);
}
