package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
	@Profile({"hello","default","dev"})
public class HelloWorldService implements MassageService {


	@Value("${name:World}")
	private String name;
	@Override
	public String getMessage() {
		return "Hello" + this.name;
	}
}
