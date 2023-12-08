package com.edu.services;

import com.edu.domain.exceptions.CustomException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("anyCustomServiceBeanName")
@RequestMapping("/api")
public class RootApiService {

    @GetMapping("/ex")
    @ExceptionHandler({CustomException.class})
    public String itShouldFail() {
        throw new CustomException("this is test exception");
    }

}
