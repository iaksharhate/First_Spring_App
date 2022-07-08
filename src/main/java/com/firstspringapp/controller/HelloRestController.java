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

    //curl localhost:8080/hello/query?name=Akshar -w "\n"
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+ name + "!";
    }
}