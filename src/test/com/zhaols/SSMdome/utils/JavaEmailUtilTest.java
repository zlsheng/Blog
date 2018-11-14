package com.zhaols.SSMdome.utils; 

import com.zhaols.SSMdome.entity.Email;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* JavaEmailUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>10/24/2018</pre> 
* @version 1.0 
*/ 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:SpringConfig.xml"})
public class JavaEmailUtilTest {
@Before
public void before() throws Exception {
    System.out.println("开始测试");
} 

@After
public void after() throws Exception {
    System.out.println("结束测试");
}

/** 
* 
* Method: sendMail(String to, String subject, String content) 
* 
*/ 
@Test
public void testSendMail() throws Exception { 
//TODO: Test goes here...
    System.out.println("正在发送邮件");
    Email email = new Email();
    email.setReceiver("1219466321@qq.com");
    email.setTitle("邮箱绑定邮件 勿回！");
    email.setUrl("www.baidu.com");
    email.setContent("点击上面链接完成邮箱绑定");
    email.setReceiverName("zhaols");
    JavaEmailUtil.sendMail(email);
    System.out.println("邮件发送结束");
} 


} 
