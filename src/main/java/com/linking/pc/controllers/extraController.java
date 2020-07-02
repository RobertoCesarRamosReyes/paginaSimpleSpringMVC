package com.linking.pc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/extras")
public class extraController {
	
	@GetMapping({"","/"})
	public String verExtra(Model model) {
		model.addAttribute("titulo", "Extras");
		return "extra/indexExtra";
	}

}
