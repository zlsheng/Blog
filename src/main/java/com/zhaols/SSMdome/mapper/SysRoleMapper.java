package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysRole;
import org.springframework.stereotype.Repository;

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
    int insert(SysRole record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    SysRole selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(SysRole record);
}