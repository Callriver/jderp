package com.jdsoft.service.impl;

import com.jdsoft.exception.enums.ErrorEnum;
import com.jdsoft.orm.dao.UserMapper;
import com.jdsoft.orm.model.User;
import com.jdsoft.service.UserService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Override
    public Result add(User user) {
        Integer count = userMapper.checkUserExist(user.getUserId(), user.getUserPhone(), user.getUserEmail());
        if (count>0){
            return  Result.fail(ErrorEnum.ADD.getCode(),"添加失败，该用户代码或手机邮箱已被注册");
        }else {
            user.setUserFileSpace("/"+user.getUserId());
            int count1 = userMapper.insert(user);
            if (count1>0){
                return Result.success("success");
            }else {
                return Result.fail(ErrorEnum.ADD.getCode(),ErrorEnum.ADD.getMsg());
            }
        }

    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    @Override
    public Result del(User user) {
        int i = userMapper.deleteByPrimaryKey(user.getUserId());
        if (i>0){
            return Result.success("success");
        }else {
            return Result.fail(ErrorEnum.DELETE.getCode(),ErrorEnum.DELETE.getMsg());
        }

    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @Override
    public Result upd(User user) {
        int i = userMapper.updateByPrimaryKey(user);
        if (i>0){
            return Result.success("success");
        }else {
            return Result.fail(ErrorEnum.UPDATE.getCode(),ErrorEnum.UPDATE.getMsg());
        }
    }

    /**
     * 登录系统
     * @param loginCode
     * @param password
     * @return
     */
    @Override
    public Result login(String loginCode, String password) {
        User user = userMapper.selectByUserIdPwd(loginCode, password);
        User user1 = userMapper.selectByUserEmailPwd(loginCode, password);
        User user2 = userMapper.selectByUserPhonePwd(loginCode, password);

        if (user!=null){
            return Result.success("success",user);
        }else if (user1!=null){
            return Result.success("success",user1);
        }else if (user2!=null){
            return Result.success("success",user1);
        }else {
            return Result.fail(ErrorEnum.LOGIN.getCode(), "用户名或密码不正确");
        }
    }

    /**
     * 退出系统
     * @param user
     * @return
     */
    @Override
    public Result logout(User user) {
        return Result.success("success");
    }

    /**
     * 查询用户数据
     * @param user_Id
     * @return
     */
    @Override
    public Result qryUserById(String user_Id) {
        User user = userMapper.selectByPrimaryKey(user_Id);
        System.out.println(user.toString());
        if (user!=null){
            return Result.success("success",user);
        }else {
            return Result.fail(ErrorEnum.QUERY.getCode(),ErrorEnum.QUERY.getMsg());
        }

    }
}
