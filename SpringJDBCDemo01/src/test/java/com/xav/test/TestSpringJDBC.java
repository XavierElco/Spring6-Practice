package com.xav.test;

import com.xav.App;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestSpringJDBC {
    @Test
    public void testQueryCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbc = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select count(*) from tb_account";
        // 查找账户数

        int rowCount = jdbc.queryForObject(sql, Integer.class);
        System.out.println("账户数：" + rowCount);

    }
}
