package com.zhaols.SSMdome.service;

import com.zhaols.SSMdome.BasicClassDri.ISuperService;
import com.zhaols.SSMdome.entity.SysRole;

import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-20 16:18
 */
public interface IRoleService extends ISuperService<SysRole> {

    /**
     *@Description  获取角色列表
     *@Author: zhaols
     *@param
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysRole>
     *@CreateTime: 2018-09-21  16:53
     */
    List<SysRole> queryRole();

    /**
     *@Description 根据用户id获取用户所拥有的角色列表
     *@Author: zhaols
     *@param u_id 用户id
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysRole>
     *@CreateTime: 2018-09-21  16:47
     */
    List<SysRole> getRoleByUid(String u_id);
}
