package com.zhaols.SSMdome.entity;

import com.zhaols.SSMdome.BasicClassDri.BasicEntity;

import java.util.Map;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 邮件实体
 * @date 2018-10-24 17:10
 */
public class Email extends BasicEntity<String> {


    /**
     *@Description:
     *@Author: zhaols
     *@param receiver 收件人邮箱
     *@param content  邮件信息
     *@param title  邮件标题
     *@param senderName 发送人名称
     *@param receiverName 接收人名称
     *@param url url地址
     *@Return:
     *@CreateTime: 2018-11-02  15:15
     */
    public Email( String receiver, String content, String title, String senderName,String receiverName,String url) {
        this.receiver = receiver;
        this.content = content;
        this.title = title;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.url = url;
    }

    public Email(String receiver, String message) {
        this.receiver = receiver;
        this.message = message;
    }

    public Email() { }


    /** 序列号 */
    private static final long serialVersionUID = -3562218214168975242L;

    /**  邮件编码 */
    public static final String ENCODEING = "UTF-8";

    /** 邮件发送人邮箱地址 */
    private String sender;

    /** 邮件接收人邮箱地址 */
    private String receiver;

    /** 邮件接收人昵称 */
    private String receiverName;

    /** 邮件正文(HTML) */
    private String message;

    /** 邮件标题 */
    private String title;

    /** 发件人昵称 */
    private String senderName;

    /** 绑定邮箱及修改密码的URL存放地址 */
    private String url;

    /** 邮件正文 */
    private String content;


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
