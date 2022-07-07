package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

//    //Full Mode
//    @Bean
//    public MyBasicDataSource basicDataSource() {
//
//        //inter-bean dependency invocation
//        MyConnection myConnection1 = myConnection();// satisfied dependencies
//        MyConnection myConnection2 = myConnection();// satisfied dependencies
//        MyConnection myConnection3 = myConnection();// satisfied dependencies
//
//        System.out.println(myConnection1);
//        System.out.println(myConnection2);
//        System.out.println(myConnection3);
//
//        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
//        myBasicDataSource.setMyConnection(myConnection1);
//
//        return myBasicDataSource;
//    }
//
//    @Bean
//    public MyConnection myConnection() {
//        return new MyConnection();
//    }

}