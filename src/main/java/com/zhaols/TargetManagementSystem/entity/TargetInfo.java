package com.zhaols.TargetManagementSystem.entity;

import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *@Description: 目标详情实体类
 *@Author: zhaols
 *@Return:
 *@CreateTime: 2018-12-30  9:42
 */
public class TargetInfo extends Entity<String> {
    /**
     * 目标记录详情ID
     */
    private String id;

    /**
     * 目标创建人性别
     */
    private String createTargetPersonSex;

    /**
     * 目标初始状态描述
     */
    private String beginTargetDescription;

    /**
     * 目标实现初始资金
     */
    private BigDecimal beginTargetFunds;

    /**
     * 实现方式
     */
    private String beginTargetType;

    /**
     * 目标名称
     */
    private String targetName;

    /**
     * 目标简介
     */
    private String targetIntroduction;

    /**
     * 定目标的目的
     */
    private String purpose;

    /**
     * 目标创建人姓名
     */
    private String createTargetPersonName;

    /**
     * 目标创建时间
     */
    private Date createTargetTime;

    /**
     * 实现目标开始时间
     */
    private Date beginTargetTime;

    /**
     * 实现目标结束时间
     */
    private Date endTargetTime;

    /**
     * 目标结束状态描述
     */
    private String endTargetDescription;

    /**
     * 目标结束资金
     */
    private BigDecimal endTargetFunds;

    /**
     * 目标结束方式
     */
    private String endTargetType;

    /**
     * 记录更新人ID
     */
    private String updater;

    /**
     * 记录更新人姓名
     */
    private String updaterName;

    /**
     * 记录更新时间
     */
    private Date updateTime;

    /**
     * 记录创建人ID
     */
    private String creater;

    /**
     * 记录创建人姓名
     */
    private String createrName;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录是否有效 00 有效  11 无效
     */
    private String isEnable;

    /**
     * 目标记录详情ID
     * @return ID 目标记录详情ID
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * 目标记录详情ID
     * @param id 目标记录详情ID
     */
    @Override
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 目标创建人性别
     * @return CREATE_TARGET_PERSON_SEX 目标创建人性别
     */
    public String getCreateTargetPersonSex() {
        return createTargetPersonSex;
    }

    /**
     * 目标创建人性别
     * @param createTargetPersonSex 目标创建人性别
     */
    public void setCreateTargetPersonSex(String createTargetPersonSex) {
        this.createTargetPersonSex = createTargetPersonSex == null ? null : createTargetPersonSex.trim();
    }

    /**
     * 目标初始状态描述
     * @return BEGIN_TARGET_DESCRIPTION 目标初始状态描述
     */
    public String getBeginTargetDescription() {
        return beginTargetDescription;
    }

    /**
     * 目标初始状态描述
     * @param beginTargetDescription 目标初始状态描述
     */
    public void setBeginTargetDescription(String beginTargetDescription) {
        this.beginTargetDescription = beginTargetDescription == null ? null : beginTargetDescription.trim();
    }

    /**
     * 目标实现初始资金
     * @return BEGIN_TARGET_FUNDS 目标实现初始资金
     */
    public BigDecimal getBeginTargetFunds() {
        return beginTargetFunds;
    }

    /**
     * 目标实现初始资金
     * @param beginTargetFunds 目标实现初始资金
     */
    public void setBeginTargetFunds(BigDecimal beginTargetFunds) {
        this.beginTargetFunds = beginTargetFunds;
    }

    /**
     * 实现方式
     * @return BEGIN_TARGET_TYPE 实现方式
     */
    public String getBeginTargetType() {
        return beginTargetType;
    }

    /**
     * 实现方式
     * @param beginTargetType 实现方式
     */
    public void setBeginTargetType(String beginTargetType) {
        this.beginTargetType = beginTargetType == null ? null : beginTargetType.trim();
    }

    /**
     * 目标名称
     * @return TARGET_NAME 目标名称
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * 目标名称
     * @param targetName 目标名称
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    /**
     * 目标简介
     * @return TARGET_INTRODUCTION 目标简介
     */
    public String getTargetIntroduction() {
        return targetIntroduction;
    }

    /**
     * 目标简介
     * @param targetIntroduction 目标简介
     */
    public void setTargetIntroduction(String targetIntroduction) {
        this.targetIntroduction = targetIntroduction == null ? null : targetIntroduction.trim();
    }

    /**
     * 定目标的目的
     * @return PURPOSE 定目标的目的
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 定目标的目的
     * @param purpose 定目标的目的
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    /**
     * 目标创建人姓名
     * @return CREATE_TARGET_PERSON_NAME 目标创建人姓名
     */
    public String getCreateTargetPersonName() {
        return createTargetPersonName;
    }

    /**
     * 目标创建人姓名
     * @param createTargetPersonName 目标创建人姓名
     */
    public void setCreateTargetPersonName(String createTargetPersonName) {
        this.createTargetPersonName = createTargetPersonName == null ? null : createTargetPersonName.trim();
    }

    /**
     * 目标创建时间
     * @return CREATE_TARGET_TIME 目标创建时间
     */
    public Date getCreateTargetTime() {
        return createTargetTime;
    }

    /**
     * 目标创建时间
     * @param createTargetTime 目标创建时间
     */
    public void setCreateTargetTime(Date createTargetTime) {
        this.createTargetTime = createTargetTime;
    }

    /**
     * 实现目标开始时间
     * @return BEGIN_TARGET_TIME 实现目标开始时间
     */
    public Date getBeginTargetTime() {
        return beginTargetTime;
    }

    /**
     * 实现目标开始时间
     * @param beginTargetTime 实现目标开始时间
     */
    public void setBeginTargetTime(Date beginTargetTime) {
        this.beginTargetTime = beginTargetTime;
    }

    /**
     * 实现目标结束时间
     * @return END_TARGET_TIME 实现目标结束时间
     */
    public Date getEndTargetTime() {
        return endTargetTime;
    }

    /**
     * 实现目标结束时间
     * @param endTargetTime 实现目标结束时间
     */
    public void setEndTargetTime(Date endTargetTime) {
        this.endTargetTime = endTargetTime;
    }

    /**
     * 目标结束状态描述
     * @return END_TARGET_DESCRIPTION 目标结束状态描述
     */
    public String getEndTargetDescription() {
        return endTargetDescription;
    }

    /**
     * 目标结束状态描述
     * @param endTargetDescription 目标结束状态描述
     */
    public void setEndTargetDescription(String endTargetDescription) {
        this.endTargetDescription = endTargetDescription == null ? null : endTargetDescription.trim();
    }

    /**
     * 目标结束资金
     * @return END_TARGET_FUNDS 目标结束资金
     */
    public BigDecimal getEndTargetFunds() {
        return endTargetFunds;
    }

    /**
     * 目标结束资金
     * @param endTargetFunds 目标结束资金
     */
    public void setEndTargetFunds(BigDecimal endTargetFunds) {
        this.endTargetFunds = endTargetFunds;
    }

    /**
     * 目标结束方式
     * @return END_TARGET_TYPE 目标结束方式
     */
    public String getEndTargetType() {
        return endTargetType;
    }

    /**
     * 目标结束方式
     * @param endTargetType 目标结束方式
     */
    public void setEndTargetType(String endTargetType) {
        this.endTargetType = endTargetType == null ? null : endTargetType.trim();
    }

    /**
     * 记录更新人ID
     * @return UPDATER 记录更新人ID
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 记录更新人ID
     * @param updater 记录更新人ID
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * 记录更新人姓名
     * @return UPDATER_NAME 记录更新人姓名
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * 记录更新人姓名
     * @param updaterName 记录更新人姓名
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }

    /**
     * 记录更新时间
     * @return UPDATE_TIME 记录更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 记录更新时间
     * @param updateTime 记录更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 记录创建人ID
     * @return CREATER 记录创建人ID
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 记录创建人ID
     * @param creater 记录创建人ID
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * 记录创建人姓名
     * @return CREATER_NAME 记录创建人姓名
     */
    public String getCreaterName() {
        return createrName;
    }

    /**
     * 记录创建人姓名
     * @param createrName 记录创建人姓名
     */
    public void setCreaterName(String createrName) {
        this.createrName = createrName == null ? null : createrName.trim();
    }

    /**
     * 记录创建时间
     * @return CREATE_TIME 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 记录创建时间
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 记录是否有效 00 有效  11 无效
     * @return IS_ENABLE 记录是否有效 00 有效  11 无效
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**
     * 记录是否有效 00 有效  11 无效
     * @param isEnable 记录是否有效 00 有效  11 无效
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }
}