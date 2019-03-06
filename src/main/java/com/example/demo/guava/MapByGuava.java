package com.example.demo.guava;

import com.google.common.collect.ImmutableMap;

public class MapByGuava {

    ImmutableMap<String,Integer> myMap = ImmutableMap.<String, Integer>builder()
            .put("a",1)
            .put("b",2)
            .put("c",3)
            .build();

}
