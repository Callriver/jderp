package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.DeliverDtl;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverDtlMapper {
    int deleteByPrimaryKey(@Param("deliverMainCode") String deliverMainCode, @Param("sequence") Integer sequence, @Param("item") String item);

    int insert(DeliverDtl record);

    DeliverDtl selectByPrimaryKey(@Param("deliverMainCode") String deliverMainCode, @Param("sequence") Integer sequence, @Param("item") String item);

    List<DeliverDtl> selectAll();

    int updateByPrimaryKey(DeliverDtl record);
}