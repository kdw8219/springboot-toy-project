package com.davidk.toyproject.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //built-in WAS run
        //Don't worry about the performance of built-in WAS.
    }
}
