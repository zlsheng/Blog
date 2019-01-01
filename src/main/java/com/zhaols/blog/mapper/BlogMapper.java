package com.zhaols.blog.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.blog.entity.Blog;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogMapper extends IEntityMapper<Blog> {
    /**
     *
     * @mbggenerated 2019-01-01
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insert(Blog record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insertSelective(Blog record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    Blog selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKey(Blog record);
}