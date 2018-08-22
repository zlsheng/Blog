package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.entity.ActiveUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-21 13:46
 */
public class LoginAction {
    private String errorMsg = "";

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
            } else if ("org.apache.shiro.authc.AuthenticationException".equals(exceptionClassName)) {
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
        //从shiro的session中取activeUser
        Subject subject = SecurityUtils.getSubject();
        //取身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //通过model传到页面
        System.out.println(activeUser.getUsername() + "  =================================");
        //session.setAttribute("activeUser", activeUser);
        return "success";
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
}
