package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    @GetMapping //handler mapping
    public String saveItem() { // handler methods
        return "Item saved and Get Mapping Invoked";
    }
}
