package com.zhaols.SSMdome.service;

import com.zhaols.SSMdome.BasicClassDri.ISuperService;
import com.zhaols.SSMdome.MyExcption.ManagerException;
import com.zhaols.SSMdome.entity.SysRole;
import com.zhaols.SSMdome.entity.SysUser;

import java.util.Date;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-20 14:15
 */
public interface IUserSysService extends ISuperService<SysUser> {
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
     * 功能描述: 注册
     *
     * @param entity  用户实体类
     * @return void
     */
    void registration(SysUser entity) throws ManagerException;


    /**
     *@Description  修改用户密码
     *@Author: zhaols
     *@param entity 用户实体
     *@param nowPassword 新密码
     *@Return: void
     *@CreateTime: 2018-09-18  16:23
     */
    void changePassword(SysUser entity, String nowPassword);

    /**
     *@Description 给指定用户添加角色
     *@Author: zhaols
     *@param u_id 用户id
     *@param r_id 角色id
     *@Return: void
     *@CreateTime: 2018-09-21  16:46
     */
    void updateUserRole(String u_id, String r_id);

}
