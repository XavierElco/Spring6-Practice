package com.xav.service.Impl;

import com.xav.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public void a() {
            System.out.println("业务层：a方法执行了...");
            int i = 1/0;


    }
}
