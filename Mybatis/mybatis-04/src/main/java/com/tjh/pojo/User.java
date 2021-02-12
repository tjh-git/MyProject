package com.tjh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Alias("user")   注解别名
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username ;
    private String password;




}
