package com.twieclaw.spring.boot.docker.demo.service;

import org.springframework.stereotype.Service;

@Service
class DefaultGreetingsService implements GreetingsService {

	@Override
	public String getWelcomeMessage() {
		return "Nie wiadomo gdzie jesteś, nie wiadomo co możesz tu zrobić.";
	}
}
