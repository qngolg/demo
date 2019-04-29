package com.example.demo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) throws IOException {
        String result = null;
        Map aa = new HashMap();
        String map2 = "{\"result\":null,\"info\":11}";
        aa.put("bo",null);
        aa.put("info","aaa");
        System.out.println(mapper.readValue(map2,Map.class));
        System.out.println(new Gson().fromJson(map2,Map.class));
        System.out.println(new Gson().toJson(aa));
        try {
            Map map = mapper.readValue(result, Map.class);
            System.out.println(1111);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
