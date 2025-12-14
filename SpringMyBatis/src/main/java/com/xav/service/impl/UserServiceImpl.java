package com.xav.service.impl;

import com.xav.mapper.UserMapper;
import com.xav.pojo.User;
import com.xav.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/***
 *
 * @author lichengming
 * @Component注解的作用：简化了配置文件的编写，将该类交给Spring容器管理
 * 帮我吗构建对象默认的名字就是类名的首字母小写
 * 我们也可以自定义对象的名字：通过传入参数的形式
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 加入了@Autowired注解，Spring会自动的去容器中找UserMapper类型的对象
     * 并将其赋值给userMapper属性，底层会自动帮我们定义set方法
     * 注入形式：先按照类型从Spring容器中找，找到多个再按照属性名找`
     * 底层是通过反射实现的
     * 注意：@Autowired注解只能用于属性上，不能用于方法上
     * 注意：@Autowired注解只能用于set方法上，不能用于构造方法上
     * 注意：@Autowired注解只能用于有参构造方法上，不能用于无参构造方法上
     */
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    @Override
    public User selectOneUser(String username, String password) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = ac.getBean("userMapper", UserMapper.class);
        return userMapper.selectOneUser(username, password);
    }

//    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println(name);
//        }
//    }
}
