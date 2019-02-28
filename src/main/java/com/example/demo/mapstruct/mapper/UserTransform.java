package com.example.demo.mapstruct.mapper;


public class UserTransform {
    private String booleanToString(boolean value){
        return value ? "Y" : "N";
    }
    public boolean strToBoolean(String str){
        return "Y".equals(str) ? true : false;
    }
}
