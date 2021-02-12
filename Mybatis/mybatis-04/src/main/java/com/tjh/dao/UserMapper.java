package com.tjh.dao;

//import com.tjh.pojo.User;

import com.tjh.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //注解底层是反射
    @Select("select * from user")
    List<User> getUsers();

    //@Param("id") 多个对象时使用 （把右边的转成左边提交）
    @Select("select * from user where id=#{id} and name=#{name}")
    User getUserByIdAndName(@Param("id") int id,@Param("name") String name);


}
