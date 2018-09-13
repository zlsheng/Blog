package com.zhaols.SSMdome.MyExcption;

import com.zhaols.SSMdome.utils.Result;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-09-13 14:50
 */
public class MessageExcption extends Exception {
    private String message;
    private Result result;

    @Override
    public String getMessage() {
        return message;
    }

    public MessageExcption(boolean code, String message){
        this.message = message;
        result = new Result(code,message);
    }

}
