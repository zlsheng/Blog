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
        map.put("userName",email.getReceiverName());
        map.put("content",email.getMessage());
        map.put("url","www.baidu.com");
        email.setTitle("来自一位想飞的帅小伙");
        email.setMessage(getHtml(map).toString());

        sendMail(email);
    }


    /**
     *      try {
     *             // 根据模板内容，动态把map中的数据填充进去，生成HTML
     *             Template template = freeMarkerConfigurer.getConfiguration().getTemplate("/common/_mail.html");
     *
     *             // map中的key，对应模板中的${key}表达式
     *             email.setMessage(FreeMarkerTemplateUtils.processTemplateIntoString(template, map));
     *         } catch (IOException e) {
     *             e.printStackTrace();
     *         } catch (TemplateException e) {
     *             e.printStackTrace();
     *         }
     *
     */
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


    private static StringBuffer getHtml(Map<String,String> map){
        StringBuffer mail = new StringBuffer();
        String h = "<br/>";
        String heard = "<h2><font color='green'>" + map.get("userName") +"，您好！</font></h2>";
        String title = "<p>注意：30分钟后链接将失效!</p>";
        String url = "";
        if(StringUtils.isNotEmpty(map.get("url"))){
            url = map.get("url");
        }
        String content = map.get("content");
        mail.append(heard).append(h).append(title).append(h).append(url).append(h).append(content).append(h);

        return mail;
    }
}
