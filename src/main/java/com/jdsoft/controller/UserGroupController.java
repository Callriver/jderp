package com.jdsoft.controller;


import com.jdsoft.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "/userGroup")
@RestController
public class UserGroupController {
    @Autowired
    UserGroupService userGroupService;
}
