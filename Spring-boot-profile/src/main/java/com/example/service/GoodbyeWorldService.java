package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"goodbye"})
public class GoodbyeWorldService implements MassageService {
	@Value("{name:World}")
	private String name;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return  "" +name ;
	}

}
