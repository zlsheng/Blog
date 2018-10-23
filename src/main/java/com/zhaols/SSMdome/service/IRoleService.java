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

    /**
     *@Description 根据角色编码获取角色信息
     *@Author: zhaols
     *@param code 角色编码
     *@Return: com.zhaols.SSMdome.entity.SysRole
     *@CreateTime: 2018-09-25  10:09
     */
    SysRole queryRoleByCode(String code);

    /**
     *@Description 保存更新用户
     *@Author: zhaols
     *@param entity 实体类
     *@Return: void
     *@CreateTime: 2018-09-25  10:41
     */
    void saveAndUpdate(SysRole entity);


    /**
     *@Description  删除角色信息
     *@Author: zhaols
     *@param id 角色id
     *@Return: void
     *@CreateTime: 2018-09-25  11:50
     */
    void deleteRole(String id);

    /**
     *@Description  根据id修改角色状态
     *@Author: zhaols
     *@param id 角色id
     *@param isEnable 角色状态
     *@Return: void
     *@CreateTime: 2018-09-25  15:24
     */
    void updateRoleEnable(String id, String isEnable);
}
