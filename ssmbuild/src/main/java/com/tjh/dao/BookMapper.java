package com.tjh.dao;


import com.tjh.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书 @Param("bookId")相当于改名 在XML中 bookID = #{bookId}
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部书
    List<Books> queryAllBook();

    //按书名查询书籍
    List<Books> queryBookByName(@Param("bookName") String bookName);

}
