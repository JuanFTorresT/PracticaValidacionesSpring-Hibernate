package com.logo.logica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logo.logica.validacionesPersonalizadas.ValidacionAnioNacimiento;
import com.logo.logica.validacionesPersonalizadas.ValidacionContraseña;

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
	    for (int i = LocalDateTime.now().getYear(); i >= 1905; i--) {
	    	
	        anios.add(Integer.toString(i));
	    }
	    return anios;
	}
	

	
	@InitBinder("usuario")
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new ValidacionContraseña(), new ValidacionAnioNacimiento());
	}

	@RequestMapping("/mostrarFormularioRegistro")
	public String mostrarFormularioRegistro(Model model) {

		model.addAttribute("usuario", new Usuario());
		
		return "FormularioRegistro";
	}
	
	@RequestMapping("/procesaRegistro")
	public String procesarRegistro(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult resultadoValidacion) {
		
		int mes = convertirMes(usuario.getMesNacimiento());
		
		LocalDate fecha = LocalDate.of(usuario.getAnioNacimiento(), mes, usuario.getDiaNacimiento());
		
		usuario.setFechaNacimiento(fecha);
		
		if(resultadoValidacion.hasErrors()) {
			return "FormularioRegistro";
		}else {
			return "RegistroCompletado";
		}
		
		
	}

	private int convertirMes(String mes) {
	    switch (mes) {
	        case "Ene": return 1;
	        case "Feb": return 2;
	        case "Mar": return 3;
	        case "Abr": return 4;
	        case "May": return 5;
	        case "Jun": return 6;
	        case "Jul": return 7;
	        case "Ago": return 8;
	        case "Sep": return 9;
	        case "Oct": return 10;
	        case "Nov": return 11;
	        case "Dic": return 12;
	        default: throw new IllegalArgumentException("Mes inválido: " + mes);
	    }
	}
	
	
	
}
