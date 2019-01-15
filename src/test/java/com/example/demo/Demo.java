package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

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

        List<Function> list = Arrays.asList(add,minus,multi);
        list.stream().map(fun -> fun.apply(10))
                .filter(Predicate.isEqual(12))
                .findFirst().orElse(null);

    }
}
