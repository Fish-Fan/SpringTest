package com.fanyank.aop;

import com.fanyank.service.ForumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class test {
    public static void main(String[] args) {
        //传统方式
//        BeforeAdviceTest beforeAdviceTest = new BeforeAdviceTest();
//        beforeAdviceTest.before();
        //基于spring配置的方式
        String configPath = "com/fanyank/aop/aop.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
//        Waiter waiter = (Waiter) ctx.getBean("waiter");
//        waiter.greetTo("tom");
        ForumService forumService = (ForumService) ctx.getBean("forumService");
//        forumService.removeForum(1);
        try {
            forumService.updateForum(2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
