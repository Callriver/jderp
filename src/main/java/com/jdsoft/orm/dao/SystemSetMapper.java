package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.SystemSet;
import java.util.List;

public interface SystemSetMapper {
    int insert(SystemSet record);

    List<SystemSet> selectAll();
}