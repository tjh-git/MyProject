import com.tjh.pojo.Books;
import com.tjh.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");

        List<Books> books = bookServiceImpl.queryAllBook();

        for (Books book : books) {
            System.out.println(book);
        }

    }
}
