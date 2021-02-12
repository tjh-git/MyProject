package com.tjh.dao;

import com.tjh.pojo.Student;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        sqlSession.close();
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        sqlSession.close();
    }
}
