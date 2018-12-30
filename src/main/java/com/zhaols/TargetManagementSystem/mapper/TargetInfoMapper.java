package com.zhaols.TargetManagementSystem.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.TargetManagementSystem.entity.TargetInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetInfoMapper extends IEntityMapper<TargetInfo> {
    /**
     *
     * @mbggenerated 2018-12-30
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-12-30
     */
    int insertSelective(TargetInfo record);

    /**
     *
     * @mbggenerated 2018-12-30
     */
    TargetInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-12-30
     */
    int updateByPrimaryKeySelective(TargetInfo record);

}