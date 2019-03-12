package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldReturnHelloWorld(){
        Greeting greeting = new Greeting("");
        Assert.assertEquals("hello world",greeting.say());
    }
}
