package com.fanyank.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class GreetingAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String clientName = (String) args[0];
        System.out.println("How are you! Mr." + clientName);

        Object object = methodInvocation.proceed();

        System.out.println("Enjoy yourself!");
        return object;
    }
}
