package com.jdsoft.controller;


import com.jdsoft.orm.model.Commodity;
import com.jdsoft.service.CommodityService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/***
 * 商品管理
 */
@RestController(value = "/commodity")
public class CommodityController {
    @Autowired
    CommodityService commodityService;

    /**
     *添加商品
     * @param commodity
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object add(@RequestBody Commodity commodity){
        Result result = commodityService.add(commodity);
        return result;
    }

    /**
     * 删除商品
     * @param commodity_id
     * @return
     */
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Object del(@RequestBody String commodity_id){
        Result result = commodityService.del(commodity_id);
        return result;
    }

    /**
     * 更新商品
     * @param commodity
     * @return
     */
    @RequestMapping(value = "/upd",method = RequestMethod.POST)
    public Object upd(@RequestBody Commodity commodity){
        Result result = commodityService.upd(commodity);
        return result;
    }

    /**
     * 根据id查商品信息
     * @param commodityId
     * @return
     */
    @RequestMapping(value = "/qry",method = RequestMethod.POST)
    public Object qry(@RequestBody String commodityId){
        Result result = commodityService.qry(commodityId);
        return result;
    }

    /**
     * 根据名称查商品信息
     * @param commodityName
     * @return
     */
    @RequestMapping(value = "/qryByCommodityName",method = RequestMethod.POST)
    public Object qryByCommodityName(@RequestBody String commodityName){
        Result result = commodityService.qryByName(commodityName);
        return result;
    }
}
