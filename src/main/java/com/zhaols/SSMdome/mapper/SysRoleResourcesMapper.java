package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysRoleResourcesKey;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleResourcesMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(SysRoleResourcesKey key);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(SysRoleResourcesKey record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(SysRoleResourcesKey record);
}