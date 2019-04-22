package com.example.demo.util;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;

import java.util.Objects;
import java.util.function.Function;

public class PredicateBuilder {

    private BooleanBuilder builder;

    private PredicateBuilder(){
        this.builder = new BooleanBuilder();
    }

    public static PredicateBuilder builder(){
        return new PredicateBuilder();
    }

    public <T> PredicateBuilder notNullAnd(Function<T, BooleanExpression> expression, T value){
        if(Objects.nonNull(value)){
            builder.and(expression.apply(value));
        }
        return this;
    }

    public <T> PredicateBuilder orEles(Function<T,BooleanExpression> expression,T value, BooleanExpression nullExpression){
        if(Objects.isNull(value)){
            builder.and(nullExpression);
        }else{
            builder.and(expression.apply(value));
        }
        return this;
    }

}
