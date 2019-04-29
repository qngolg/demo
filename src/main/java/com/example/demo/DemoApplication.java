package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableSpringConfigured
@SpringBootApplication
public class DemoApplication {

	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/rest/demo")
	public String getBody(){
		ResponseEntity<Object> exchange = restTemplate.exchange("http://localhost:8080/test/aaa/aaa", HttpMethod.POST, HttpEntity.EMPTY, Object.class);
		return "aaa";
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}

