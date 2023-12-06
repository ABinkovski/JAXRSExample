package com.edu.hello2;

import com.edu.HelloService;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;

@Path("/sayHello2")
@Service
public class HelloServiceImpl2 implements HelloService {

    public String sayHello(String a) {
        return "Hello2 " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }

}
