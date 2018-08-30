package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.SSMdome.entity.ActiveUser;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.shiro.CaptchaException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-21 13:46
 */
public class LoginAction extends BasicAction<SysUser> {
    //private String basePath = "";
    private String errorMsg = "";
    private ActiveUser activeUser;

    //登录方法
    public String toLogin() throws Exception{
        HttpServletRequest request = ServletActionContext.getRequest();
        // 如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        if (exceptionClassName != null) {
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                errorMsg = "账号不存在";
            } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
                errorMsg = "用户名/密码错误";
            } else if (CaptchaException.class.getName().equals(exceptionClassName)) {
                    errorMsg = "验证码错误";
                } else {
                    errorMsg = "系统内部错误";
                }

        }
        return "login";
    }

    //跳转主页
    public String index(){
        HttpSession session  =ServletActionContext.getRequest().getSession();

        Subject subject = SecurityUtils.getSubject();

        activeUser = (ActiveUser) subject.getPrincipal();

        return "success";
    }
    public String getTestPage(){
        return "test";
    }
    public String error(){
        return "unauthorized";
    }

    public void logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ActiveUser getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(ActiveUser activeUser) {
        this.activeUser = activeUser;
    }
}
