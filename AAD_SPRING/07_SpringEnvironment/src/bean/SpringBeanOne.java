package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {

    /*Get OS name from java properties*/
    @Value("${os.name}")
    private String osName;

    /*Get User name from java properties*/
    @Value("${user.name}")
    private String userName;

    public SpringBeanOne() {
        System.out.println("Spring Bean One Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);

        /*print user name*/
        System.out.println(userName);

    }
}