package com.example.demo.object.mapper.error;

import com.fasterxml.jackson.core.JsonProcessingException;

public class ObjectMapperError {

    public static void main(String[] args) throws JsonProcessingException {
        Index index = new Index();
        index.setFileId(1);
        index.setFileName("1.index");

        String s = index.toJson();
        System.out.println(s);

    }
}
