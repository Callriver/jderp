package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.DeliverMain;
import java.util.List;

public interface DeliverMainMapper {
    int deleteByPrimaryKey(String deliverMainCode);

    int insert(DeliverMain record);

    DeliverMain selectByPrimaryKey(String deliverMainCode);

    List<DeliverMain> selectAll();

    int updateByPrimaryKey(DeliverMain record);
}