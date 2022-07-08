package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two") // Handler method
public class ControllerTwo {

    //Mapping methods // Handler Methods
    @GetMapping
    public String testTwo() {
        return "Hello Spring";
    }
}
