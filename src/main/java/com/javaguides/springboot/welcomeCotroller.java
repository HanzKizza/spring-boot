package com.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeCotroller {

    @GetMapping("/welcome")
    public String welcome(){
        return "You have hit my endpoint. Auch";
    }
}
