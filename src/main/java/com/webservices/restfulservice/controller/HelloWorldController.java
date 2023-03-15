package com.webservices.restfulservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World..!!";
    }

    //Take parameter to include in response
    @GetMapping("/hello/{name}")
    public String sayHelloTo(@PathVariable String name){
        return "Hello Dear.... " + name;
    }
}
