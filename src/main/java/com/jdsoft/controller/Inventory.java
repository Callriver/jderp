package com.jdsoft.controller;

import com.jdsoft.service.InventoryService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/***
 * 库存查询
 */
@RestController("/inventory")
public class Inventory {
    @Autowired
    InventoryService inventoryService;

    /**
     * 查询库存
     * @param inventoryId
     * @param commodityId
     * @param commodityName
     * @return
     */
    @RequestMapping(value = "/qry",method = RequestMethod.POST)
    public Object qry(String inventoryId, String commodityId, String commodityName){
        Result result = inventoryService.qryInventory(inventoryId, commodityId, commodityName);
        return result;
    }
}
