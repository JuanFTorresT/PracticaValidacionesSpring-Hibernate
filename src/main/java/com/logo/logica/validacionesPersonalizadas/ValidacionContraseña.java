package com.logo.logica.validacionesPersonalizadas;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.logo.logica.Usuario;

public class ValidacionContraseña implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Usuario.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Usuario usuario = (Usuario) target;
		
		if (!usuario.getConfirmacionContrasenia().equals(usuario.getContrasenia())) {
			errors.rejectValue("confirmacionContrasenia", "confirmacionContrasenia.noCoincide", "Las contraseñas no coinciden.");
		}
		
	}

}
