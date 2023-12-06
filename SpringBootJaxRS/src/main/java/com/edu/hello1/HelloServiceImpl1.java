package com.edu.hello1;

import com.edu.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl1 implements HelloService {

    public String sayHello(String a) {
        return "Hello " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }

}
