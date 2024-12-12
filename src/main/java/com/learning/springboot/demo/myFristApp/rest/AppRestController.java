package com.learning.springboot.demo.myFristApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
    // expose "/" that return Hello
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
