package com.sun.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloContoller {
    @RequestMapping("/say")
    public String sayhi(){

        return "hello word";
    }
}
