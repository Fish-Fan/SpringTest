package com.fanyank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import java.io.IOException;

/**
 * Created by yanfeng-mac on 2017/3/2.
 */
public class Main {

    public void getBean() throws Throwable {
        //使用ApplicationContext获取Bean
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("springTest.xml");
//        com.fanyank.Car car = (com.fanyank.Car) ctx.getBean("car1",com.fanyank.Car.class);
//        System.out.println(car);


        //通过一个带@Configuration的POJO装载Bean配置
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(com.fanyank.Beans.class);
//            //注意此处的getBean里面的name需要与配置信息内部的name保持一致
//        com.fanyank.Car car = ctx.getBean("car",com.fanyank.Car.class);
//        System.out.println(car);

        //通过groovy配置方式简化Bean的配置
//        ApplicationContext ctx = new GenericGroovyApplicationContext("classpath:com/fanyank/groovy-beans.groovy");
//        Car car = (Car) ctx.getBean("car");
//        System.out.println(car);

        //使用BeanFactory获得Bean
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        Resource res = resolver.getResource("classpath:/springTest.xml");
//        System.out.println(res.getURL());
//
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(res);
//
//        System.out.println("init factory");
//
//        com.fanyank.Car car = factory.getBean("car1",com.fanyank.Car.class);
//        System.out.println("com.fanyank.Car can be use!");
//        System.out.println(car);
    }

    public static void main(String[] args) throws IOException {


    }
}
