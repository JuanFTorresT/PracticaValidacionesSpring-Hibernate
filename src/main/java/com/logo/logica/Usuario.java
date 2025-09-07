package com.logo.logica;

import java.time.LocalDate;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Usuario {
	
	@Size(min = 3, max = 50, message = "El nombre debe tener minimo 3 caracteres y máximo 50.")
	private String nombre;
	
	@NotBlank
	@Email(message = "Ingresa un correo eléctronico valido.")
	private String email;
	
	@NotBlank
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*.]).{8,}$", message = "La contraseña debe incluir mayusculas y minusculas, al menos un numero y al menos un caracter especial. además la longitud minima es de 8 caracteres.")
	private String contrasenia;
	
	@NotBlank
	private String confirmacionContrasenia;
	
	
	@Pattern(regexp = "(?:\\d{10})?", message = "El numero debe tener 10 digitos.")
	private String celular;
	
	private int diaNacimiento;
	private String mesNacimiento;
	private int anioNacimiento;
	
	private LocalDate fechaNacimiento;
	
	@NotBlank
	private String genero;
	
	@AssertTrue(message = "Debes aceptar los terminos y condiciones para registrarte.")
	private boolean terminos;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getConfirmacionContrasenia() {
		return confirmacionContrasenia;
	}
	public void setConfirmacionContrasenia(String confirmacionContrasenia) {
		this.confirmacionContrasenia = confirmacionContrasenia;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}
	public String getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(String mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isTerminos() {
		return terminos;
	}
	public void setTerminos(boolean terminos) {
		this.terminos = terminos;
	}
	
	
	
	
	
	
}
