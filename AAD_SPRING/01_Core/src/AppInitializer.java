import bean.SpringBean;
import bean.SpringBeanThree;
import bean.SpringBeanTwo;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        /*Hooking Process*/
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to Shut Down");
            }
        }));


        /*Apita Spring wala siyaluma weda karala dena container eka creat*/
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        /*App config class eken object ekak create kirima*/
        ctx.register(AppConfig.class);

        ctx.refresh();

        SpringBean beanOne = ctx.getBean(SpringBean.class);
        SpringBeanTwo beanTwo = ctx.getBean(SpringBeanTwo.class);
        System.out.println(beanOne);
        System.out.println(beanTwo);

        SpringBeanThree beanThree = ctx.getBean(SpringBeanThree.class);
        System.out.println(beanThree);

        ctx.close();

    }
}
