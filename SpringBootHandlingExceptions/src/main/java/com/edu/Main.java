package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableWebMvc
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

/**
 * test url: http://localhost:8080/api/ex1  | 400 BAD_REQUEST
 * test url: http://localhost:8080/api/ex2  | 507 INSUFFICIENT_STORAGE
 * test url: http://localhost:8080/api/ex3  | 509 BANDWIDTH_LIMIT_EXCEEDED
 */