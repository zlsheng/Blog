package com.zhaols.SSMdome.mapper;

import com.zhaols.SSMdome.entity.UserSys;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

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
}