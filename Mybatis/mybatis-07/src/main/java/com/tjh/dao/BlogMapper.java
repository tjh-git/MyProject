package com.tjh.dao;

import com.tjh.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper{
    //插入数据
    int addBlog(Blog blog);

    //查询
    List<Blog> queryBlogIF(Map map);

    //查询
    List<Blog> queryBlogChoose(Map map);

    //查询第1,2,3号ID blog
    List<Blog> queryForeach(Map map);

    //更新Blog
    int updateBlog(Map map);



}

