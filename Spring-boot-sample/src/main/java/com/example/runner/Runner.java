package com.example.runner;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Runner {
	
	@Bean
	public static String runner1()
	{
		return "runner has started";
	}

}
