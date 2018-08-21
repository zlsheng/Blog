package com.zhaols.SSMdome.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserSys  {

    private String uId;

    private String uLoginid;

    /**
     * 昵称
     */
    private String uNickname;

    /**
     * 密码
     */
    private String uPassword;

    /**
     * 个性签名
     */
    private String uSignature;

    /**
     * 0 男  1 女  2 保密
     */
    private BigDecimal uSex;

    /**
     * 生日
     */
    private Date uBirthday;

    /**
     * 真实姓名
     */
    private String uName;

    /**
     * 邮箱
     */
    private String uEmail;

    /**
     * 简介
     */
    private String uIntro;

    /**
     * 头像
     */
    private String uHeadportrait;

    /**
     * 年龄
     */
    private BigDecimal uAge;

    /**
     * 用户状态
     */
    private String uUserstateid;

    /**
     * 等级
     */
    private BigDecimal uRank;

    /**
     * 积分
     */
    private BigDecimal uScore;

    /**
     * 注册时间
     */
    private Date uRegistertime;

    /**
     * 最后登录时间
     */
    private Date uLogintime;

    /**
     * 最后登录ip
     */
    private String uLoginip;

    /**
     * 激活码
     */
    private String uActivatecode;

    /**
     * 加密盐
     */
    private String uSalt;

    /**
     * 昵称
     * @return U_NICKNAME 昵称
     */
    public String getuNickname() {
        return uNickname;
    }

    /**
     * 昵称
     * @param uNickname 昵称
     */
    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    /**
     * 密码
     * @return U_PASSWORD 密码
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * 密码
     * @param uPassword 密码
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    /**
     * 个性签名
     * @return U_SIGNATURE 个性签名
     */
    public String getuSignature() {
        return uSignature;
    }

    /**
     * 个性签名
     * @param uSignature 个性签名
     */
    public void setuSignature(String uSignature) {
        this.uSignature = uSignature == null ? null : uSignature.trim();
    }

    /**
     * 0 男  1 女  2 保密
     * @return U_SEX 0 男  1 女  2 保密
     */
    public BigDecimal getuSex() {
        return uSex;
    }

    /**
     * 0 男  1 女  2 保密
     * @param uSex 0 男  1 女  2 保密
     */
    public void setuSex(BigDecimal uSex) {
        this.uSex = uSex;
    }

    /**
     * 生日
     * @return U_BIRTHDAY 生日
     */
    public Date getuBirthday() {
        return uBirthday;
    }

    /**
     * 生日
     * @param uBirthday 生日
     */
    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    /**
     * 真实姓名
     * @return U_NAME 真实姓名
     */
    public String getuName() {
        return uName;
    }

    /**
     * 真实姓名
     * @param uName 真实姓名
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * 邮箱
     * @return U_EMAIL 邮箱
     */
    public String getuEmail() {
        return uEmail;
    }

    /**
     * 邮箱
     * @param uEmail 邮箱
     */
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    /**
     * 简介
     * @return U_INTRO 简介
     */
    public String getuIntro() {
        return uIntro;
    }

    /**
     * 简介
     * @param uIntro 简介
     */
    public void setuIntro(String uIntro) {
        this.uIntro = uIntro == null ? null : uIntro.trim();
    }

    /**
     * 头像
     * @return U_HEADPORTRAIT 头像
     */
    public String getuHeadportrait() {
        return uHeadportrait;
    }

    /**
     * 头像
     * @param uHeadportrait 头像
     */
    public void setuHeadportrait(String uHeadportrait) {
        this.uHeadportrait = uHeadportrait == null ? null : uHeadportrait.trim();
    }

    /**
     * 年龄
     * @return U_AGE 年龄
     */
    public BigDecimal getuAge() {
        return uAge;
    }

    /**
     * 年龄
     * @param uAge 年龄
     */
    public void setuAge(BigDecimal uAge) {
        this.uAge = uAge;
    }

    /**
     * 用户状态
     * @return U_USERSTATEID 用户状态
     */
    public String getuUserstateid() {
        return uUserstateid;
    }

    /**
     * 用户状态
     * @param uUserstateid 用户状态
     */
    public void setuUserstateid(String uUserstateid) {
        this.uUserstateid = uUserstateid == null ? null : uUserstateid.trim();
    }

    /**
     * 等级
     * @return U_RANK 等级
     */
    public BigDecimal getuRank() {
        return uRank;
    }

    /**
     * 等级
     * @param uRank 等级
     */
    public void setuRank(BigDecimal uRank) {
        this.uRank = uRank;
    }

    /**
     * 积分
     * @return U_SCORE 积分
     */
    public BigDecimal getuScore() {
        return uScore;
    }

    /**
     * 积分
     * @param uScore 积分
     */
    public void setuScore(BigDecimal uScore) {
        this.uScore = uScore;
    }

    /**
     * 注册时间
     * @return U_REGISTERTIME 注册时间
     */
    public Date getuRegistertime() {
        return uRegistertime;
    }

    /**
     * 注册时间
     * @param uRegistertime 注册时间
     */
    public void setuRegistertime(Date uRegistertime) {
        this.uRegistertime = uRegistertime;
    }

    /**
     * 最后登录时间
     * @return U_LOGINTIME 最后登录时间
     */
    public Date getuLogintime() {
        return uLogintime;
    }

    /**
     * 最后登录时间
     * @param uLogintime 最后登录时间
     */
    public void setuLogintime(Date uLogintime) {
        this.uLogintime = uLogintime;
    }

    /**
     * 最后登录ip
     * @return U_LOGINIP 最后登录ip
     */
    public String getuLoginip() {
        return uLoginip;
    }

    /**
     * 最后登录ip
     * @param uLoginip 最后登录ip
     */
    public void setuLoginip(String uLoginip) {
        this.uLoginip = uLoginip == null ? null : uLoginip.trim();
    }

    /**
     * 激活码
     * @return U_ACTIVATECODE 激活码
     */
    public String getuActivatecode() {
        return uActivatecode;
    }

    /**
     * 激活码
     * @param uActivatecode 激活码
     */
    public void setuActivatecode(String uActivatecode) {
        this.uActivatecode = uActivatecode == null ? null : uActivatecode.trim();
    }

    /**
     * 加密盐
     * @return U_SALT 加密盐
     */
    public String getuSalt() {
        return uSalt;
    }

    /**
     * 加密盐
     * @param uSalt 加密盐
     */
    public void setuSalt(String uSalt) {
        this.uSalt = uSalt == null ? null : uSalt.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuLoginId() {
        return uLoginid;
    }

    public void setuLoginId(String uLoginid) {
        this.uLoginid = uLoginid;
    }
}