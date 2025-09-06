package com.logo.logica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	@RequestMapping
	public String mostrarIndex() {
		return "index";
	}
}
