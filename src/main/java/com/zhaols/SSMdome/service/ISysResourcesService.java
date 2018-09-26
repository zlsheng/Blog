package com.zhaols.SSMdome.service;

import com.zhaols.SSMdome.BasicClassDri.ISuperService;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.utils.ResponseBean;

import java.util.List;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-09-25 16:48
 */
public interface ISysResourcesService extends ISuperService<SysResources> {
    /**
     *@Description: 根据用户id 获取角色所拥有权限列表
     *@Author: zhaols
     *@param userId 用户id
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysResources>
     *@CreateTime: 2018-09-26  12:53
     */
    List<SysResources> queryResByUid(String userId);

    /**
     *@Description: 根据角色id获取权限列表
     *@Author: zhaols
     *@param roleId 角色id
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysResources>
     *@CreateTime: 2018-09-26  12:55
     */
    List<SysResources> queryResByRid(String roleId);
}
