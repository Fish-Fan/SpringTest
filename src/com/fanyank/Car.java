package com.fanyank;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.core.ResolvableType;

/**
 * Created by yanfeng-mac on 2017/6/20.
 */
public class Car implements BeanFactory, BeanNameAware, InitializingBean, DisposableBean{
    private String brand;
    private String color;
    private String maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用构造函数");
    }

    public void setBrand() {
        System.out.println("调用setBrand()设置属性");
        this.brand = brand;
    }

    public void introduce() {
        System.out.println("brand->" + brand + "color->" + color + "maxSpeed->" + maxSpeed);
    }

    //BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    //BeanNameAware
    public void setBeanName(String beanName) {
        System.out.println("调用BeanNameAware.setBeanName()");
        this.beanName = beanName;
    }

    //InitializingBean
    public void afterPropertiesSet() {
        System.out.println();
    }

    //DisposableBean借口方法
    public void destroy() {
        System.out.println("调用DisposableBean.destroy()");
    }

    //通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("调用init-method所指定的myInit(),将maxSpeed设置为240");
        this.maxSpeed = maxSpeed;
    }

    //通过<bean>的destroy-method属性指定的销毁方法
    public void myDestroy() {
        System.out.println("调用destroy-method所指定的myDestroy()");
    }

    @Override
    public Object getBean(String s) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(String s, Class<T> aClass) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> aClass) throws BeansException {
        return null;
    }

    @Override
    public Object getBean(String s, Object... objects) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {
        return null;
    }

    @Override
    public boolean containsBean(String s) {
        return false;
    }

    @Override
    public boolean isSingleton(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isPrototype(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String s, ResolvableType resolvableType) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String s, Class<?> aClass) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public Class<?> getType(String s) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public String[] getAliases(String s) {
        return new String[0];
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "com.fanyank.Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }

}
