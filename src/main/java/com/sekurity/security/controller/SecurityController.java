package com.sekurity.security.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SecurityController {


    @GetMapping
    public String hello()
    {
        return "Hello_World:Code Generated";
    }
}



