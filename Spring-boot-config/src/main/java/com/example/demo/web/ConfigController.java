package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.ConfigBean;

@RestController
public class ConfigController {
	
	@Autowired
	private ConfigBean configBean;
	@RequestMapping("/nnn")
	public String config() {
		return configBean.toString();
	}

}
