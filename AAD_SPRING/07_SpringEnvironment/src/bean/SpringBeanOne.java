package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanOne implements InitializingBean {

    /*Get OS name from java properties*/
    @Value("${os.name}")
    private String osName;

    /*Get User name from java properties*/
    @Value("${user.name}")
    private String userName;

    /*Get processor level from system environment variable*/
    @Value("${PROCESSOR_LEVEL}")
    private String logName;

    /*Get properties from Resource Bundles*/
    @Value("${ijse.application.name}")
    private String applicationName;

    /*Get properties from second Resource Bundle*/
    @Value("${myName}")
    private String myName;

    public SpringBeanOne() {
        System.out.println("Spring Bean One Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);

        /*print user name*/
        System.out.println(userName);

        /*print log name*/
        System.out.println(logName);

        /*print application name*/
        System.out.println(applicationName);

        /*print myName*/
        System.out.println(myName);

    }
}