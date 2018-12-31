package com.zhaols.SSMdome.entity;

import com.zhaols.SSMdome.BasicClassDri.BasicEntity;
import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.util.Date;


public class SysResources extends BasicEntity<String> {
    /**
     * 主键
     */
    private String id;

    /**
     * 资源编码
     */
    private String code;

    /**
     * 资源名称
     */
    private String display;

    /**
     * 资源描述
     */
    private String description;

    /**
     * 父资源id
     */
    private String parentCode;

    /**
     * 资源类型^1菜单，0URL，2按钮
     */
    private String type;

    /**
     * 访问地址
     */
    private String url;

    /**
     * 是否启用^0启用1不启用
     */
    private String status;


    /**
     * 图标
     */
    private String icon;


    /**
     * null
     */
    private String updator;

    /**
     * null
     */
    private String updatorName;

    /**
     * null
     */
    private Date updateTime;

    /**
     * null
     */
    private String creator;

    /**
     * null
     */
    private String creatorName;

    /**
     * null
     */
    private Date createTime;

    /**
     * 敏感度标记
     */
    private Short sensitivity;

    /**
     * 排序
     */
    private Integer sort;


    /**
     * 主键
     * @return ID 主键
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    @Override
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 资源编码
     * @return CODE 资源编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 资源编码
     * @param code 资源编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 资源名称
     * @return DISPLAY 资源名称
     */
    public String getDisplay() {
        return display;
    }

    /**
     * 资源名称
     * @param display 资源名称
     */
    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    /**
     * 资源描述
     * @return DESCRIPTION 资源描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 资源描述
     * @param description 资源描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 父资源id
     * @return PARENT_CODE 父资源id
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 父资源id
     * @param parentCode 父资源id
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * 资源类型^1菜单，0URL，2按钮
     * @return TYPE 资源类型^1菜单，0URL，2按钮
     */
    public String getType() {
        return type;
    }

    /**
     * 资源类型^1菜单，0URL，2按钮
     * @param type 资源类型^1菜单，0URL，2按钮
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 访问地址
     * @return URL 访问地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 访问地址
     * @param url 访问地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 是否启用^0启用1不启用
     * @return STATUS 是否启用^0启用1不启用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 是否启用^0启用1不启用
     * @param status 是否启用^0启用1不启用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 图标
     * @return ICON 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }


    /**
     * null
     * @return UPDATOR null
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * null
     * @param updator null
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * null
     * @return UPDATOR_NAME null
     */
    public String getUpdatorName() {
        return updatorName;
    }

    /**
     * null
     * @param updatorName null
     */
    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName == null ? null : updatorName.trim();
    }

    /**
     * null
     * @return UPDATE_TIME null
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * null
     * @param updateTime null
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * null
     * @return CREATOR null
     */
    public String getCreator() {
        return creator;
    }

    /**
     * null
     * @param creator null
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * null
     * @return CREATOR_NAME null
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * null
     * @param creatorName null
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * null
     * @return CREATE_TIME null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * null
     * @param createTime null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 敏感度标记
     * @return SENSITIVITY 敏感度标记
     */
    public Short getSensitivity() {
        return sensitivity;
    }

    /**
     * 敏感度标记
     * @param sensitivity 敏感度标记
     */
    public void setSensitivity(Short sensitivity) {
        this.sensitivity = sensitivity;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}