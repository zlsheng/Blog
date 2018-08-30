package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(SysUser record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(SysUser record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    SysUser selectByPrimaryKey(String key);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(SysUser record);

    /**
    *   功能描述: 根据登录用户名查询用户信息
    *
    *@Author: zhaols
    *@CreateTime: 2018-08-21  10:49
    */
    SysUser getUserByUloginid(String username);

    List<SysUser> getAll();
}