package com.zhaols.SSMdome.utils;

import com.zhaols.SSMdome.entity.Email;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
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
    static final FreeMarkerConfigurer freeMarkerConfigurer = (FreeMarkerConfigurer) actx.getBean("freemarkerConfig");



    /**
     *@Description: 从freemarker模板中构建邮件内容
     *@Author: zhaols
     *@param email  邮件实体
     *@Return: void
     *@CreateTime: 2018-10-24  11:39
     */
    public static  void send(Email email) {
        String receiver = email.getReceiver();
        String text = "";
        Map<String,String> map = new HashMap<>();
        map.put("nickName",email.getSenderName());
        map.put("content",email.getMessage());
        try {
            // 根据模板内容，动态把map中的数据填充进去，生成HTML
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate("/common/_mail.html");
            // map中的key，对应模板中的${key}表达式
            email.setMessage(FreeMarkerTemplateUtils.processTemplateIntoString(template, map));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        sendMail(email);
    }

    /**
     *@Description:  执行发送邮件
     *@Author: zhaols
     *@param email  邮件实体
     *@Return: void
     *@CreateTime: 2018-10-24  11:44
     */
    public static void sendMail(Email email) {
        try{
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true,Email.ENCODEING);
            mimeMessageHelper.setFrom(simpleMailMessage.getFrom());

            if (email.getMessage() != null) {
                mimeMessageHelper.setSubject(email.getMessage());
            } else {
                mimeMessageHelper.setSubject(simpleMailMessage.getSubject());
            }
            mimeMessageHelper.setTo(email.getReceiver());
            mimeMessageHelper.setText(email.getMessage(), true);
            javaMailSender.send(mimeMessage);
        }catch(MessagingException e){
            e.printStackTrace();
        }
    }
}
