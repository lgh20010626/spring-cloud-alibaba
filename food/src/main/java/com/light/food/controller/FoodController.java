package com.light.food.controller;

import com.light.food.api.AccountControllerAPI;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Resource
    private AccountControllerAPI accountControllerAPI;

    @GetMapping("/get")
    public String get() {
        accountControllerAPI.get();
        return "get food success";
    }
}
