package com.jdsoft.service;

import com.jdsoft.orm.model.User;

public interface UserService {
    User add(User user);
    boolean del(User user);
    User upd(User user);
    User login(String loginCode,String password);
    boolean logout(User user);
    User qryUserById(String user_Id);
}
