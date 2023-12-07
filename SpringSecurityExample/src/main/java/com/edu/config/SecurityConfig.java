package com.edu.config;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true
)
public class SecurityConfig {

    @Bean
    @SneakyThrows
    public SecurityFilterChain filterChain(final HttpSecurity httpSecurity) {
        httpSecurity
                .authorizeHttpRequests((auth) -> auth.anyRequest().authenticated())
                .httpBasic();

        return httpSecurity.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().antMatchers("/public");
    }

    @Bean
    public InMemoryUserDetailsManager hardcodedAuthNeverDoThatInProd() {
        final UserDetails userDetails = User.withUsername("user")
//                .password("{noop}123")
                .password("{bcrypt}$2a$12$auCD9WosqdkTadm41eHk3uUIiqUs1oHCu4joHAjv5ETaGz.izrEZK")
                .roles("USER_ROLE")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
}
