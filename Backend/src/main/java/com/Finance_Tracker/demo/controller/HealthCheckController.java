package com.Finance_Tracker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	
	@GetMapping("/")
	public String healthCheck() {
        return "✅ Backend is running";
    }
}
