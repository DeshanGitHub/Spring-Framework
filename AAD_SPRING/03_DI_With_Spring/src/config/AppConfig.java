package config;

import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    @Bean
    public SpringBeanOne getBeanOne(SpringBeanTwo two) {
        //Inter bean dependency (invoke bean method inside another bean method is called as inter-bean dependency)
        System.out.println(two);
        return new SpringBeanOne();
    }


    @Bean
    public SpringBeanTwo getBeanTwo() {
        return new SpringBeanTwo();
    }

}