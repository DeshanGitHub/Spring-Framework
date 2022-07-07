package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//A source for Spring Bean Definitions
@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

}
