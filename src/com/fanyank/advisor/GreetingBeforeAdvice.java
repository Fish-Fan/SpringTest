package com.fanyank.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
//增强类的定义
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "." + method.getName());
        String clientName = (String) objects[0];
        System.out.println("How are you!Mr." + clientName);
    }
}
