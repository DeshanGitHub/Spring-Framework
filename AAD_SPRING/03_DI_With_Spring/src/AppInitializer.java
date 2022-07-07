import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import config.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

        SpringBeanOne beanOne = context.getBean(SpringBeanOne.class);
        SpringBeanTwo beanTwo = context.getBean(SpringBeanTwo.class);

        System.out.println(beanOne);
        System.out.println(beanTwo);
    }
}
