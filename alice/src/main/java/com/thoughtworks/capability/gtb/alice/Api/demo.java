package com.thoughtworks.capability.gtb.alice.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class demo {
    @GetMapping("/hello")
    public String hello(){
        String url = "http://localhost:8081/hello";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
