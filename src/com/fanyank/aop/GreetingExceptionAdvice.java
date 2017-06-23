package com.fanyank.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class GreetingExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method,Object[] args,Object object,Exception ex) {
        System.out.println("----------");
        System.out.println("method:" + method.getName());
        System.out.println("抛出异常:" + ex.getMessage());
        System.out.println("成功回滚事务");
    }
}
