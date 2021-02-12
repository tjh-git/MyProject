package com.tjh.dao;

import com.tjh.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //模糊查找
    List<User> getUserLike(String value);

    //根据ID查询用户
    User getUserById(int id);

    //插入
    int addUser(User user);

    //更新
    int updateUser(User user);

    //删除
    int deleteUser(int id);

    //万能MAP
    int addUser2(Map<String,Object> map);

}
