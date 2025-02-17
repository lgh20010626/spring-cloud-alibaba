package com.light.food.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "account-api")
public interface AccountControllerAPI {

    @GetMapping("/account/get")
    String get();

}
