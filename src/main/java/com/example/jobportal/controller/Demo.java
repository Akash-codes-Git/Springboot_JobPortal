package com.example.jobportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/home")
    public String sayHello(){
        return "Hello world!";
    }

}
