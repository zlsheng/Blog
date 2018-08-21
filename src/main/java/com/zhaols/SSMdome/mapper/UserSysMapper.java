package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.UserSys;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface UserSysMapper {
    /**
     *
     * @mbggenerated 2018-08-20
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insert(UserSys record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int insertSelective(UserSys record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    UserSys selectByPrimaryKey(String key);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKeySelective(UserSys record);

    /**
     *
     * @mbggenerated 2018-08-20
     */
    int updateByPrimaryKey(UserSys record);

    /**
    *   功能描述: 根据登录用户名查询用户信息
    *
    *@Author: zhaols
    *@CreateTime: 2018-08-21  10:49
    */
    UserSys getUserByUloginid(String username);



}