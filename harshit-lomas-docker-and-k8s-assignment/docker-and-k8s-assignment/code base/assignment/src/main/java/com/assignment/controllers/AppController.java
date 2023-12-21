package com.assignment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String assignmentEndPoint() {
		return "This is spring docker and K8s assignment endpoint";
	}

}
