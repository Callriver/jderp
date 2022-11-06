package com.jdsoft.service.impl;

import com.jdsoft.exception.enums.ErrorEnum;
import com.jdsoft.orm.dao.SaleDtlMapper;
import com.jdsoft.orm.dao.SaleMainMapper;
import com.jdsoft.orm.model.SaleDtl;
import com.jdsoft.orm.model.SaleMain;
import com.jdsoft.service.SaleOrderService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class SaleOrderServiceImpl implements SaleOrderService {
    @Autowired
    SaleMainMapper saleMainMapper;
    @Autowired
    SaleDtlMapper saleDtlMapper;

    @Override
    public Result add(SaleMain saleMain, List<SaleDtl> saleDtls) {

        //保存订单明细成功计数
        int successDtl=0;

        int i = saleMainMapper.insert(saleMain);
        for (SaleDtl s:saleDtls) {
            int i1 = saleDtlMapper.insert(s);
            if (i1==1){
                successDtl++;
            }
        }
        if (i!=0&&successDtl==saleDtls.size()){
            return Result.success("success");
        }else {
            return Result.fail(ErrorEnum.ADD.getCode(),ErrorEnum.ADD.getMsg());
        }

    }

    @Override
    public Result del(String saleCode) {
        int i = saleDtlMapper.deleteBySaleCode(saleCode);
        int i1 = saleMainMapper.deleteByPrimaryKey(saleCode);
        if (i!=0&&i1!=0){
            return Result.success("success");
        }else {
            return Result.fail(ErrorEnum.DELETE.getCode(),ErrorEnum.DELETE.getMsg());
        }

    }

    @Override
    public Result updMain(SaleMain saleMain) {
        int i = saleMainMapper.updateByPrimaryKey(saleMain);
        if (i>0){
            return Result.success("success");
        }else{
            return Result.fail(ErrorEnum.UPDATE.getCode(),ErrorEnum.UPDATE.getMsg());
        }
    }

    @Override
    public Result updDtl(List<SaleDtl> saleDtls) {
        int i=0;
        for (SaleDtl s: saleDtls) {
            int i1 = saleDtlMapper.updateByPrimaryKey(s);
            if (i1==1){
                i++;
            }
        }
        if (i==saleDtls.size()){
            return Result.success("success");
        }else {
            return Result.fail(ErrorEnum.UPDATE.getCode(),ErrorEnum.UPDATE.getMsg());
        }
    }


    @Override
    public Result qry(String saleCode, String saleType, String salePerson, Date beginDate, Date endDate, String commodityId, String commodityName) {
        //如果商品id和商品名称都是空，用saleMain查
        if(commodityId==null&&commodityName==null){
            List<SaleMain> saleMains = saleMainMapper.qrySaleOrder(saleCode, saleType, salePerson, beginDate, endDate);
            return Result.success("success",saleMains);
        }
        //如果商品id和商品名称不为空，用saleDtl查

        return null;
    }
}
