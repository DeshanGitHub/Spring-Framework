package bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {

    // Environment Variables
    // 01. System Environment Variables
    // 02. Java Environment Variables
    // 03. Our software Environment Variables

    public SpringBeanThree() {
        System.out.println("Spring Bean Three Instantiated");
    }
}
