package com.xav.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpringJDBC2 {
    @Autowired
    JdbcTemplate jdbc;

    @Test
    public void testQueryCount() {
        String sql = "select count(1) from tb_account where user_id = ?";
        // 查找账户数

        int rowCount = jdbc.queryForObject(sql, Integer.class, 1);
        System.out.println("用户1的账户数：" + rowCount);

    }
}
