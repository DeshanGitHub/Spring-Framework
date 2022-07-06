import bean.SpringBean;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        /*Apita Spring wala siyaluma weda karala dena container eka creat*/
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        /*App config class eken object ekak create kirima*/
        ctx.register(AppConfig.class);

        ctx.refresh();
//
//        /*spring bean class eke tiyena ewa object ekak hadala methanata ganna puluwanda kiyala balana eka*/
//        SpringBean bean = ctx.getBean(SpringBean.class);
//
//        /*Api hadapu bean eken method ekak cl karala belima*/
//        bean.testBean();
//
//        System.out.println(bean);

        ctx.close();

    }
}
