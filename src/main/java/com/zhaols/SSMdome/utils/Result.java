package com.zhaols.SSMdome.utils;

import java.io.Serializable;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-30 16:29
 */
public class Result implements Serializable {
    private boolean success=false;
    private String message;
    private boolean closeCurrent=false;
    private String forward;

    public Result(boolean success){
        this.success=success;
    }

    public Result(boolean success,String message){
        this.success=success;
        this.message=message;
    }
    public Result(boolean success,String message,String forward,boolean closeCurrent){
        this.success=success;
        this.message=message;
        this.forward=forward;
        this.closeCurrent=closeCurrent;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isCloseCurrent() {
        return closeCurrent;
    }

    public void setCloseCurrent(boolean closeCurrent) {
        this.closeCurrent = closeCurrent;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }
}
