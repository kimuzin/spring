package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String helloWorld() {
        return "hello, World 1111";
    }
}