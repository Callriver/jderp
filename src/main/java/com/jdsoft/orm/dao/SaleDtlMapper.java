package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.SaleDtl;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleDtlMapper {
    int deleteByPrimaryKey(@Param("saleMainCode") String saleMainCode, @Param("sequence") Integer sequence, @Param("item") String item);

    int deleteBySaleCode(@Param("saleMainCode") String saleMainCode);

    int insert(SaleDtl record);

    SaleDtl selectByPrimaryKey(@Param("saleMainCode") String saleMainCode, @Param("sequence") Integer sequence, @Param("item") String item);

    List<SaleDtl> selectAll();

    int updateByPrimaryKey(SaleDtl record);
}