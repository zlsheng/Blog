package com.zhaols.SSMdome.service;

import com.zhaols.SSMdome.entity.SysUser;

import java.util.Date;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:15
 */
public interface IUserSysService {
    public SysUser getUserById(String id) throws Exception;

    /**
    *   功能描述: 获取User列表
    *
    *@Author: zhaols
    *@CreateTime: 2018-09-12  15:53
    */
    List<SysUser> getUserList();

    /**
    *   功能描述: 保存用户信息
    *
    *@Author: zhaols
    *@CreateTime: 2018-09-12  15:53
    */
    void saveAndUpdate(SysUser entity);

    /**
    *   功能描述: 根据用户id删除用户信息
    *
    *@Author: zhaols
    *@CreateTime: 2018-09-12  15:54
    */
    void deleteUser(String id);

    void amendLoginInfo(String username,String ip, Date loginTime);
    
}
