package com.edu.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/v2")
public class TestApiNoInterfaceV2 {

    @GetMapping("/")
    public String sayHi() {
        return "Hello v1" + this.getClass().getSimpleName();
    }
}
