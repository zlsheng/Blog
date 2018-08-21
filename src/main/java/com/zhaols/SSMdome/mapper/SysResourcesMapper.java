package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysResources;
import org.springframework.stereotype.Repository;

@Repository
public interface SysResourcesMapper {
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
}