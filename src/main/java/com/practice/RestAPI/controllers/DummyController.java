package com.practice.RestAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/hello")
    public String getThere(){
        return "Hello there";
    }
}
