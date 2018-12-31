package com.zhaols.TargetManagementSystem.entity;

import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *@Description: 目标实现记录实体类
 *@Author: zhaols
 *@Return:
 *@CreateTime: 2018-12-30  9:41
 */
public class TargetImplementationRecord extends Entity<String> {
    /**
     * id
     */
    private String id;

    /**
     * 阶段ID
     */
    private String stageId;

    /**
     * 阶段名称
     */
    private String stageName;

    /**
     * 阶段目的
     */
    private String stageTarget;

    /**
     * 记录是否有效 00有效  11无效
     */
    private String isenable;

    /**
     *  阶段计划进行状态 00未开始  11正在进行  22已完成
     */
    private String stateProgress;

    /**
     * 已经存储金额数
     */
    private BigDecimal storageAmount;

    /**
     * 阶段预计存储金额总数
     */
    private BigDecimal numberPhasesPhase;

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
     * id
     * @return ID id
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    @Override
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 阶段ID
     * @return STAGE_ID 阶段ID
     */
    public String getStageId() {
        return stageId;
    }

    /**
     * 阶段ID
     * @param stageId 阶段ID
     */
    public void setStageId(String stageId) {
        this.stageId = stageId == null ? null : stageId.trim();
    }

    /**
     * 阶段名称
     * @return STAGE_NAME 阶段名称
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * 阶段名称
     * @param stageName 阶段名称
     */
    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    /**
     * 阶段目的
     * @return STAGE_TARGET 阶段目的
     */
    public String getStageTarget() {
        return stageTarget;
    }

    /**
     * 阶段目的
     * @param stageTarget 阶段目的
     */
    public void setStageTarget(String stageTarget) {
        this.stageTarget = stageTarget == null ? null : stageTarget.trim();
    }

    /**
     * 记录是否有效 00有效  11无效
     * @return ISENABLE 记录是否有效 00有效  11无效
     */
    public String getIsenable() {
        return isenable;
    }

    /**
     * 记录是否有效 00有效  11无效
     * @param isenable 记录是否有效 00有效  11无效
     */
    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
    }

    /**
     *  阶段计划进行状态 00未开始  11正在进行  22已完成
     * @return STATE_PROGRESS  阶段计划进行状态 00未开始  11正在进行  22已完成
     */
    public String getStateProgress() {
        return stateProgress;
    }

    /**
     *  阶段计划进行状态 00未开始  11正在进行  22已完成
     * @param stateProgress  阶段计划进行状态 00未开始  11正在进行  22已完成
     */
    public void setStateProgress(String stateProgress) {
        this.stateProgress = stateProgress == null ? null : stateProgress.trim();
    }

    /**
     * 已经存储金额数
     * @return STORAGE_AMOUNT 已经存储金额数
     */
    public BigDecimal getStorageAmount() {
        return storageAmount;
    }

    /**
     * 已经存储金额数
     * @param storageAmount 已经存储金额数
     */
    public void setStorageAmount(BigDecimal storageAmount) {
        this.storageAmount = storageAmount;
    }

    /**
     * 阶段预计存储金额总数
     * @return NUMBER_PHASES_PHASE 阶段预计存储金额总数
     */
    public BigDecimal getNumberPhasesPhase() {
        return numberPhasesPhase;
    }

    /**
     * 阶段预计存储金额总数
     * @param numberPhasesPhase 阶段预计存储金额总数
     */
    public void setNumberPhasesPhase(BigDecimal numberPhasesPhase) {
        this.numberPhasesPhase = numberPhasesPhase;
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
}