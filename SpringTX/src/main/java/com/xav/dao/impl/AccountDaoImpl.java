package com.xav.dao.impl;

import com.xav.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    JdbcTemplate jt;

    @Override
    public int inAccount(Integer accountId, Double money) {
        String sql = "update tb_account set money = money + ? where user_id = ?";
        Object[] params = {money, accountId};

        int i = jt.update(sql, params);
        return i;
    }

    @Override
    public int outAccount(Integer accountId, Double money) {
        String sql = "update tb_account set money = money - ? where user_id =?";
        Object[] params = {money, accountId};

        int i = jt.update(sql, params);
        return i;
    }
}
