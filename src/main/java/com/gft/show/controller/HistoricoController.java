package com.gft.show.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HistoricoController {


	@GetMapping("/historico")
	public ModelAndView LifeStyle() {
		ModelAndView mv = new ModelAndView("Historico");
		return mv;
	}
	
	


	
}
