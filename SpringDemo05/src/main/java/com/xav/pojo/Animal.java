package com.xav.pojo;

import org.springframework.beans.factory.InitializingBean;

public class Animal implements InitializingBean {
    public Animal() {
        System.out.println("被打印了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化方法接口");
    }

//    public void init() {
//        System.out.println("初始化方法");
//
//    }

}
