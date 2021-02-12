package com.tjh.dao;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.tjh.pojo.User;
import com.tjh.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
   static  Logger logger = Logger.getLogger(UserMapperTest.class);


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
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 方式一：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("进入了log4J!");
        logger.debug("进入了Debug！");
        logger.error("进入了error！");

    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> list = mapper.getUserByLimit(map);

        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }


    @Test
    public void getUserByBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        RowBounds rowBounds = new RowBounds(1,2);


        // 通过java实现分页
        List<User> list = sqlSession.selectList("com.tjh.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
