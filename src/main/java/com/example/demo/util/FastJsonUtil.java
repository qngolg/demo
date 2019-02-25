package com.example.demo.util;

import com.alibaba.fastjson.JSON;

public class FastJsonUtil {
    public static String beanToJson(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T jsonToBean(String jsonStr, Class<T> tClass){
        return JSON.parseObject(jsonStr,tClass);
    }
}
