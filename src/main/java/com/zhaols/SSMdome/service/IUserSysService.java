package com.zhaols.SSMdome.service;

import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.UserSys;

import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:15
 */
public interface IUserSysService {
    public UserSys getUserById(String id) throws Exception;
}
