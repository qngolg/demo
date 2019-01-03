package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements HelloServiceInterface{


    private static int a = 0;

    @Override
    public String sayHello(String name) {
        a++;
        return "Hello " + name;
    }
}
