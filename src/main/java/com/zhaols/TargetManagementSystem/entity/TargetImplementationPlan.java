package com.zhaols.TargetManagementSystem.entity;

import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.util.Date;
/**
 *@Description: 目标实现计划实体类
 *@Author: zhaols
 *@Return:
 *@CreateTime: 2018-12-30  9:40
 */
public class TargetImplementationPlan extends Entity<String> {
    /**
     * 目标记录详情ID
     */
    private String id;

    /**
     * 计划精度  Y 年  M月   D日 H时  
     */
    private String planAccuracy;

    /**
     * 计划阶段
     */
    private String planningStage;

    /**
     * 目标ID
     */
    private String targetId;

    /**
     * 阶段名称
     */
    private String planningStageName;

    /**
     * 阶段目标
     */
    private String planningStageTarget;

    /**
     * 阶段目的
     */
    private String planningStageAim;

    /**
     * 阶段开始时间
     */
    private Date startTime;

    /**
     * 阶段结束时间
     */
    private Date endTime;

    /**
     * 阶段需要做的事情
     */
    private String stageDoing;

    /**
     * 备用字段
     */
    private String remake1;

    /**
     * 备用字段
     */
    private String remake2;

    /**
     * 备用字段
     */
    private String remake3;

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
     * 计划精度  Y 年  M月   D日 H时  
     * @return PLAN_ACCURACY 计划精度  Y 年  M月   D日 H时  
     */
    public String getPlanAccuracy() {
        return planAccuracy;
    }

    /**
     * 计划精度  Y 年  M月   D日 H时  
     * @param planAccuracy 计划精度  Y 年  M月   D日 H时  
     */
    public void setPlanAccuracy(String planAccuracy) {
        this.planAccuracy = planAccuracy == null ? null : planAccuracy.trim();
    }

    /**
     * 计划阶段
     * @return PLANNING_STAGE 计划阶段
     */
    public String getPlanningStage() {
        return planningStage;
    }

    /**
     * 计划阶段
     * @param planningStage 计划阶段
     */
    public void setPlanningStage(String planningStage) {
        this.planningStage = planningStage == null ? null : planningStage.trim();
    }

    /**
     * 目标ID
     * @return TARGET_ID 目标ID
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * 目标ID
     * @param targetId 目标ID
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    /**
     * 阶段名称
     * @return PLANNING_STAGE_NAME 阶段名称
     */
    public String getPlanningStageName() {
        return planningStageName;
    }

    /**
     * 阶段名称
     * @param planningStageName 阶段名称
     */
    public void setPlanningStageName(String planningStageName) {
        this.planningStageName = planningStageName == null ? null : planningStageName.trim();
    }

    /**
     * 阶段目标
     * @return PLANNING_STAGE_TARGET 阶段目标
     */
    public String getPlanningStageTarget() {
        return planningStageTarget;
    }

    /**
     * 阶段目标
     * @param planningStageTarget 阶段目标
     */
    public void setPlanningStageTarget(String planningStageTarget) {
        this.planningStageTarget = planningStageTarget == null ? null : planningStageTarget.trim();
    }

    /**
     * 阶段目的
     * @return PLANNING_STAGE_AIM 阶段目的
     */
    public String getPlanningStageAim() {
        return planningStageAim;
    }

    /**
     * 阶段目的
     * @param planningStageAim 阶段目的
     */
    public void setPlanningStageAim(String planningStageAim) {
        this.planningStageAim = planningStageAim == null ? null : planningStageAim.trim();
    }

    /**
     * 阶段开始时间
     * @return START_TIME 阶段开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 阶段开始时间
     * @param startTime 阶段开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 阶段结束时间
     * @return END_TIME 阶段结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 阶段结束时间
     * @param endTime 阶段结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 阶段需要做的事情
     * @return STAGE_DOING 阶段需要做的事情
     */
    public String getStageDoing() {
        return stageDoing;
    }

    /**
     * 阶段需要做的事情
     * @param stageDoing 阶段需要做的事情
     */
    public void setStageDoing(String stageDoing) {
        this.stageDoing = stageDoing == null ? null : stageDoing.trim();
    }

    /**
     * 备用字段
     * @return REMAKE_1 备用字段
     */
    public String getRemake1() {
        return remake1;
    }

    /**
     * 备用字段
     * @param remake1 备用字段
     */
    public void setRemake1(String remake1) {
        this.remake1 = remake1 == null ? null : remake1.trim();
    }

    /**
     * 备用字段
     * @return REMAKE_2 备用字段
     */
    public String getRemake2() {
        return remake2;
    }

    /**
     * 备用字段
     * @param remake2 备用字段
     */
    public void setRemake2(String remake2) {
        this.remake2 = remake2 == null ? null : remake2.trim();
    }

    /**
     * 备用字段
     * @return REMAKE_3 备用字段
     */
    public String getRemake3() {
        return remake3;
    }

    /**
     * 备用字段
     * @param remake3 备用字段
     */
    public void setRemake3(String remake3) {
        this.remake3 = remake3 == null ? null : remake3.trim();
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