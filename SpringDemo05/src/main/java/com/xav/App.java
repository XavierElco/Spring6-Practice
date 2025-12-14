package com.xav;

import com.xav.pojo.Clazz;
import com.xav.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ac.close(); //手动销毁容器
    }

}
