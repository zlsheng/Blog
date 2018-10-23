package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.BasicClassDri.BasicAction;
import com.zhaols.SSMdome.MyExcption.ManagerException;
import com.zhaols.SSMdome.entity.ActiveUser;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.entity.SysUser;
import com.zhaols.SSMdome.service.IUserSysService;
import com.zhaols.SSMdome.shiro.CaptchaException;
import com.zhaols.SSMdome.utils.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zhaols
 * @Description: TODO: 添加功能描述
 * @date 2018-08-21 13:46
 */
public class LoginAction extends BasicAction<SysUser,IUserSysService> {
    //private String basePath = "";
    private String errorMsg = "";
    private ActiveUser activeUser;
    @Autowired
    private IUserSysService userSysService;

    //登录方法
    public String toLogin() throws Exception{
        // 如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) getHttpServletRequest().getAttribute("shiroLoginFailure");
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
        Subject subject = SecurityUtils.getSubject();
        activeUser = (ActiveUser) subject.getPrincipal();
        entity = userSysService.getUserById(activeUser.getUserid());
        return "success";
    }
    public String toRegistration(){
        return "toRegistration";
    }
    /**
    *   功能描述: 注册方法
    *
    *@Author: zhaols
    *@CreateTime: 2018-09-12  17:32
    */
    public String registration(){
        if(entity.getUserName() != null){
            try {
                userSysService.registration(entity);
            }catch (ManagerException m){
             result = new Result(false,m.getMessage());
            }
        }
        result = new Result(true,"注册成功");
        return RESULT;
        
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

    /**
     * 首页展示用户信息
     * @return
     */
    public String getUser(){
        Subject subject = SecurityUtils.getSubject();
        activeUser = (ActiveUser) subject.getPrincipal();

        try{
            entity = userSysService.getUserById(activeUser.getUserid());
        }catch(Exception e){
            e.printStackTrace();
        }

        return "userHome";
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

    @Override
    protected IUserSysService getEntityManager() {
        return userSysService;
    }
}
