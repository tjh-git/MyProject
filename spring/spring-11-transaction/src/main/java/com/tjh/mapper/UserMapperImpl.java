package com.tjh.mapper;

import com.tjh.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //我们的所有操作，都是用sqlSession来执行，在原来，现在都是用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {

//        //事务测试，中途出错，原子性和一致性
//        User user = new User(11, "11", "11");
//        addUser(user);
//        //出错时，前面执行是否撤销
//        deleteUser(11);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();

    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
