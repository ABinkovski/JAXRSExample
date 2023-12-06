package com.edu.services;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/v2")
public interface TestApi {

    @GetMapping("/say")
    String sayHello();
}
