package com.logo.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorRegistro {
	
	@ModelAttribute("diaNacimiento")
	public List<String> diaNacimiento(){
		List<String> dias = new ArrayList<String>();
		for (int i = 1; i <= 31; i++) {
	    	
	        dias.add(Integer.toString(i));
	    }
		return dias;
	}
	
	@ModelAttribute("mesNacimiento")
	public List<String> mesNacimiento(){
		List<String> meses = Arrays.asList("Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic");
		return meses;
	}
	
	@ModelAttribute("aniosNacimiento")
	public List<String> aniosNacimiento() {
	    List<String> anios = new ArrayList <String> ();
	    for (int i = 2025; i >= 1905; i--) {
	    	
	        anios.add(Integer.toString(i));
	    }
	    return anios;
	}

	@RequestMapping("/mostrarFormularioRegistro")
	public String mostrarFormularioRegistro(Model model) {

		
		model.addAttribute("usuario", new Usuario());
		
		
		
		return "FormularioRegistro";
	}
	
	
	
}
