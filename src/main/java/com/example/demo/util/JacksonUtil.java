package com.example.demo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String beanToJson(Object obj){
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T jsonToBean(String jsonStr, Class<T> tClass) {
        try {
            return mapper.readValue(jsonStr,tClass);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
