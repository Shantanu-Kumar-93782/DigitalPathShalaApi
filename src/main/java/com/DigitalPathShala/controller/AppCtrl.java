package com.DigitalPathShala.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DigitalPathShala.dto.BaseDto;

@RestController
public class AppCtrl {

	@GetMapping("/login")
	public Object loginPage() {
		return new BaseDto();
	}
	
	@RequestMapping("/")
	public Object indexPage() {
		return "DigitalPathShala is up and running";
	}
}
