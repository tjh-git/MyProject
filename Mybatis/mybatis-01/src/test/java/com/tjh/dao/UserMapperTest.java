package com.tjh.dao;

import com.tjh.pojo.User;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //模糊查询
    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserLike("%李%");
        for (User user : list) {
            System.out.println(user);
        }


        sqlSession.close();
    }


    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    //增删改需要插入事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res =  mapper.addUser(new User(12,"4name","4pwd"));
        if(res> 0 ){
            System.out.println("插入成功");
        }

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userid",10);
        map.put("username","7name");
        map.put("userpwd","7pwd");

        int res =  mapper.addUser2(map);
        if(res> 0 ){
            System.out.println("插入成功");
        }

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(4,"44name","44pwd"));
        if(res>0){
            System.out.println("更新成功！");
        }
        sqlSession.commit();

        sqlSession.close();
    }
    //删除
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       int res = mapper.deleteUser(5);
        if(res>0){
            System.out.println("删除成功！");
        }
        sqlSession.commit();

        sqlSession.close();
    }
}
