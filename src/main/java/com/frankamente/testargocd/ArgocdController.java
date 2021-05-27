package com.frankamente.testargocd;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArgocdController {

    @GetMapping
    public ResponseEntity<String> greeting() {
        final String greeting = System.getenv().getOrDefault("GREETING", "Environment variable GREETING not found");
        return ResponseEntity.ok(greeting);
    }
}
