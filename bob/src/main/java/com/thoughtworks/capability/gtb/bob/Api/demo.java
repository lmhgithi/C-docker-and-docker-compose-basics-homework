package com.thoughtworks.capability.gtb.bob.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class demo {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Bob!";
    }
}
