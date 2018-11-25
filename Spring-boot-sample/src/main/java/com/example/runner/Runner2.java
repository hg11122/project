package com.example.runner;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
public class Runner2 {
			
		@Bean
		@Order(2)
		public static String runner2()
		{
			return "runner1 has started";
		}

	}


