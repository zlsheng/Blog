package com.zhaols.blog.entity;

import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.util.Date;

public class BlogCategory extends Entity<String> {
    /**
     * null
     */
    private String id;

    /**
     * 类别名称
     */
    private String categoryName;

    /**
     * 博主id
     */
    private String bloggerId;

    /**
     * 博客id
     */
    private String blogId;

    /**
     * 类型状态 0-正常 1 -禁用
     */
    private String status;

    /**
     * 更新人
     */
    private String updator;

    /**
     * 更新人name
     */
    private String updatorName;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人name
     */
    private String creatorName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * null
     * @return ID null
     */
    public String getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 类别名称
     * @return CATEGORY_NAME 类别名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 类别名称
     * @param categoryName 类别名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 博主id
     * @return BLOGGER_ID 博主id
     */
    public String getBloggerId() {
        return bloggerId;
    }

    /**
     * 博主id
     * @param bloggerId 博主id
     */
    public void setBloggerId(String bloggerId) {
        this.bloggerId = bloggerId == null ? null : bloggerId.trim();
    }

    /**
     * 博客id
     * @return BLOG_ID 博客id
     */
    public String getBlogId() {
        return blogId;
    }

    /**
     * 博客id
     * @param blogId 博客id
     */
    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    /**
     * 类型状态 0-正常 1 -禁用
     * @return STATUS 类型状态 0-正常 1 -禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 类型状态 0-正常 1 -禁用
     * @param status 类型状态 0-正常 1 -禁用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 更新人
     * @return UPDATOR 更新人
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 更新人
     * @param updator 更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * 更新人name
     * @return UPDATOR_NAME 更新人name
     */
    public String getUpdatorName() {
        return updatorName;
    }

    /**
     * 更新人name
     * @param updatorName 更新人name
     */
    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName == null ? null : updatorName.trim();
    }

    /**
     * 更新时间
     * @return UPDATE_TIME 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建人
     * @return CREATOR 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建人name
     * @return CREATOR_NAME 创建人name
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * 创建人name
     * @param creatorName 创建人name
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}