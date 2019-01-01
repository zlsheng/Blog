package com.zhaols.blog.entity;

import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.util.Date;

public class BlogContent extends Entity<String> {
    /**
     * id
     */
    private String id;

    /**
     * 内容(文字存储文件名)
     */
    private String contentText;

    /**
     * 内容()图片存储图片名
     */
    private String contentPhoto;

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
     * 内容(文字存储文件名)
     * @return CONTENT_TEXT 内容(文字存储文件名)
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * 内容(文字存储文件名)
     * @param contentText 内容(文字存储文件名)
     */
    public void setContentText(String contentText) {
        this.contentText = contentText == null ? null : contentText.trim();
    }

    /**
     * 内容()图片存储图片名
     * @return CONTENT_PHOTO 内容()图片存储图片名
     */
    public String getContentPhoto() {
        return contentPhoto;
    }

    /**
     * 内容()图片存储图片名
     * @param contentPhoto 内容()图片存储图片名
     */
    public void setContentPhoto(String contentPhoto) {
        this.contentPhoto = contentPhoto == null ? null : contentPhoto.trim();
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