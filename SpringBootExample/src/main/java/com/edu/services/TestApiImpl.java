package com.edu.services;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestApiImpl implements TestApi {

    @Override
    public String sayHello() {
        return "Hello from Interface annotation " + this.getClass().getSimpleName();
    }
}
