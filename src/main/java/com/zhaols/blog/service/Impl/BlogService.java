package com.zhaols.blog.service.Impl;

import com.zhaols.SSMdome.BasicClassDri.IEntityMapper;
import com.zhaols.SSMdome.BasicClassDri.SuperService;
import com.zhaols.blog.entity.Blog;
import com.zhaols.blog.mapper.BlogMapper;
import com.zhaols.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2019-01-01 10:41
 */
@Service
public class BlogService extends SuperService<Blog> implements IBlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    protected IEntityMapper<Blog> getDao() {
        return blogMapper;
    }
}
