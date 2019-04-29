package com.example.demo.querydslpathfield;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PathField {

    String value() default "";

    Class bean() default Object.class;

    boolean ignore() default false;

    String ifNull() default "";
}
