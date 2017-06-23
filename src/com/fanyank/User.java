package com.fanyank;

import java.util.*;

/**
 * Created by yanfeng-mac on 2017/3/2.
 */
public class User {

    private String name;
    private int age;
//    private Properties poems;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int age) {
        this.age = age;
    }

//    public Properties getPoems() {
//        return poems;
//    }
//
//    public void setPoems(Properties poems) {
//        this.poems = poems;
//    }

    public void sayAge(){
        System.out.println("age->" + age);
    }

    public void sayName() {
        System.out.println("name->" + name);
    }

//    public void sayPoem() {
//        Enumeration enumeration = poems.keys();
//        while(enumeration.hasMoreElements()){
//            Object key = enumeration.nextElement();
//            System.out.println(key + "->" + poems.get(key));
//        }
//    }
}
