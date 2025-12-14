package com.xav.service;

import com.xav.pojo.User;

public interface UserService {
    public abstract User selectOneUser(String username, String password);
}
