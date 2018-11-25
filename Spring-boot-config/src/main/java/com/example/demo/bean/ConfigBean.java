package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@ConfigurationProperties(prefix = "MY")
@Configuration
@Data
public class ConfigBean {
	
	private String name;
	private int age;
	private long number;
	private String uuid;
	@Override
	public String toString() {
		return "ConfigBean [name=" + name + ", age=" + age + ", number=" + number + ", uuid=" + uuid + "]";
	}
	
	
	
	
	

}
