package com.zhaols.SSMdome.shiro;



import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhaols.SSMdome.entity.ActiveUser;
import com.zhaols.SSMdome.entity.SysResources;
import com.zhaols.SSMdome.service.IUserSysService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
    //private static final Logger LOG = LoggerFactory.getLogger(CaptchaFormAuthenticationFilter.class);
    public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

    @Autowired
    private IUserSysService userSysService;

    private String captchaParam = DEFAULT_CAPTCHA_PARAM;

    /**
     *  验证方法
     */
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        CaptchaUsernamePasswordToken token =  createToken(request,response);
        try{
            doCaptchaValidate((HttpServletRequest) request, token);
            /*Subject subject = getSubject(request, response);
            //正常验证
            subject.login(token);
            return onLoginSuccess(token, subject, request, response);*/
            return super.executeLogin(request,response);
        }catch (AuthenticationException e){
            return onLoginFailure(token, e, request, response);
        }
    }

    private void doCaptchaValidate(HttpServletRequest request, CaptchaUsernamePasswordToken token) {
        String captcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (captcha != null && !captcha.equalsIgnoreCase(token.getCaptcha())) {
            throw new CaptchaException("验证码错误");
        }
    }

    @Override
    protected CaptchaUsernamePasswordToken createToken(ServletRequest request, ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        String captcha = getCaptcha(request);
        boolean rememberMe = isRememberMe(request);
        String host = getHost(request);

        return new CaptchaUsernamePasswordToken(username, password, rememberMe, host, captcha);
    }

	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
		HttpServletResponse httpResponse=(HttpServletResponse) response;
		HttpServletRequest httpRequest=(HttpServletRequest)request;
        userSysService.amendLoginInfo(getUsername(request),getIpAddress(httpRequest),new Date());
		httpResponse.sendRedirect(httpRequest.getContextPath() + "/admin/login_index.do");
		return true;
		//return super.onLoginSuccess(token, subject, request, response);
	}

    public String getCaptchaParam() {
        return captchaParam;
    }

    public void setCaptchaParam(String captchaParam) {
        this.captchaParam = captchaParam;
    }

    private String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }
    private String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
    }
}
