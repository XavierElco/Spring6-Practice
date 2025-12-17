package com.xav.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


public class TestSpringJDBC3 extends BaseTest{
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
