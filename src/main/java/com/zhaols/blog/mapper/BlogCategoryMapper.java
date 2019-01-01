package com.zhaols.blog.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.blog.entity.BlogCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogCategoryMapper extends IEntityMapper<BlogCategory> {
    /**
     *
     * @mbggenerated 2019-01-01
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insert(BlogCategory record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insertSelective(BlogCategory record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    BlogCategory selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKeySelective(BlogCategory record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKey(BlogCategory record);
}