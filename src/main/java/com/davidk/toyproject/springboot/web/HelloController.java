package com.davidk.toyproject.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//about Controller
@RestController
public class HelloController {
    @GetMapping("/hello") // process www.uri.com/hello using 'GET' method
    public String hello() {
        return "HELLO!";
    }
}
