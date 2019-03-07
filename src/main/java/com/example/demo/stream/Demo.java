package com.example.demo.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

    public void test(int num){
        IntStream.range(0,num).mapToObj(i -> add(i)).collect(Collectors.toList());
    }

    private static List<Integer> list = Lists.newArrayList();

    public String add(int i){
        return i + "100" ;
    }
}
