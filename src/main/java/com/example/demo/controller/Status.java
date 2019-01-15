package com.example.demo.controller;

public enum Status {

    OK(1),
    ERROR(2);

    private int value;
    Status(int value){
        this.value = value;
    }
}
