package com.twieclaw.spring.boot.docker.demo.controller;

import com.twieclaw.spring.boot.docker.demo.service.GreetingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	private final GreetingsService greetingsService;

	public GreetingsController(GreetingsService greetingsService) {
		this.greetingsService = greetingsService;
	}

	@GetMapping("/welcome")
	public String welcome() {
		return greetingsService.getWelcomeMessage();
	}
}
