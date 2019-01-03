package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping( value = "/sayHello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }

}
