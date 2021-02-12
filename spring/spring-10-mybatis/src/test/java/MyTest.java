import com.tjh.mapper.UserMapper;
import com.tjh.mapper.UserMapperImpl;
import com.tjh.pojo.User;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void selectUser() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream input = Resources.getResourceAsStream(resources);
//
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
//        SqlSession sqlSession = sessionFactory.openSession(true);

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void spring_mybatis(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
