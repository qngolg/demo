//package com.example.demo.util;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Objects;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//public class ListHelper {
//
//    public static <T,R> List<R> map(List<? extends T> lists, Function<? super T,? extends R> mapper){
//        if(Objects.nonNull(lists)){
//            return lists.stream().map(mapper).collect(Collectors.toList());
//        }
//        return null;
//    }
//
//    public static <T> List<T> filter(List<? extends T> lists, Predicate<? super T> predicate){
//        if(Objects.nonNull(lists)){
//            return lists.stream().filter(predicate).collect(Collectors.toList());
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> alist = Arrays.asList(1,2,3,4,5);
//        List<String> blist = new ArrayList<>();
//        alist.stream().map(a -> blist.add(String.valueOf(a))).collect(Collectors.toList());
//        blist.forEach(System.out::println);
//        int  a = 1;
//        System.out.println((a == 2 ? this: 0));
//    }
//}
