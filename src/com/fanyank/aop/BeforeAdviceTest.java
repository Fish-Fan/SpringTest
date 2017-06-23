package com.fanyank.aop;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class BeforeAdviceTest {
    public void before() {
        Waiter target = new NavieWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        //spring提供的代理工厂
        ProxyFactory pf = new ProxyFactory();

        //设置代理目标
        pf.setTarget(target);
        pf.addAdvice(advice);

        //生成代理实例
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("tom");
        proxy.serverTo("tom");
    }
}
