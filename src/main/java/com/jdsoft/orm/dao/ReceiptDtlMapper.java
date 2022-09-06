package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.ReceiptDtl;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiptDtlMapper {
    int deleteByPrimaryKey(@Param("receiptMainCode") String receiptMainCode, @Param("sequence") Integer sequence, @Param("item") String item);

    int insert(ReceiptDtl record);

    ReceiptDtl selectByPrimaryKey(@Param("receiptMainCode") String receiptMainCode, @Param("sequence") Integer sequence, @Param("item") String item);

    List<ReceiptDtl> selectAll();

    int updateByPrimaryKey(ReceiptDtl record);
}