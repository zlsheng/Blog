package com.zhaols.blog.entity;

import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.math.BigDecimal;
import java.util.Date;

public class Blog extends Entity<String> {
    /**
     * id
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 阅读次数
     */
    private BigDecimal readTimes;

    /**
     * 博客状态 0-正常1-删除
     */
    private String status;

    /**
     * 博主id
     */
    private String bloggerId;

    /**
     * 博客类别id
     */
    private String categoryId;

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
     * 头像(存储头像文件名称)
     */
    private String headPortrait;

    /**
     * id
     * @return ID id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 标题
     * @return TITLE 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 简介
     * @return INTRODUCTION 简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 简介
     * @param introduction 简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * 阅读次数
     * @return READ_TIMES 阅读次数
     */
    public BigDecimal getReadTimes() {
        return readTimes;
    }

    /**
     * 阅读次数
     * @param readTimes 阅读次数
     */
    public void setReadTimes(BigDecimal readTimes) {
        this.readTimes = readTimes;
    }

    /**
     * 博客状态 0-正常1-删除
     * @return STATUS 博客状态 0-正常1-删除
     */
    public String getStatus() {
        return status;
    }

    /**
     * 博客状态 0-正常1-删除
     * @param status 博客状态 0-正常1-删除
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
     * 博客类别id
     * @return CATEGORY_ID 博客类别id
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 博客类别id
     * @param categoryId 博客类别id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
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

    /**
     * 头像(存储头像文件名称)
     * @return HEAD_PORTRAIT 头像(存储头像文件名称)
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * 头像(存储头像文件名称)
     * @param headPortrait 头像(存储头像文件名称)
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }
}