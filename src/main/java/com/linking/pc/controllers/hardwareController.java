package com.linking.pc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hardware")
public class hardwareController {

	@GetMapping({"","/"})
	public ModelAndView verHardware(ModelAndView mav) {
		mav.setViewName("hardware/verHardware");
		return mav;
	}
}
