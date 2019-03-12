package com.example.demo.example;

import org.junit.Assert;
import org.junit.Test;

public class Example {

    @Test
    public void test1(){
        Assert.assertEquals("5 是质数",isPrise(8),false);
    }

    private boolean isPrise(int num) {
        for(int i = 2;i<num;i++){
            if(num % i == 0 ){
                return true;
            }
        }
        return false;
    }

}
