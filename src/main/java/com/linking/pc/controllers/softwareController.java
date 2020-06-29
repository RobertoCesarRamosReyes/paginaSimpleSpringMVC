package com.linking.pc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/software")
public class softwareController {
	
	@GetMapping({"","/"})
	public String indexSoftware(Model model) {
		model.addAttribute("titulo", "Software");
		return "software/verSoftware";
	}
	
	@GetMapping({"/aplicacion","/aplicacion/"})
	public String verSoftwareA(Model model) {
		model.addAttribute("titulo", "Software de aplicación");
		return "software/verSoftwareAplicacion";
	}

	@GetMapping({"/sistemasOperativos","/sistemasOperativos/"})
	public String verSO(Model model) {
		model.addAttribute("titulo", "Sistemas Operativos");
		return "software/verSoftwareSO";
	}
	
	@GetMapping({"/desarrollo","/desarrollo/"})
	public String verSoftwareDesarrollo(Model model) {
		model.addAttribute("titulo", "Software de desarrollo");
		return "software/verSoftwareDesarrollo";
	}
	
}
