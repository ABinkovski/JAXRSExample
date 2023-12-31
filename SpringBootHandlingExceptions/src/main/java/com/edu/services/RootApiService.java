package com.edu.services;

import com.edu.domain.exceptions.CustomException;
import com.edu.domain.exceptions.CustomExceptionV2;
import com.edu.domain.exceptions.CustomExceptionV3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.edu.domain.utils.TestUtils.getException;

@RestController("anyCustomServiceBeanName")
@RequestMapping("/api")
public class RootApiService {

    @GetMapping("/ex1")
    public String itShouldFail() {
        throw new CustomException("this is test exception"); // stackTrace 62
    }


    @GetMapping("/handledWithBigStackTrace")
    public String handledWithBigStackTrace() {
        throw new CustomException("this is test exception", getException(400));
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
