package config;

import bean.MyBasicDataSource;
import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    @Bean
    public MyBasicDataSource basicDataSource() {

//        MyConnection myConnection = new MyConnection();

        //inter-bean dependency innovocation
        MyConnection myConnection1 = myConnection();
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();

        System.out.println(myConnection1);
        System.out.println(myConnection2);
        System.out.println(myConnection3);

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection1);

        return myBasicDataSource;
    }

    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }
}
