package com.twieclaw.spring.boot.docker.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Primary
@Service
class DevGreetingsService implements GreetingsService {

	@Override
	public String getWelcomeMessage() {
		return "Witaj na środowisku developerskim, rób sobie co chcesz tak jak obecny rząd :)";
	}
}
