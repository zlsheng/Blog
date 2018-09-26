package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.utils.ResponseBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysResourcesMapper extends IEntityMapper<SysResources> {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(SysResources record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(SysResources record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    SysResources selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(SysResources record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(SysResources record);

    /**
     *   功能描述: 根据登录用户id查询用户权限列表
     *
     *@Author: zhaols
     *@CreateTime: 2018-08-21  10:49
     */
    List<SysResources> getSysResourceListByUid(String userid);


    /**
     *   功能描述: 根据登录用户id查询用户菜单列表
     *
     *@Author: zhaols
     *@CreateTime: 2018-08-21  10:49
     */
    List<SysResources> findMenuListByUserId(String userid);


    /**
     *@Description: 根据用户id获取用户权限列表
     *@Author: zhaols
     *@param userId 角色id
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysResources>
     *@CreateTime: 2018-09-26  11:49
     */
    List<SysResources> queryResByUid(String userId);

    /**
     *@Description: 根据角色id获取用户权限列表
     *@Author: zhaols
     *@param roleId
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysResources>
     *@CreateTime: 2018-09-26  12:54
     */
    List<SysResources> queryResByRid(String roleId);
}