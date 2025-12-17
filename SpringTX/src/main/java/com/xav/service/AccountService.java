package com.xav.service;

import com.xav.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountDao ad;

    // 定义业务方法: 转账操作
    public int updateAccount(Integer outId, Integer inId, Double money) {
        int code = 0; // 成功1，失败0
        // 1. 出钱
        int outRow = ad.outAccount(outId, money);
        int inRow = ad.inAccount(inId, money);
        if (outRow == 2 && inRow == 1) {
            code = 1;
        }


        return code;
    }


}
