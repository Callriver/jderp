package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.FirstMenu;
import java.util.List;

public interface FirstMenuMapper {
    int deleteByPrimaryKey(String firstId);

    int insert(FirstMenu record);

    FirstMenu selectByPrimaryKey(String firstId);

    List<FirstMenu> selectAll();

    int updateByPrimaryKey(FirstMenu record);
}