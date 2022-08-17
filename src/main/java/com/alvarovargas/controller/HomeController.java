package com.alvarovargas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alvarovargas.services.DestinoService;

@Controller
public class HomeController {

	@Autowired
	private DestinoService destinoService;
	
	@GetMapping("/")//ruta principal o root (raiz) para el despliegue de la aplicacion
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("destinos");//se asigna la vista mediante el constructor
		modelAndView.addObject("destinos", destinoService.findAll());//se agregan lois datos al modelo y despacharlos a la vista
		return modelAndView;
	}
}
