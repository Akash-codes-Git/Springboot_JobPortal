package com.example.jobportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Demo {

    @GetMapping("/home")
    public String sayHello(){
        return "Hello world!";
    }

    @GetMapping("/api/home/user/{userId}/post/{postId}")
    public String acceptPathVariable(@PathVariable Long userId, @PathVariable Long postId){
        return "Fetched the user id : " + userId + " and Post id : " + postId;
    }

    @GetMapping("/api/home/user/{userId}/address/{addressId}")
    public String acceptMultiplePathVariableMyMap(@PathVariable Map<String,Long> pathVariable){
        return "Fetched the user id : " + pathVariable.get("userId") + " and Post id : " + pathVariable.get("addressId");
    }

}
