package bean;

import org.springframework.stereotype.Component;

@Component("BeanOne")
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean 1 Object Created..");
    }

}
