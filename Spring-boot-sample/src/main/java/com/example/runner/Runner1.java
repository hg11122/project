package com.example.runner;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
public class Runner1 {
	@Bean
	@Order(1)
	public static void runner1()
	{
		System.out.println("runner has started"); ;
	}


}
