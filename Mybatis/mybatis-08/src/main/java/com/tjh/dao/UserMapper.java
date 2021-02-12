package com.tjh.dao;

import com.tjh.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //根据ID查询用户
    User queryUserById(@Param("id") int id);

}
