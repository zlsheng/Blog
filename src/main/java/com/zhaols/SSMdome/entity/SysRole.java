package com.zhaols.SSMdome.entity;

import java.util.Date;

public class SysRole {
    /**
     * ？？？
     */
    private String id;

    /**
     * ？？？？？
     */
    private String code;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String proleId;

    /**
     * 备注
     */
    private String remark;

    /**
     * null
     */
    private String areaId;

    /**
     * 更新人name
     */
    private String updatorName;

    /**
     * 创建人ID
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
     * 更新人ID
     */
    private String updator;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 敏感度标记
     */
    private Short sensitivity;

    /**
     * ？？？
     * @return ID ？？？
     */
    public String getId() {
        return id;
    }

    /**
     * ？？？
     * @param id ？？？
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * ？？？？？
     * @return CODE ？？？？？
     */
    public String getCode() {
        return code;
    }

    /**
     * ？？？？？
     * @param code ？？？？？
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * null
     * @return NAME null
     */
    public String getName() {
        return name;
    }

    /**
     * null
     * @param name null
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * null
     * @return PROLE_ID null
     */
    public String getProleId() {
        return proleId;
    }

    /**
     * null
     * @param proleId null
     */
    public void setProleId(String proleId) {
        this.proleId = proleId == null ? null : proleId.trim();
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * null
     * @return AREA_ID null
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * null
     * @param areaId null
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
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
     * 创建人ID
     * @return CREATOR 创建人ID
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人ID
     * @param creator 创建人ID
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
     * 更新人ID
     * @return UPDATOR 更新人ID
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 更新人ID
     * @param updator 更新人ID
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
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
}