package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Key;
import java.util.Date;
import java.util.Map;
import org.springframework.security.core.Authentication;

@RestController
public class AuthenticationController {

    // ✅ Generate a secure key once
    private static final Key SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {
        System.out.println("AUTHENTICATE METHOD CALLED");

        String username = authentication.getName();
        System.out.println("Authenticated user: " + username);

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 10 * 60 * 1000)) // 10 minutes
                .signWith(SECRET_KEY)
                .compact();

        return Map.of("token", token);
    }
}
