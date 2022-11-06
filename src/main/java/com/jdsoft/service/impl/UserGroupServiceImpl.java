package com.jdsoft.service.impl;

import com.jdsoft.exception.enums.ErrorEnum;
import com.jdsoft.orm.dao.UserGroupMapper;
import com.jdsoft.orm.model.UserGroup;
import com.jdsoft.service.UserGroupService;
import com.jdsoft.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserGroupServiceImpl implements UserGroupService {
    @Autowired
    private UserGroupMapper userGroupMapper;
    @Override
    public Result add(UserGroup userGroup) {
        int insert = userGroupMapper.insert(userGroup);
        if (insert>=1){
            return Result.success("success");
        }else {
            return Result.fail(ErrorEnum.ADD.getCode(),ErrorEnum.ADD.getMsg());
        }

    }
}
