package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/testmone")
	public String methodOne() {
		
		return "Have a good day";
	}
	
	@GetMapping("/testdummy-api")    // http://localhost:9091/test-api
	public String ontestthree() {
		
		return "Have a great life";
		
	}

}
