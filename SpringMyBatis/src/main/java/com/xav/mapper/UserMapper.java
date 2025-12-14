package com.xav.mapper;

import com.xav.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public abstract User selectOneUser(String username, String password);
}
