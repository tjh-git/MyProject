package com.tjh.dao;

import com.tjh.pojo.Student;
import com.tjh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface TeacherMapper {
//
//    //获取老师
//    List<Teacher> getTeacher();

    //获取老师下的学生及 老师的信息
    Teacher getTeacher(@Param("tid") int id);

    //获取老师下的学生及 老师的信息
    Teacher getTeacher2(@Param("tid") int id);
}
