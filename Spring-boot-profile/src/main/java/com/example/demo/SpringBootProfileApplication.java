package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.MassageService;

@SpringBootApplication
@ComponentScan("com.example.server")
@EnableConfigurationProperties({MassageService.class})
public class SpringBootProfileApplication implements CommandLineRunner {
	@Autowired
	private MassageService helloWorldService;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.helloWorldService.getMessage());
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}




	
	
}
