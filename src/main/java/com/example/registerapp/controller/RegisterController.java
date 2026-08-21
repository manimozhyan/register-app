package com.example.registerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}