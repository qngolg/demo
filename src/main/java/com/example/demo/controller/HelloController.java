package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

    @PostMapping(value = "/sayHello")
    public String sayHello(Status status){
        return String.valueOf(Status.OK);
    }


    private static Function<Integer,Integer> add = a -> {
        System.out.println("++++++++++++");
        return a+2;
    };

    private static Function<Integer,Integer> minus = a -> {
        System.out.println("------------");
        return a-2;
    };

    private static Function<Integer,Integer> multi = a -> {
        System.out.println("************");
        return a*2;
    };

    public static void main(String[] args) {
        Stream.of(add,minus,multi)
                    .map(fun -> fun.apply(10))
                    .filter(Predicate.isEqual(12))
                    .findFirst()
                    .orElse(null);

//        List<Function> list = Arrays.asList(add,minus,multi);
//        list.stream().map(fun -> fun.apply(10))
//                .filter(Predicate.isEqual(20))
//                .findFirst().orElse(null);

    }

}
