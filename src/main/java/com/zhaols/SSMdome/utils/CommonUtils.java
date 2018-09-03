package com.zhaols.SSMdome.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-09-03 13:51
 */
public class CommonUtils {
    public static String getUUID(){
        String UUID = "";
        String pass = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] text = new char[30];
        for(int i = 0;i < 30; i++){
            text [i] = pass.charAt((int) (Math.random() * pass.length()));
        }
        return new String(text);
    }

    /**
    *   功能描述: 根据加密盐 获取加密有字符串
    *
    *@Author: zhaols
    *@CreateTime: 2018-09-03  15:03
    */
    public static String MD5(String oldPW,String uSalt){
        Object obj = new SimpleHash("MD5", oldPW, uSalt, 1024);
        return obj.toString();
    }
}
