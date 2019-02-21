package com.example.demo;

import com.example.demo.service.HelloConfigurable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurableTest {

    @Test
    public void testConfigurable() {
        new HelloConfigurable().test();
    }
}
