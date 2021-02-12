import com.tjh.pojo.User;
import com.tjh.pojo.UserT;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Ignore
    public void test(){
//        User user = new User();
//        System.out.println(user.toString());

    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("user");
        User user2 = (User)context.getBean("user");
        user.show();

        System.out.println(user==user2);

    }

    @Test
    public void aliasTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)context.getBean("user");
        user.show();

        UserT userT = (UserT)context.getBean("U2");
        userT.show();
    }
}
