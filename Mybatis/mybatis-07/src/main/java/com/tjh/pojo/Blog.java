package com.tjh.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致 配置文件setting里开启驼峰命名转换create_time createTime
    private int views;

}
