package com.light.food.controller;

import jakarta.annotation.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String getById() {
        String url = "http://account-api/account/hello";
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        return response.getBody();
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello account";
    }

}
