import com.tjh.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //现在对象都在Spring里
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);

    }

}
