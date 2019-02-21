package com.example.demo.service;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class HelloConfigurable {

    @Autowired
    private HelloService helloService;

    public void test() {
        helloService.sayHello("hello");
    }
}
