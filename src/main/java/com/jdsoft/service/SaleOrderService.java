package com.jdsoft.service;

import com.jdsoft.orm.model.SaleDtl;
import com.jdsoft.orm.model.SaleMain;
import com.jdsoft.util.Result;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


public interface SaleOrderService {
    Result add(SaleMain saleMain, List<SaleDtl> saleDtls);
    Result del(String saleCode);
    Result updMain(SaleMain saleMain);
    Result updDtl(List<SaleDtl> saleDtls);
    Result qry(String saleCode,String saleType,String salePerson,
               Date beginDate,
               Date endDate,
               String commodityId,String commodityName);

}
