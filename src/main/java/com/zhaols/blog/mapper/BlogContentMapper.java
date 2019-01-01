package com.zhaols.blog.mapper;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.blog.entity.BlogContent;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogContentMapper extends IEntityMapper<BlogContent> {
    /**
     *
     * @mbggenerated 2019-01-01
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insert(BlogContent record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int insertSelective(BlogContent record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    BlogContent selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKeySelective(BlogContent record);

    /**
     *
     * @mbggenerated 2019-01-01
     */
    int updateByPrimaryKey(BlogContent record);
}