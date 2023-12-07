package com.edu.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiNoInterface {

    @GetMapping("/")
    public String sayHi() {
        return "Hello v1" + this.getClass().getSimpleName();
    }

}
