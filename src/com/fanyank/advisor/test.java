package com.fanyank.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class test {
    public static void main(String[] args) {
        //静态普通方法匹配切面
        //该过程覆盖getClassFilter()使其仅匹配Waiter及其子类
//        String configPath = "com/fanyank/advisor/advisor.xml";
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
//
//        Waiter waiter = (Waiter) ctx.getBean("waiter");
//        Seller seller = (Seller) ctx.getBean("seller");
//
//        waiter.greetTo("tom");
//        waiter.serverTo("tom");
//        seller.greetTo("fanyank");

        //动态切面
//        String configPath = "com/fanyank/advisor/dynamicAdvisor.xml";
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
//
//        Waiter waiter = (Waiter) ctx.getBean("waiter2");
//        waiter.serverTo("Peter");
//        waiter.greetTo("Peter");
//        waiter.serverTo("Tom");
//        waiter.greetTo("Tom");
//
//        waiter.serverTo("Jackson");
//        waiter.greetTo("Jackson");

        //流程切面
//        String configPath = "com/fanyank/advisor/controlFlow.xml";
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
//
//        Waiter waiter = (Waiter) ctx.getBean("waiter3");
//        WaiterDelegate waiterDelegate = new WaiterDelegate();
//        waiterDelegate.setWaiter(waiter);
//
//        waiter.serverTo("tom");
//        waiter.greetTo("tom");
//        waiterDelegate.service("tom");

        //创建自动代理的切面
        String configPath = "com/fanyank/advisor/autoProxyCreator.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

        Waiter waiter = (Waiter) ctx.getBean("waiter");
        Seller seller = (Seller) ctx.getBean("seller");
        waiter.greetTo("Tom");
        seller.greetTo("Jackson");

    }
}
