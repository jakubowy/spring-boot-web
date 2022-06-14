package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSubpage {
    
	@GetMapping("/subpage")
	public String index() {
		return "Subpage Works!";
	}

}
