package com.edu.services;

import com.edu.domain.exceptions.CustomException;
import com.edu.domain.exceptions.CustomExceptionV2;
import com.edu.domain.exceptions.CustomExceptionV3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("anyCustomServiceBeanName")
@RequestMapping("/api")
public class RootApiService {

    @GetMapping("/ex1")
    public String itShouldFail() {
        // Exception is not handled on any not null cause
//        throw new CustomException("this is test exception", getException(100)); // stackTrace 152
//        throw new CustomException("this is test exception", getException(90)); // stackTrace 142
//        throw new CustomException("this is test exception", getException(80)); // stackTrace 132
//        throw new CustomException("this is test exception", getException(70)); // stackTrace 122
//        throw new CustomException("this is test exception", getException(10)); // stackTrace 62
//        throw new CustomException("this is test exception", getException(0)); // stackTrace 62
//        throw new CustomException("this is test exception", new CustomException("", getException(1))); // stackTrace 62
        throw new CustomException("this is test exception"); // stackTrace 62
    }


    @GetMapping("/ex2")
    public String itShouldFailV2() {
        throw new CustomExceptionV2("this is test exception V2");
    }

    @GetMapping("/ex3")
    public String itShouldFailV3() {
        throw new CustomExceptionV3("this is test exception V3");
    }
}
