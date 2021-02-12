package com.tjh.dao;

import com.tjh.pojo.Teacher;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class TeacherTest {
//    @Ignore
//    public void getTeacher(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        List<Teacher> teacherList = mapper.getTeacher();
//        for (Teacher teacher: teacherList) {
//            System.out.println(teacher);
//        }
//        sqlSession.close();
//    }

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
