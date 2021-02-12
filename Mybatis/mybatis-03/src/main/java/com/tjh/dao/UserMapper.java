package com.tjh.dao;

//import com.tjh.pojo.User;

import com.tjh.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //分页查询
    List<User> getUserByLimit(Map<String ,Integer> map);

    //分页查询2 面向对象操作
    List<User> getUserByRowBounds();

    //插入
    int addUser(User user);

    //更新
    int updateUser(User user);

    //删除
    int deleteUser(int id);


}
