package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.UserGroupAuth;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupAuthMapper {
    int deleteByPrimaryKey(@Param("userGroupId") String userGroupId, @Param("secondId") String secondId, @Param("firstId") String firstId);

    int insert(UserGroupAuth record);

    List<UserGroupAuth> selectAll();
}