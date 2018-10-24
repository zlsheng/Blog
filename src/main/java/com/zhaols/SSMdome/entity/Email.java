package com.zhaols.SSMdome.entity;

import com.zhaols.SSMdome.BasicClassDri.BasicEntity;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 邮件实体
 * @date 2018-10-24 17:10
 */
public class Email extends BasicEntity<String> {

    /** 序列号 */
    private static final long serialVersionUID = -3562218214168975242L;

    /**  邮件编码 */
    public static final String ENCODEING = "UTF-8";

    /** 邮件发送人邮箱地址 */
    private String sender;

    /** 邮件接收人邮箱地址 */
    private String receiver;

    /** 邮件正文 */
    private String message;

    /** 邮件标题(支持HTML) */
    private String title;

    /** 发件人昵称 */
    private String senderName;

    public static String getENCODEING() {
        return ENCODEING;
    }

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
}
