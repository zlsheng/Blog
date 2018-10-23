package com.zhaols.SSMdome.shiro;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @author zhaols
 * @Description: TODO: 自定义验证码验证失败异常
 * @date 2018-08-23 10:53
 */
public class CaptchaException extends AuthenticationException {
    public CaptchaException() {
        super();
    }

    public CaptchaException(String message) {
        super(message);
    }

    public CaptchaException(Throwable cause) {
        super(cause);
    }

    public CaptchaException(String message, Throwable cause) {
        super(message, cause);
    }
}
