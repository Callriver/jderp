package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.UserAuth;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthMapper {
    int deleteByPrimaryKey(@Param("userId") String userId, @Param("secondId") String secondId, @Param("firstId") String firstId);

    int insert(UserAuth record);

    List<UserAuth> selectAll();
}