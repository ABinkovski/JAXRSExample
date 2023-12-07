package com.edu.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class UserAuthentificatedService {

    @GetMapping(value = "/", produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ROLE_USER_ROLE')")
    @SneakyThrows
    public ResponseEntity<Object> sayWhoYouAre() {
        final SecurityContext context = SecurityContextHolder.getContext();
        final Authentication authentication = context.getAuthentication();
        final Map<String, Object> map = new LinkedHashMap<>();

        map.put("isAuthenticated", authentication.isAuthenticated());
        map.put("userName", authentication.getName());
        map.put("roles", authentication.getAuthorities());
        map.put("details", authentication.getDetails());
        map.put("context", new ObjectMapper().writeValueAsString(context));


        return ResponseEntity.ok(map);
    }

    @GetMapping(value = "/admin", produces = APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ADMIN_ROLE')")
    @SneakyThrows
    public ResponseEntity<Object> sayHelloToAdmin() {
        final SecurityContext context = SecurityContextHolder.getContext();
        final Authentication authentication = context.getAuthentication();
        final Map<String, Object> map = new LinkedHashMap<>();

        map.put("isAuthenticated", authentication.isAuthenticated());
        map.put("userName", authentication.getName());
        map.put("roles", authentication.getAuthorities());
        map.put("details", authentication.getDetails());
        map.put("context", new ObjectMapper().writeValueAsString(context));


        return ResponseEntity.ok(map);
    }

}
