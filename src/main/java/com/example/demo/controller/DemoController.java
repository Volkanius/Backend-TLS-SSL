
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/protected")
    public Map<String, String> protectedEndpoint() {
        return Map.of(
                "message",
                "Acceso autorizado. JWT válido."
        );
    }
}
