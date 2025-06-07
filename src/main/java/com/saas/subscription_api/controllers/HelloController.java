package com.saas.subscription_api.controller;

import java.util.HashMap;
import java.util.Map;

//import org.hibernate.mapping.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class HelloController {
    
     @GetMapping("/hello")
    public Map<String, String> sayHello() {
        System.out.println("🎯 /api/hello endpoint called");
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello Mastermind!");
        return response;
    }
}
