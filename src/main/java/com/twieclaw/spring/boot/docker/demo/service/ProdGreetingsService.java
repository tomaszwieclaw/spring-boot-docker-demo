package com.twieclaw.spring.boot.docker.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Primary
@Service
class ProdGreetingsService implements GreetingsService {

	@Override
	public String getWelcomeMessage() {
		return "Środowisko produkcyjne - nie sp.....l tego!";
	}
}
