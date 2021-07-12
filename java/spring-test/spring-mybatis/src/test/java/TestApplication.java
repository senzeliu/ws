import org.example.spring.mybatis.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liusenze
 * @Description:
 * @since 2021/7/9 11:32 上午
 */
public class TestApplication {


    String ss;

    @Test
    public void test1() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-transaction.xml");
        UserService userservice= (UserService) context.getBean("userService");
        userservice.test();
    }

}
