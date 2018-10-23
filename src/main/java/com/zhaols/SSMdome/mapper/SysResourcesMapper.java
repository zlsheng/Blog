package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.utils.ResponseBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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


    /**
     *@Description:  取消角色权限
     *@Author: zhaols
     *@param map 存放用户id和权限id
     *@Return: void
     *@CreateTime: 2018-09-26  16:03
     */
    void clncelAuth(Map<String,String> map);

    /**
     *@Description:  给角色添加权限
     *@Author: zhaols
     *@param map
     *@Return: void
     *@CreateTime: 2018-09-30  13:53
     */
    void addAuth(Map<String, String> map);
}