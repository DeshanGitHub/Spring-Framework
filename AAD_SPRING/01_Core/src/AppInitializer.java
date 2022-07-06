import bean.MyConnection;
import bean.SpringBean;
import bean.SpringBeanThree;
import bean.SpringBeanTwo;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        /*Apita Spring wala siyaluma weda karala dena container eka creat*/
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        /*Shutdown Hook / Hooking Process*/
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM is about to Shut Down");
//
//                /*Close the ctx using hooking process*/
//                ctx.close();
//
//            }
//        }));

        /*short shut down hooking method from spring*/
        ctx.registerShutdownHook();

        /*Uda kramen shutdown karana eka diga wedi handa, apita spring la short method ekak*/

        /*App config class eken object ekak create kirima*/
        ctx.register(AppConfig.class);

        ctx.refresh();

        /*Get bean using bean id type*/
//        Object beanOneIdType = ctx.getBean("BeanOne");
//        System.out.println(beanOneIdType);

        /*create myConnection object*/
//        MyConnection bean = ctx.getBean(MyConnection.class);
//        System.out.println(bean);

        // we can change default id @Bean("connection")
//        MyConnection myConnection = (MyConnection) ctx.getBean("connection");
//        System.out.println(myConnection);

        SpringBean ref1 = ctx.getBean(SpringBean.class);
        SpringBean ref2 = ctx.getBean(SpringBean.class);
        SpringBean ref3 = ctx.getBean(SpringBean.class);
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);

        SpringBeanTwo b2ref1 = ctx.getBean(SpringBeanTwo.class);
        SpringBeanTwo b2ref2 = ctx.getBean(SpringBeanTwo.class);
        System.out.println(b2ref1);
        System.out.println(b2ref2);

        MyConnection con1 = ctx.getBean(MyConnection.class);
        MyConnection con2 = ctx.getBean(MyConnection.class);
        System.out.println(con1);
        System.out.println(con2);

    }
}
