package com.xav.dao;

import com.xav.pojo.Account;

import java.util.List;

public interface AccountDao {
    int addAcount(Account account);
    int addAccountReturnKey(Account account);
    int addAccountBatch(List<Account> accounts);
    int queryAccountCount(Integer userId);
    Account qureyAccountById(Integer accountId);
}
