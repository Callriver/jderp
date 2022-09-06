package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.UserGroup;
import java.util.List;

public interface UserGroupMapper {
    int deleteByPrimaryKey(String userGroupId);

    int insert(UserGroup record);

    UserGroup selectByPrimaryKey(String userGroupId);

    List<UserGroup> selectAll();

    int updateByPrimaryKey(UserGroup record);
}