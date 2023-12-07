package com.edu.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.GetMapping;

public interface SimpleAuthenticatedApi {


    @GetMapping("/interface")
    @PreAuthorize("hasRole('ROLE_USER_ROLE')")
    SecurityContext configFromInterface();

    @GetMapping("/interface/admin")
    @PreAuthorize("hasRole('ADMIN_ROLE')")
    SecurityContext configFromInterfaceForAdmin();

}
