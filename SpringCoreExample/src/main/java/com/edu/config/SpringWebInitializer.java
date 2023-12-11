package com.edu.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Slf4j
public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        log.info("getRootConfigClasses");
        return new Class[]{
                MappingConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        log.info("getServletConfigClasses");
        return new Class[]{
                WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        log.info("getServletMappings");
        return new String[]{"/"};
    }
}
