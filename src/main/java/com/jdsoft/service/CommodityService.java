package com.jdsoft.service;

import com.jdsoft.orm.model.Commodity;
import com.jdsoft.util.Result;

public interface CommodityService {
    Result add(Commodity commodity);
    Result del(String commodity_id);
    Result upd(Commodity commodity);
    Result qry(String commodityId);
    Result qryByName(String commodityName);
}
