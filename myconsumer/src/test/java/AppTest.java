import com.mydomain.myproject.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yjj31 on 2015/12/5.
 */
public class AppTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();

        DemoService demoService= (DemoService) context.getBean("demoService");
        String hello=demoService.sayHello("world");
        System.out.println(hello);
    }
}
