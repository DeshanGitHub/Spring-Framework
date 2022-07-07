package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


//A source for Spring Bean Definitions
@Configuration
@ComponentScan(basePackages = "bean")
@Import({AppConfig1.class, AppConfig2.class})
//@ImportResource("classpath:abcd.xml")//We can use this annotation to import xml configurations to this project
//@ImportResource("file:absolute-path-of-abcd.xml")
public class AppConfig {

}
