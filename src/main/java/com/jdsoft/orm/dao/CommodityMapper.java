package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.Commodity;
import java.util.List;

public interface CommodityMapper {
    int deleteByPrimaryKey(String commodityId);

    int insert(Commodity record);

    Commodity selectByPrimaryKey(String commodityId);

    List<Commodity> selectByName(String commodityName);

    List<Commodity> selectAll();

    int updateByPrimaryKey(Commodity record);
}