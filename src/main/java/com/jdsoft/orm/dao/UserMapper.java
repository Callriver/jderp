package com.jdsoft.orm.dao;

import com.jdsoft.orm.model.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    User selectByPrimaryKey(String userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User selectByUserIdPwd(String loginCode,String password);

    User selectByUserPhonePwd(String loginCode,String password);

    User selectByUserEmailPwd(String loginCode,String password);

    Integer checkUserExist(String userId,String userPhone,String userEmail);

}