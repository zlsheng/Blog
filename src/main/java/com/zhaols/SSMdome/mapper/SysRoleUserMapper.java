package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysRoleUserKey;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleUserMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(SysRoleUserKey key);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(SysRoleUserKey record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(SysRoleUserKey record);
}