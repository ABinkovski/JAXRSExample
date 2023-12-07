package com.edu.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v2")
public class TestApiNoInterfaceV2 {

    @GetMapping("/")
    public String sayHi() {
        return "Hello v2" + this.getClass().getSimpleName();
    }
}
