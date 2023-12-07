package com.edu.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SimpleAuthenticatedApiImpl implements SimpleAuthenticatedApi {

    @Override
    public SecurityContext configFromInterface() {
        log.info("interface based endpoint is accessed by user.");
        return SecurityContextHolder.getContext();
    }

    @Override
    public SecurityContext configFromInterfaceForAdmin() {
        log.info("interface based endpoint is accessed by admin.");
        return SecurityContextHolder.getContext();
    }
}
