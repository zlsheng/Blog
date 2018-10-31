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
* Method: send(String nickName, String content, String email) 
* 
*/ 
@Test
public void testSend() throws Exception { 
//TODO: Test goes here...
     Email email = new Email("1219466321@qq.com","测试邮件,测试URL和Html页面是否能耐够发送","这是一份测试邮件","66","亲爱的用户");
    System.out.println("正在发送邮件");
    JavaEmailUtil.send(email);
    System.out.println("邮件发送结束");

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
    Email email = new Email("1219466321@qq.com","测试邮件,测试URL和Html页面是否能耐够发送","这是一份测试邮件","66","亲爱的用户");
    JavaEmailUtil.sendMail(email);
    System.out.println("邮件发送结束");
} 


} 
