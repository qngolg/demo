package com.example.demo.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class GsonUtil {
    private static Gson gson = new GsonBuilder().create();

    public static String beanToJson(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T jsonToBean(String jsonStr, Class<T> tClass) {
        return gson.fromJson(jsonStr, tClass);
    }

    public static String jsonFormatter(String uglyJsonStr) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jsonParser = new JsonParser();
        JsonElement parse = jsonParser.parse(uglyJsonStr);
        return gson.toJson(parse);
    }
}
