package com.jdsoft.controller;


import com.jdsoft.orm.model.UserGroup;
import com.jdsoft.service.UserGroupService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "/userGroup")
@RestController
public class UserGroupController {
    @Autowired
    UserGroupService userGroupService;
    @RequestMapping(value = "/add",method= RequestMethod.POST)
    public Object add(@RequestBody UserGroup userGroup){
        Result result = userGroupService.add(userGroup);
        return result;
    }
}
