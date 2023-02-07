package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getGreeting() {
		System.out.println("Welcome to the catalog services");
		return "Welcome to the book catalog and testing!";
	}

}
