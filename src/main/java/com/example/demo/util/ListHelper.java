package com.example.demo.util;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListHelper {

    public static <T,R> List<R> map(List<? extends T> lists, Function<? super T,? extends R> mapper){
        if(Objects.nonNull(lists)){
            return lists.stream().map(mapper).collect(Collectors.toList());
        }
        return null;
    }

    public static <T> List<T> filter(List<? extends T> lists, Predicate<? super T> predicate){
        if(Objects.nonNull(lists)){
            return lists.stream().filter(predicate).collect(Collectors.toList());
        }
        return null;
    }
}
