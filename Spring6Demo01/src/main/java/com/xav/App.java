package com.xav;

import com.xav.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // 解析xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 取出对象
        Person p1 = ac.getBean("p", Person.class);
        Person p2 = (Person)ac.getBean("p");
        System.out.println(p1 == p2);
        System.out.println(p1);
        System.out.println(p2);


    }
}
