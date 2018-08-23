package com.zhaols.SSMdome.shiro;



import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
    //private static final Logger LOG = LoggerFactory.getLogger(CaptchaFormAuthenticationFilter.class);
    public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

    private String captchaParam = DEFAULT_CAPTCHA_PARAM;

    /**
     *  验证方法
     */
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        CaptchaUsernamePasswordToken token =  createToken(request,response);
        try{
            doCaptchaValidate((HttpServletRequest) request, token);
            Subject subject = getSubject(request, response);
            subject.login(token);//正常验证
            return onLoginSuccess(token, subject, request, response);
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

    protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }
}
