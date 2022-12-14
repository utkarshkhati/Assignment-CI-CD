package com.example.cidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.example.cidemo.HelloWorldApplication.class, args);
    }

    @GetMapping(value = "/")
    public String getWelcomeMessage(){
        return "Hello World!";
    }

}
