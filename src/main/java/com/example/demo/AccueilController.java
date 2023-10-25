package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccueilController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Version 0.0.1!";
    }

    @GetMapping("accueil")
    public String yolo() {
        return "Greetings from Spring Boot! Version 0.0.1 accueil!";
    }
}