package com.jdsoft.service.impl;

import com.jdsoft.orm.dao.UserMapper;
import com.jdsoft.orm.model.User;
import com.jdsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Override
    public User add(User user) {
        Integer count = userMapper.checkUserExist(user.getUserId(), user.getUserPhone(), user.getUserEmail());
        if (count>0){
            return null;
        }else {
            user.setUserFileSpace("/"+user.getUserId());
            int result = userMapper.insert(user);
            if (result>0){
                return user;
            }else {
                return null;
            }
        }

    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    @Override
    public boolean del(User user) {
        int i = userMapper.deleteByPrimaryKey(user.getUserId());
        if (i>0){
            return true;
        }else {
            return false;
        }

    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @Override
    public User upd(User user) {
        int i = userMapper.updateByPrimaryKey(user);
        if (i>0){
            return user;
        }else {
            return null;
        }
    }

    /**
     * 登录系统
     * @param loginCode
     * @param password
     * @return
     */
    @Override
    public User login(String loginCode, String password) {
        User user = userMapper.selectByUserIdPwd(loginCode, password);
        User user1 = userMapper.selectByUserEmailPwd(loginCode, password);
        User user2 = userMapper.selectByUserPhonePwd(loginCode, password);

        if (user!=null){
            return user;
        }else if (user1!=null){
            return user1;
        }else if (user2!=null){
            return user2;
        }else {
            return null;
        }
    }

    /**
     * 退出系统
     * @param user
     * @return
     */
    @Override
    public boolean logout(User user) {
        return true;
    }

    /**
     * 查询用户数据
     * @param user_Id
     * @return
     */
    @Override
    public User qryUserById(String user_Id) {
        User user = userMapper.selectByPrimaryKey(user_Id);
        return user;
    }
}
