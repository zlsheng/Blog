package com.zhaols.SSMdome.MyExcption;

import javassist.tools.rmi.ObjectNotFoundException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.rmi.NoSuchObjectException;
import java.sql.BatchUpdateException;
import java.sql.SQLWarning;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-09-13 14:40
 */
public class ManagerException extends Exception {
    /** 返回到前台的概要信息（中文） */
    protected String errMsg = "";

    /** 错误的辅助信息[异常产生的时间（精确到秒）] */
    protected String errHelp = (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());

    /** 预留的错误信息（备用） */
    protected String errHideMsg;

    /** 原始异常 */
    protected Throwable myException;

    /** 全局错误码，为错误提示信息提供 */
    private static String GLOBAL_ERROR = "100200";

    /**
     * 简单异常记录，直接调用父类异常处理
     * ManagerException.
     * @param message
     * @param cause
     */
    public ManagerException(String message, Throwable cause) {
        super(message,cause);
    }

    /**
     * 所有底层抛出的异常信息，供系统级别异常调用
     * 注意：开发人员请勿调用
     * @param ex Throwable 底层异常
     **/
    public ManagerException(Throwable ex) {
        super(ex.toString());
        this.myException = ex;

        String errCode = this.handleSystemException(ex);
        this.errMsg = ErrorCodeHandle.getErrorCodeHandle().getErrorDesc(errCode);
    }

    /**
     * 所有开发人员抛出的业务异常都必须调用该构造函数
     * 包括：提示信息、已知异常信息
     * @param errCode 错误代码
     **/
    public ManagerException(String errCode) {
        super(errCode);
        this.errMsg = ErrorCodeHandle.getErrorCodeHandle().getErrorDesc(errCode);

    }

    /**
     * 所有开发人员抛出的业务异常都必须调用该构造函数
     * 包括：提示信息、已知异常信息
     * @param errCode 错误代码
     * @param hideMsg 预留的错误信息（备用）
     */
    public ManagerException(String errCode, String hideMsg) {
        super(errCode);
        this.errMsg = ErrorCodeHandle.getErrorCodeHandle().getErrorDesc(errCode);
        this.errHideMsg = hideMsg;
    }

    /**
     * 扩展的构造函数，可以动态的修改错误描述信息
     * 如：100200={0},后面{0}可以替换成任何自定义的信息
     * @param errCode 错误代码
     * @param errMsgs 需要替换的错误提示信息
     */
    public ManagerException(String errCode, String[] errMsgs) {
        super(errCode == null ? GLOBAL_ERROR : errCode);

        if(null == errCode) {
            errCode = GLOBAL_ERROR;
        }

        // 根据错误码获得错误提示信息
        String message = ErrorCodeHandle.getErrorCodeHandle().getErrorDesc(errCode);
        for (int i = 0; i < errMsgs.length; i++) {
            message = message.replace("{" + i + "}", errMsgs[i]);
        }
        this.errMsg = message;
    }

    /**
     * 适配系统异常方法，根据异常类型来找到对应的错误代码
     * @param throwable 底层异常
     * @return String 系统错误代码
     **/
    private String handleSystemException(Throwable throwable) {
        // 错误代码
        String errorCode = "100101";

        if (throwable instanceof NullPointerException) {
            errorCode = "100102";
        } else if (throwable instanceof ClassCastException) {
            errorCode = "100103";
        } else if (throwable instanceof NumberFormatException) {
            errorCode = "100104";
        } else if (throwable instanceof FileNotFoundException) {
            errorCode = "100105";
        } else if (throwable instanceof IOException) {
            errorCode = "100106";
        } else if (throwable instanceof ArrayIndexOutOfBoundsException) {
            errorCode = "100107";
        } else if (throwable instanceof IndexOutOfBoundsException) {
            errorCode = "100108";
        } else if (throwable instanceof ClassNotFoundException) {
            errorCode = "100109";
        } else if (throwable instanceof NoSuchMethodException) {
            errorCode = "100110";
        } else if (throwable instanceof SecurityException) {
            errorCode = "100111";
        } else if (throwable instanceof SQLWarning) {
            errorCode = "100112";
        } else if (throwable instanceof BatchUpdateException) {
            errorCode = "100113";
        } else if (throwable instanceof ObjectNotFoundException) {
            errorCode = "100114";
        } else if (throwable instanceof NoSuchObjectException) {
            errorCode = "100115";
        } else if (throwable instanceof UnsupportedEncodingException) {
            errorCode = "100116";
        }
        return errorCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getErrHelp() {
        return errHelp;
    }

    public void setErrHelp(String errHelp) {
        this.errHelp = errHelp;
    }

    public String getErrHideMsg() {
        return errHideMsg;
    }

    public void setErrHideMsg(String errHideMsg) {
        this.errHideMsg = errHideMsg;
    }

    public Throwable getMyException() {
        return myException;
    }

    public void setMyException(Throwable myException) {
        this.myException = myException;
    }
}
