import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yjj31 on 2015/12/5.
 */
public class AppTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
