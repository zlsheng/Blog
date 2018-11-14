package com.zhaols.SSMdome.utils;

import com.zhaols.SSMdome.entity.Email;
import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhaols
 * @version V1.0
 * @Description: TODO: 添加功能描述
 * @date 2018-10-24 11:37
 */
public class JavaEmailUtil {
    static final ApplicationContext actx = new ClassPathXmlApplicationContext("SpringConfig.xml");
    static final JavaMailSender javaMailSender = (JavaMailSender) actx.getBean("javaMailSender");
    static final SimpleMailMessage simpleMailMessage = (SimpleMailMessage) actx.getBean("simpleMailMessage");
//    static final ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) actx.getBean("threadPoolExecutor");

    /**
     *@Description:  执行发送邮件
     *@Author: zhaols
     *@param email  邮件实体
     *@Return: void
     *@CreateTime: 2018-10-24  11:44
     */
    public static void sendMail(Email email) {
        try{
            final MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true,Email.ENCODEING);
            mimeMessageHelper.setFrom(simpleMailMessage.getFrom());
            email.setMessage(getHtml(email).toString());
            if (email.getMessage() != null) {
                mimeMessageHelper.setSubject(email.getTitle());
            } else {
                mimeMessageHelper.setSubject(simpleMailMessage.getSubject());
            }
            mimeMessageHelper.setTo(email.getReceiver());
            mimeMessageHelper.setText(email.getMessage(), true);
            javaMailSender.send(mimeMessage);
            /*threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    javaMailSender.send(mimeMessage);
                }
            });*/

        }catch(MessagingException e){
            e.printStackTrace();
        }
    }


    /**
     *@Description:  获取邮件内容
     *@Author: zhaols
     *@param email
     *@Return: java.lang.StringBuffer
     *@CreateTime: 2018-11-02  15:26
     */
    private static StringBuffer getHtml(Email email){
        StringBuffer mail = new StringBuffer();
        String h = "<br/>";
        String heard = "<h2><font color='green'>" + email.getReceiverName() +"，您好！</font></h2>";
        String title = "<h4 style='color: red' >注意：30分钟后链接将失效!,请在30分钟内完后邮箱绑定</h4>";
        String url = "";
        if(StringUtils.isNotEmpty(email.getUrl())){
            url = email.getUrl();
        }
        String content = "<span>" + email.getContent() + "</span>" ;
        mail.append(heard).append(h).append(title).append(h).append(url).append(h).append(content).append(h);

        return mail;
    }
}
