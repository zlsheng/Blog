package com.zhaols.blog.Action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.blog.entity.Blog;
import com.zhaols.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2019-01-01 10:43
 */
public class BlogAction extends BasicAction<Blog, IBlogService> {

    @Autowired
    private IBlogService blogService;

    @Override
    protected IBlogService getEntityManager() {
        return blogService;
    }

    @Override
    public String list(){
        System.out.println("haha");
        return SUCCESS;
    }
}
