package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ExactMappingController {

    //Exact Mapping = .../item/it/test1
    //Exact Mapping = .../item/test2/tt2
    //Path Segment -> /it/

    @GetMapping(path = "it/test1") //handler mapping
    public String test1() { // handler methods
        return "test1 Get Mapping Invoked";
    }

    @GetMapping(path = "test2/tt2") //handler mapping
    public String test2() { // handler methods
        return "test2 Get Mapping Invoked";
    }
}
