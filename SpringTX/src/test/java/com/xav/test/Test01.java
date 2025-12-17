package com.xav.test;

import com.xav.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 2. 指定 Spring 配置文件的位置 (请确保文件名和你 resources 下的 XML 文件名一致)
// 假设你的 XML 文件名叫 applicationContext.xml 或者 beans.xml，请按实际修改
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test01 {
    @Autowired
    AccountService as;

    @Test
    public void test() {
        int code = as.updateAccount(1, 2, 9.0);
        System.out.println(code);
    }
}
