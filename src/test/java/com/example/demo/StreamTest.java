package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamTest {

    @Test
    public void testSteam(){
        List<String> strings = Arrays.asList("apple", "bug", "ABC", "Dog");
        strings = new ArrayList<String>(strings);
        OptionalInt optionalInt = strings.stream()
                .filter(it -> it.startsWith("a"))
                .mapToInt(String::length)
                .max();
        System.out.println(optionalInt.getAsInt());
    }

    private static <T, R> Predicate<T> convert(Function<T, R> converter) {
        return t -> converter.apply(t) == null;
    }
}
