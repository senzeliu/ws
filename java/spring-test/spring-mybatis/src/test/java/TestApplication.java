import org.example.spring.mybatis.annotation.service.ServiceA;
import org.example.spring.mybatis.annotation.service.ServiceB;
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





    /**
     * 一个事务方法调另一个非事务方法（不带@Transactional）会把这个方法也就加入到事务中
     * RuntimeException会回滚
     * 受检Exception默认不会回滚
     *
     * @Author liusenze
     * @Date 2021/7/16 11:33 上午
     * @Description
     * @param
     * @return void
     */
    @Test
    public void test7() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-transaction-annotation-test.xml");
        ServiceA serviceA= (ServiceA) context.getBean("serviceA");
        serviceA.insertUser();
    }


}
