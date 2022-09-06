package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.ReceiptMain;
import java.util.List;

public interface ReceiptMainMapper {
    int deleteByPrimaryKey(String receiptMainCode);

    int insert(ReceiptMain record);

    ReceiptMain selectByPrimaryKey(String receiptMainCode);

    List<ReceiptMain> selectAll();

    int updateByPrimaryKey(ReceiptMain record);
}