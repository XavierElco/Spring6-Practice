package com.xav;

import com.xav.SpringDiy.MyClassPathApplicationContext;
import com.xav.SpringDiy.MyFactory;
import com.xav.pojo.Person;
import org.dom4j.DocumentException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws DocumentException {

        // 解析xml
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 取出对象
//        Person p1 = ac.getBean("p", Person.class);
//        Person p2 = (Person)ac.getBean("p");
//        System.out.println(p1 == p2);
//        System.out.println(p1);
//        System.out.println(p2);

        try {
            MyFactory myFactory = new MyClassPathApplicationContext("applicationContext.xml");
            System.out.println(myFactory);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }


    }
}
