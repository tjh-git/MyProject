package com.tjh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.tjh.pojo.User"/>
@Component
public class User {
    //相当于 <property name="name" value="zhangsan"></property>
    @Value("zhangsan")
    public String name;


}
