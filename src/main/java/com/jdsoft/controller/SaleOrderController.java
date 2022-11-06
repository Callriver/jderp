package com.jdsoft.controller;

import com.jdsoft.orm.model.SaleDtl;
import com.jdsoft.orm.model.SaleMain;
import com.jdsoft.service.SaleOrderService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController("/saleOrder")
public class SaleOrderController {
    @Autowired
    SaleOrderService saleOrderService;

    /**
     * 录入销售单
     * @param saleMain
     * @param saleDtl
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object add(@RequestBody SaleMain saleMain, @RequestBody List<SaleDtl> saleDtl){
        Result result = saleOrderService.add(saleMain, saleDtl);
        return result;
    }
    /**
     * 删除销售单
     * @param saleCode
     * @return
     */
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Object del(@RequestParam String saleCode){
        Result result = saleOrderService.del(saleCode);
        return result;
    }

    /***
     * 维护销售单main
     * @param saleMain
     * @return
     */
    @RequestMapping(value = "/updMain",method = RequestMethod.POST)
    public Object updMain(@RequestBody SaleMain saleMain){
        Result result = saleOrderService.updMain(saleMain);
        return result;
    }
    /***
     * 维护销售单dtl
     * @param saleDtls
     * @return
     */
    @RequestMapping(value = "/updDtl",method = RequestMethod.POST)
    public Object updDtl(@RequestBody List<SaleDtl> saleDtls){
        Result result = saleOrderService.updDtl(saleDtls);
        return result;
    }
    /**
     * 查询
     * @param saleCode
     * @param saleType
     * @param salePerson
     * @param beginDate
     * @param endDate
     * @param commodityId
     * @param commodityName
     * @return
     */
    @RequestMapping(value = "/qry",method = RequestMethod.POST)
    public Object qry(@RequestParam String saleCode,String saleType,String salePerson,
                      @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date beginDate,
                      @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")Date endDate,
                      @RequestParam String commodityId,@RequestParam String commodityName){
        Result result = saleOrderService.qry(saleCode, saleType, salePerson, beginDate, endDate, commodityId, commodityName);
        return result;
    }
}
