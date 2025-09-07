package com.logo.logica.validacionesPersonalizadas;

import java.time.LocalDateTime;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.logo.logica.Usuario;

public class ValidacionAnioNacimiento implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Usuario.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Usuario usuario = (Usuario) target;
		
		if (LocalDateTime.now().getYear()-usuario.getAnioNacimiento()<5) {
			errors.rejectValue("anioNacimiento", "ValidacionAnio.noEsReal", "Parece que la información que ingresaste no es correcta. Asegúrate de usar tu fecha de nacimiento real.");
		}
		
	}

}
