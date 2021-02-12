package com.tjh.service;

import com.tjh.dao.UserDao;
import com.tjh.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    //改动地方
    private UserDao  userDao ;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
