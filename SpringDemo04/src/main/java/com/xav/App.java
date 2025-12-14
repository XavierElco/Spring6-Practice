package com.xav;

import com.xav.pojo.Clazz;
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
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz c1 =  ac.getBean("c1", Clazz.class);
        System.out.println(c1);
    }
}
