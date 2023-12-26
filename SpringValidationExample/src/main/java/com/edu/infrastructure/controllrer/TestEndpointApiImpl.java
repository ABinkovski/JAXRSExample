package com.edu.infrastructure.controllrer;

import com.edu.domain.model.TestEnum;
import com.edu.domain.model.TestRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

import static java.util.Collections.singletonMap;

@RestController
@RequestMapping("javax")
public class TestEndpointApiImpl {

    @GetMapping
    public ResponseEntity<String> root() {
        return getOkResponse();
    }

    @GetMapping("/getJaxValidation")
    public ResponseEntity<Object> jaxValidation(
            @RequestParam("reqParam") @Valid final TestEnum requestParam
    ) {
        return ResponseEntity.ok(singletonMap("reqParam", requestParam));
    }

    @GetMapping("/getJaxValidation/{pathVariable}")
    public ResponseEntity<Object> pathVariable(
            @PathVariable("pathVariable") @Valid final TestEnum pathVariable
    ) {
        return ResponseEntity.ok(singletonMap("pathVariable", pathVariable));
    }

    @PostMapping("/postJaxValidation")
    public ResponseEntity<Object> pathVariable(
            @RequestBody @Valid final TestRequest testRequest
    ) {
        return ResponseEntity.ok(testRequest);
    }

    private static ResponseEntity<String> getOkResponse() {
        return ResponseEntity.ok("ok: " + LocalDateTime.now());
    }
}
