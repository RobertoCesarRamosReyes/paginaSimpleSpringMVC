package com.linking.pc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bootController {
	
	@GetMapping({"","/","index"})
	public String boot(Model model) {
		return "computadora";
	}
}
