package com.zhaols.TargetManagementSystem.entity;


import java.util.Date;

public class TargetImplementationRecord {

  private String id;
  private String stageId;
  private String stageName;
  private String stageTarget;
  private String isenable;
  private String stateProgress;
  private String storageAmount;
  private String numberPhasesPhase;
  private String updater;
  private String updaterName;
  private Date updateTime;
  private String creater;
  private String createrName;
  private Date createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getStageId() {
    return stageId;
  }

  public void setStageId(String stageId) {
    this.stageId = stageId;
  }


  public String getStageName() {
    return stageName;
  }

  public void setStageName(String stageName) {
    this.stageName = stageName;
  }


  public String getStageTarget() {
    return stageTarget;
  }

  public void setStageTarget(String stageTarget) {
    this.stageTarget = stageTarget;
  }


  public String getIsenable() {
    return isenable;
  }

  public void setIsenable(String isenable) {
    this.isenable = isenable;
  }


  public String getStateProgress() {
    return stateProgress;
  }

  public void setStateProgress(String stateProgress) {
    this.stateProgress = stateProgress;
  }


  public String getStorageAmount() {
    return storageAmount;
  }

  public void setStorageAmount(String storageAmount) {
    this.storageAmount = storageAmount;
  }


  public String getNumberPhasesPhase() {
    return numberPhasesPhase;
  }

  public void setNumberPhasesPhase(String numberPhasesPhase) {
    this.numberPhasesPhase = numberPhasesPhase;
  }


  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }


  public String getUpdaterName() {
    return updaterName;
  }

  public void setUpdaterName(String updaterName) {
    this.updaterName = updaterName;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public String getCreater() {
    return creater;
  }

  public void setCreater(String creater) {
    this.creater = creater;
  }


  public String getCreaterName() {
    return createrName;
  }

  public void setCreaterName(String createrName) {
    this.createrName = createrName;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
