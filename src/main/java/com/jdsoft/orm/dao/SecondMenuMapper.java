package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.SecondMenu;
import java.util.List;

public interface SecondMenuMapper {
    int deleteByPrimaryKey(String secondId);

    int insert(SecondMenu record);

    SecondMenu selectByPrimaryKey(String secondId);

    List<SecondMenu> selectAll();

    int updateByPrimaryKey(SecondMenu record);
}