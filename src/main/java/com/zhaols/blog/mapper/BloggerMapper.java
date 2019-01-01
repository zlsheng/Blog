package com.zhaols.blog.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.blog.entity.Blogger;
import org.springframework.stereotype.Repository;

@Repository
public interface BloggerMapper extends IEntityMapper<Blogger> {
    /**
     *
     * @mbggenerated 2019-01-01
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insert(Blogger record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insertSelective(Blogger record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    Blogger selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKeySelective(Blogger record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKey(Blogger record);
}