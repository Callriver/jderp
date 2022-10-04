package com.jdsoft.service;

import com.jdsoft.orm.model.User;
import com.jdsoft.util.Result;

public interface UserService {
    Result add(User user);
    Result del(User user);
    Result upd(User user);
    Result login(String loginCode,String password);
    Result logout(User user);
    Result qryUserById(String user_Id);
}
