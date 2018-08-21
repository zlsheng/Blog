package com.zhaols.SSMdome.action;

import com.zhaols.SSMdome.entity.ActiveUser;
import com.zhaols.SSMdome.utils.MyException;
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

    //登录方法
    public String toLogin() throws Exception{
        HttpServletRequest request = ServletActionContext.getRequest();
        // 如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        // 根据shiro返回的异常类路径判断，抛出指定异常信息
        if (exceptionClassName != null) {
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                // 最终会抛给异常处理器
                throw new MyException("账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
                throw new MyException("用户名/密码错误");
            } else if ("randomCodeError".equals(exceptionClassName)) {
                throw new MyException("验证码错误 ");
            } else {
                throw new Exception("不是账户错误，也不是密码错误");// 最终在异常处理器生成未知错误
            }
        }
        // 此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        // 登陆失败还到login页面
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
}
