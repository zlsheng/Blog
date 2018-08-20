package com.zhaols.SSMdome.service.Impl;

import com.zhaols.SSMdome.entity.UserSys;
import com.zhaols.SSMdome.mapper.UserSysMapper;
import com.zhaols.SSMdome.service.IUserSysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:16
 */
@Service
public class UserSysService implements IUserSysService {

    @Autowired
    private UserSysMapper userSysMapper;

    public UserSys getUserById(String id){
        UserSys userSys = userSysMapper.selectByPrimaryKey(id);
        return userSys;
    }
}
