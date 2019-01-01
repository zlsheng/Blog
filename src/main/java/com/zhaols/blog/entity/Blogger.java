package com.zhaols.blog.entity;

import com.zhaols.SSMdome.BasicClassDri.Entity;

import java.util.Date;

public class Blogger extends Entity<String> {
    /**
     * null
     */
    private String id;

    /**
     * 博主昵称
     */
    private String nickName;

    /**
     * 登录帐号
     */
    private String loginAccount;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 密码加密盐
     */
    private String salt;

    /**
     * 博主真实姓名
     */
    private String realName;

    /**
     * 所在地址
     */
    private String address;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 职业
     */
    private String career;

    /**
     * 性别 0-男 1-女
     */
    private String sex;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 头像(存储头像文件名称)
     */
    private String headPortrait;

    /**
     * 博主帐号状态 00-正常 11-禁用
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
     * 博主昵称
     * @return NICK_NAME 博主昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 博主昵称
     * @param nickName 博主昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 登录帐号
     * @return LOGIN_ACCOUNT 登录帐号
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * 登录帐号
     * @param loginAccount 登录帐号
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    /**
     * 登录密码
     * @return PASSWORD 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 登录密码
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 密码加密盐
     * @return SALT 密码加密盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 密码加密盐
     * @param salt 密码加密盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 博主真实姓名
     * @return REAL_NAME 博主真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 博主真实姓名
     * @param realName 博主真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 所在地址
     * @return ADDRESS 所在地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 所在地址
     * @param address 所在地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 生日
     * @return BIRTHDAY 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 职业
     * @return CAREER 职业
     */
    public String getCareer() {
        return career;
    }

    /**
     * 职业
     * @param career 职业
     */
    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    /**
     * 性别 0-男 1-女
     * @return SEX 性别 0-男 1-女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别 0-男 1-女
     * @param sex 性别 0-男 1-女
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 个性签名
     * @return SIGNATURE 个性签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 个性签名
     * @param signature 个性签名
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
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

    /**
     * 博主帐号状态 00-正常 11-禁用
     * @return STATUS 博主帐号状态 00-正常 11-禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 博主帐号状态 00-正常 11-禁用
     * @param status 博主帐号状态 00-正常 11-禁用
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