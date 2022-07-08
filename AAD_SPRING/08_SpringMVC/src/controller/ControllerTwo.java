package controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("customer") // Handler method
public class ControllerTwo {

    //Mapping methods // Handler Methods
    @GetMapping
    public String testTwo() {
        return "customer";
    }

}
