package com.edu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan({
        "com.edu.config",
        "com.edu.services"
})
public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void configureMessageConverters(final List<HttpMessageConverter<?>> converters) {
//        converters.add(new MappingJackson2HttpMessageConverter());
//        WebMvcConfigurer.super.configureMessageConverters(converters);
//    }
}
