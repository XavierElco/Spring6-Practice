package com.xav;

import com.xav.SpringDiy.MyClassPathApplicationContext;
import com.xav.SpringDiy.MyFactory;
import com.xav.pojo.Person;
import com.xav.pojo.User;
import org.dom4j.DocumentException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            MyFactory myFactory = new MyClassPathApplicationContext("applicationContext.xml");

            User user = (User)myFactory.getBean("user");
            Person person = (Person)myFactory.getBean("person");
            user.setUname("xav");
            user.setPwd("123456");
            person.setAge(20);
            person.setHeight(170);
            System.out.println(user.getUname() + " " + user.getPwd());
            System.out.println(person.getAge() + " " + person.getHeight() + " " + person.getName());
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
