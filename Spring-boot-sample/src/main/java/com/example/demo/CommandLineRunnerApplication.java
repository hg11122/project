package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineRunnerApplication {

	public static void main(String[] args) {
		System.out.println("Start....");
		SpringApplication.run(CommandLineRunnerApplication.class, args);
		System.out.println("service has startde");
	}
	@Bean
	public static CommandLineRunner testA()
	{
		CommandLineRunner runner=new CommandLineRunner() {
			@Override
		public void run(String... args) throws Exception
		{
			System.out.println("the testA runner start to init...");
		}
		};
		return runner;
	}
	

}
