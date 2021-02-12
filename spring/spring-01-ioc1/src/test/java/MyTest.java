import com.tjh.dao.UserDaoMysqlImpl;
import com.tjh.dao.UserDaoOracleImpl;
import com.tjh.service.UserService;
import com.tjh.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
//    //这就是IOC原型
//    public static void main(String[] args) {
//
//
//        UserService userService = new UserServiceImpl();
//
//        ( (UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();
//
//    }

    public static void main(String[] args) {
        //获取ApplicationContent : 拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么，获取什么
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("userServiceImpl");
        userServiceImpl.getUser();

    }
}
