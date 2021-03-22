package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestapiController {
	
	@GetMapping("/trades/findAll")
	public List<User> getUsers() {
		return tradeService.findAllUser();
	}

}
