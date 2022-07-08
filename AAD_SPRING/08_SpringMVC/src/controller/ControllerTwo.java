package controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two") // Handler method
public class ControllerTwo implements InitializingBean {

    public ControllerTwo() {
        System.out.println("Controller Two Instantiated");
    }

    //Mapping methods // Handler Methods
    @GetMapping
    public String testTwo() {
        return "Hello Spring";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Controller Two is ready to use");
    }
}
