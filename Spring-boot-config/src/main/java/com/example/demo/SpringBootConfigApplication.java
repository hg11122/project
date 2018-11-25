package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.ConfigBean;

@RestController
@SpringBootApplication
public class SpringBootConfigApplication {
	
	@Autowired
	private ConfigBean configBean;
	
	@RequestMapping("")
	public String config() {
		return configBean.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigApplication.class, args);
	}
}
