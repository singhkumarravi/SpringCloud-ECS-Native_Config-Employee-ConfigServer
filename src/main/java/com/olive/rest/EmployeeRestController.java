package com.olive.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
  
	@Value("${my.app.title}")
	private String title;
	
	@GetMapping("/info")
	public String myData() {
		System.out.println("Title :: " + title);
		return "Data from Properties " + title;
	}
}
