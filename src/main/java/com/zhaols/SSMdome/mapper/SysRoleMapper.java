package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysRole1;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(SysRole1 record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(SysRole1 record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    SysRole1 selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(SysRole1 record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(SysRole1 record);

    /**
     *@Description  获取所有角色列表
     *@Author: zhaols
     *@param
     *@Return: java.util.List<com.zhaols.SSMdome.entity.SysRole>
     *@CreateTime: 2018-09-20  16:25
     */
    List<SysRole1> getAll();
}