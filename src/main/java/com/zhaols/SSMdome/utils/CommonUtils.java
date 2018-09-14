package com.zhaols.SSMdome.utils;


import org.apache.commons.codec.binary.Base64;
import org.apache.shiro.crypto.hash.SimpleHash;
import java.io.UnsupportedEncodingException;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-09-03 13:51
 */
public class CommonUtils {
    private final static String DES_KEY = "ssmDome";
    private final static String DES = "DES";
    private final static String ENCODE = "UTF-8";
    private final static int UID_LENGTH = 30;
    private final static int FILE_NAME_LENGTH = 10;


    public static String getUUID(){
        String UUID = "";
        String pass = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] text = new char[UID_LENGTH];
        for(int i = 0;i < UID_LENGTH; i++){
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

    /**
     * 对给定的字符串进行base64解码操作
     */
    public static String decodeData(String inputData) {
        try {
            if (null == inputData) {
                return null;
            }
            return new String(Base64.decodeBase64(inputData.getBytes(ENCODE)), ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 对给定的字符串进行base64加密操作
     */
    public static String encodeData(String inputData) {
        try {
            if (null == inputData) {
                return null;
            }
            return new String(Base64.encodeBase64(inputData.getBytes(ENCODE)), ENCODE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getFileName(){
        String fileName = "";
        String name = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] text = new char[FILE_NAME_LENGTH];
        for(int i = 0;i < FILE_NAME_LENGTH; i++){
            text [i] = name.charAt((int) (Math.random() * name.length()));
        }
        return "avatar_" + new String(text);
    }

}
