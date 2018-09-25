package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.entity.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SysRoleMapper extends IEntityMapper<SysRole> {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(String id);


    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *@Description  获取所有角色列表
     *@Author: zhaols
     *@param
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysRole>
     *@CreateTime: 2018-09-20  16:25
     */
    List<SysRole> getAll(Map<String,String> map);

    /**
     *@Description 根据用户id获取用户所拥有的角色列表
     *@Author: zhaols
     *@param uId 用户id
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysRole>
     *@CreateTime: 2018-09-21  16:47
     */
    List<SysRole> getRoleByUid(String uId);

    /**
     *@Description 根据角色编码获取角色信息
     *@Author: zhaols
     *@param code
     *@Return: com.zhaols.SSMdome.entity.SysRole
     *@CreateTime: 2018-09-25  10:10
     */
    SysRole queryRoleByCode(String code);

    /**
     *@Description 根据id修改角色状态
     *@Author: zhaols
     *@param map
     *@Return: void
     *@CreateTime: 2018-09-25  15:28
     */
    void updateRoleEnable(Map<String,String> map);
}