package com.example.demo.querydslpathfield;

import com.querydsl.core.types.Expression;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class QuerydslPathUtils {

    public static <T> Expression<T> buildProjections(Class<T> tClass){
        Expression[] expressions = null;

        Field[] fields = tClass.getFields();
        List<Expression> expressions1 = new ArrayList<>();
//        Stream.of(fields)
//                .filter(field -> !field.isSynthetic())
//                .map(field -> field.getAnnotation(PathField.class))
//                .filter(annotation -> annotation != null && !annotation.ignore())
//                .map(annotation -> {
//
//                })


        return null;
    }

}
