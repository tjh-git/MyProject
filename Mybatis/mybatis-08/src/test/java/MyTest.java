import com.tjh.dao.UserMapper;
import com.tjh.pojo.User;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);


        User user  = mapper.queryUserById(1);

        sqlSession.close();


        User user2  = mapper2.queryUserById(1);

        System.out.println(user==user2);

        sqlSession2.close();
    }
}
