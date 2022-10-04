package com.jdsoft.controller;

import com.jdsoft.orm.model.User;
import com.jdsoft.service.UserService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/user")
@RestController
public class UserController<passWord> {
    @Autowired
    private UserService userService;
    /**
     * 新增用户
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object add(@RequestBody User user){

        Result result = userService.add(user);
        System.out.println(result.toString());
        return result;
    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Object del(@RequestBody User user){
        Result result = userService.del(user);
        System.out.println(result.toString());
        return result;
    }
    /**
     * 更新用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/upd",method = RequestMethod.POST)
    public Object upd(@RequestBody User user){
        Result result = userService.upd(user);
        System.out.println(user.toString());
        return result;
    }

    /**
     * 登录
     * @param loginCode
     * @param passWord
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object login(@RequestBody String loginCode,String passWord){
        Result result = userService.login(loginCode,passWord);
        System.out.println(result.toString());

        return result;
    }

    /**
     * 登出
     * @param user
     * @return
     */
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public Object logout(@RequestBody User user){
        Result result = userService.logout(user);
        System.out.println(result.toString());
        return result;
    }

    @RequestMapping(value = "/qry",method = RequestMethod.POST)
    public Object qry(@RequestBody String userId){
        Result result = userService.qryUserById(userId);
        System.out.println(result.toString());
        return result;
    }

}
