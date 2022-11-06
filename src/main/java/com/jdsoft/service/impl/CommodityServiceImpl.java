package com.jdsoft.service.impl;

import com.jdsoft.exception.enums.ErrorEnum;
import com.jdsoft.orm.dao.CommodityMapper;
import com.jdsoft.orm.model.Commodity;
import com.jdsoft.service.CommodityService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    CommodityMapper commodityMapper;
    @Override
    public Result add(Commodity commodity) {
        int insert = commodityMapper.insert(commodity);
        if (insert>0){
            return Result.success("success");
        }else{
            return Result.fail(ErrorEnum.ADD.getCode(), ErrorEnum.ADD.getMsg());
        }
    }

    @Override
    public Result del(String commodity_id) {
        int i = commodityMapper.deleteByPrimaryKey(commodity_id);
        if (i>0){
            return Result.success("success");
        }else{
            return Result.fail(ErrorEnum.DELETE.getCode(), ErrorEnum.DELETE.getMsg());
        }
    }

    @Override
    public Result upd(Commodity commodity) {
        int i = commodityMapper.updateByPrimaryKey(commodity);
        if (i>0){
            return Result.success("success",commodity);
        }else{
            return Result.fail(ErrorEnum.DELETE.getCode(), ErrorEnum.DELETE.getMsg());
        }
    }

    @Override
    public Result qry(String commodityId) {
        Commodity commodity = commodityMapper.selectByPrimaryKey(commodityId);
        if (commodity!=null){
            return Result.success("success",commodity);
        }else {
            return Result.fail(ErrorEnum.QUERY.getCode(),ErrorEnum.QUERY.getMsg());
        }
    }

    @Override
    public Result qryByName(String commodityName) {
        List<Commodity> commodities = commodityMapper.selectByName(commodityName);
        if (commodities.isEmpty()){
            return Result.fail(ErrorEnum.QUERY.getCode(),ErrorEnum.QUERY.getMsg());
        }else {
            return Result.success("success",commodities);
        }
    }
}
