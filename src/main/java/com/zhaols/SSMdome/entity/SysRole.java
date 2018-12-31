package com.zhaols.SSMdome.entity;

import com.zhaols.SSMdome.BasicClassDri.BasicEntity;

import java.util.Date;

public class SysRole extends BasicEntity<String> {

  private String id;
  private String code;
  private String name;
  private String remark;
  private String description;
  private String updator;
  private String updatorName;
  private Date updateTime;
  private String creator;
  private String creatorName;
  private Date createTime;
  private String status;
  private String isDel;


  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getUpdator() {
    return updator;
  }

  public void setUpdator(String updator) {
    this.updator = updator;
  }


  public String getUpdatorName() {
    return updatorName;
  }

  public void setUpdatorName(String updatorName) {
    this.updatorName = updatorName;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public String getCreatorName() {
    return creatorName;
  }

  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getIsDel() {
    return isDel;
  }

  public void setIsDel(String isDel) {
    this.isDel = isDel;
  }

}
