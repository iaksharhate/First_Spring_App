package com.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    //curl localhost:8080/hello
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello(){
        return "Hello from BridgeLabz!!!";
    }
}