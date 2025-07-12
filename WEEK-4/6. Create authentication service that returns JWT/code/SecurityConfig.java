package com.cognizant.spring_learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // disable CSRF for APIs
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/authenticate").permitAll() // allow /authenticate to everyone
                .anyRequest().authenticated()                // other requests require authentication
            )
            .httpBasic(); // enable HTTP Basic authentication

        return http.build();
    }

    // ✅ Add in-memory user: username = user, password = pwd
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User
                .withUsername("user")
                .password("{noop}pwd") // {noop} means plain text password, no encoding
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}
