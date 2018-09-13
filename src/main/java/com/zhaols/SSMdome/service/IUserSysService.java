package com.zhaols.SSMdome.service;

import com.zhaols.SSMdome.MyExcption.ManagerException;
import com.zhaols.SSMdome.entity.SysUser;

import java.util.Date;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:15
 */
public interface IUserSysService {
    public SysUser getUserById(String id)  ;

    /**
    *   功能描述: 获取User列表
    *
    *@Author: zhaols.
     *@param:
     *@Return:
     *@CreateTime: 2018-09-12  15:53
    */
    List<SysUser> getUserList() ;

    /**
    *   功能描述: 保存用户信息
    *
    *@Author: zhaols
     *@param:
     *@Return:
     *@CreateTime: 2018-09-12  15:53
    */
    void saveAndUpdate(SysUser entity);

    /**
    *   功能描述: 根据用户id删除用户信息
    *
    *@Author: zhaols
     *@param:
     *@Return:
     *@CreateTime: 2018-09-12  15:54
    */
    void deleteUser(String id) ;

    /**
    *   功能描述:  记录用户登陆时间和IP
    *
    *@Author: zhaols
    *@param: 
    *@Return: 
    *@CreateTime: 2018-09-13  10:44
    */
    void amendLoginInfo(String username,String ip, Date loginTime);

    /**
    *   功能描述: 注册
    *
    *@Author: zhaols
    *@param: 
    *@Return: 
    *@CreateTime: 2018-09-13  10:43
    */
    void registration(SysUser entity) throws ManagerException;
}
