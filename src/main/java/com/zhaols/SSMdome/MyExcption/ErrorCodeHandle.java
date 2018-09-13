/**
 * Copyright (c) 2006-2016 jqsoft.net
 */
package com.zhaols.SSMdome.MyExcption;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 错误代码管理类
 *
 * @author jinliang
 * @create 2016-11-22 下午 1:45
 **/
public class ErrorCodeHandle {

    /** 单例模式，全局的错误代码管理类 */
    private static ErrorCodeHandle errorCodeHandle = new ErrorCodeHandle();

    /** 错误代码配置文件，系统第一次启动时加载 */
    private Properties proper;

    /**
     * 单例模式
     * @return 错误代码管理类的单例
     **/
    public static ErrorCodeHandle getErrorCodeHandle() {
        if (null == errorCodeHandle) {
            errorCodeHandle = new ErrorCodeHandle();
        }
        return errorCodeHandle;
    }

    /**
     * 根据错误代码获取错误描述信息
     * @param key 错误代码
     * @return 错误代码对应的描述信息
     **/
    public String getErrorDesc(String key) {
        proper = new Properties();
        InputStreamReader inputStream = null;
        String value = null;

        try {
            inputStream = new InputStreamReader(
                    ErrorCodeHandle.class.getResourceAsStream("/error.properties"), "UTF-8");
            proper.load(inputStream);
            value = proper.getProperty(key).toString();
        } catch (Exception e) {
            proper = null;
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return value;
        }
    }

}
