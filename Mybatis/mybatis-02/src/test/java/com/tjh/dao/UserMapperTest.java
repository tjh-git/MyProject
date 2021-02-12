package com.tjh.dao;

import com.tjh.dao.UserMapper;
import com.tjh.pojo.User;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 方式一：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        //方式二：不推荐
        //List<User> userList = sqlSession.selectList("com.tjh.dao.UserDao.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
