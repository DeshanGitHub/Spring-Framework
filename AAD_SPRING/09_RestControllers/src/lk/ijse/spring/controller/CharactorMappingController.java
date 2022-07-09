package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("charactor")
public class CharactorMappingController {

    // item/I333
    // item/Ivff
    // item/I001

    @GetMapping(path = "item/I???") // Charactor Mapping
    public String test1() {
        return "test1 Get Mapping Invoked (test)";
    }

    @GetMapping(path = "???/search") // Charactor Mapping
    public String test12() {
        return "test2 Get Mapping Invoked (test)";
    }
}

