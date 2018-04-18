package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${helloworld.message}")
    private String message;

    @RequestMapping
    public String hello(){
        return message ;
    }
}
