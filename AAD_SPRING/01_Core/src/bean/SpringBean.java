package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("BeanOne")
/*Added bean scope*/
@Scope("prototype")
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean 1 Object Created..");
    }

}
