package com.fanyank.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanfeng-mac on 2017/6/23.
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {

    //声明特殊客户
    //只对特殊客户织入切面
    private static List<String> specialClientList = new ArrayList<>();
    static {
        specialClientList.add("John");
        specialClientList.add("Tom");
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName() + "做静态检查");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    public boolean matches(Method method,Class clazz) {
        System.out.println("调用matches(method,clazz)" + clazz.getName() + "." + method.getName() + "做静态检查");
        return "greetTo".equals(method.getName());
    }
    @Override
    public boolean matches(Method method, Class clazz, Object... objects) {
        System.out.println("调用matches(method,clazz)" + clazz.getName() + "." + method.getName() + "做动态检查");
        String clientName = (String) objects[0];
        return specialClientList.contains(clientName);
    }
}
