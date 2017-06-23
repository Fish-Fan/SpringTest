package com.fanyank.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
//切面定义(切入点为Waiter.greetTo()方法)
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    //筛选greetTo方法
    @Override
    public boolean matches(Method method, Class aClass) {
        return "greetTo".equals(method.getName());
    }

    //筛选Waiter类
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class aClass) {
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }
}
