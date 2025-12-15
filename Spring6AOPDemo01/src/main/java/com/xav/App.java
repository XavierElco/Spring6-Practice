package com.xav;

import com.xav.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

//        // ======== 添加这段调试代码 ========
//        System.out.println("-------------------------------------");
//        System.out.println("容器里所有的 Bean 名字如下：");
//        String[] beanNames = ac.getBeanDefinitionNames();
//        for (String name : beanNames) {
//            System.out.println(name);
//        }
//        System.out.println("-------------------------------------");
        UserService us = (UserService)ac.getBean("userServiceImpl");

        us.a();
        us.b(100);
    }
}
