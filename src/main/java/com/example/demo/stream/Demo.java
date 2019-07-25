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

    public static void main(String[] args) {
        IntStream range = IntStream.range(1, 1000);
        range.forEach(i -> {
            /**
             * 流已经被打开了 不能再使用了
             * Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
             */
            int i1 = range.skip(i + 1).findFirst().orElse(0);
            System.out.println("当前元素：" + i + "  下一个元素：" + i1);

        });
    }
}
