package com.example.demo;

public class Greeting {
    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String say() {
        return this.message;
    }
}
