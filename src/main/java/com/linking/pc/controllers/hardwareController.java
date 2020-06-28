package com.linking.pc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@GetMapping({"/entrada","/entrada/"})
	public String hardwareEntrada(Model model) {
		return "hardware/verHardwareEntrada";
	}
	
	@GetMapping({"/proceso","/proceso/"})
	public String hardwareProceso(Model model) {
		return "hardware/verHardwareProceso";
	}
	
	@GetMapping({"/salida","/salida/"})
	public String hardwareSalida(Model model) {
		model.addAttribute("titulo", "Hardware de salida");
		return "hardware/verHardwareSalida";
	}
	
	@GetMapping({"/almacenamiento","/almacenamiento/"})
	public String hardwareAlmacenamiento(Model model) {
		model.addAttribute("titulo", "Hardware de almacenamiento");
		return "hardware/verHardwareAlmacenamiento";
	}
}
