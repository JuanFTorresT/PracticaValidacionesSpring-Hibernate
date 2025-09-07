<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<title>Registrate en Facebook</title>

</head>
<body>
	<div class="contenedorPrincipal">
		<h1 class="logo">Logotipo</h1>
		<div class="contenedorFormulario">
			<div class="tituloFormulario">
				<h2>Cree una cuenta</h2>
				<p>Es rápido y fácil</p>
			</div>
			<hr>
			<div class="formulario">
				<form:form action="procesaRegistro" method="post" modelAttribute="usuario">
				
					<form:input path="nombre" placeholder="Nombre Completo"/>
					<form:errors path="nombre" class="error"></form:errors>
					
					<form:input path="email" placeholder="Correo electrónico"/>
					<form:errors path="email" class="error"></form:errors>
					
					<form:password path="contrasenia" placeholder="Contraseña"/>
					<form:errors path="contrasenia" class="error"></form:errors>
					
					<form:password path="confirmacionContrasenia" placeholder="Confirmación de contraseña"/>
					<form:errors path="confirmacionContrasenia" class="error"></form:errors>
					
					<form:label path="fechaNacimiento" class="tituloCampo">Fecha de nacimiento</form:label>
					
					<div class="selectorNacimiento">
						<form:select path="diaNacimiento" items="${diaNacimiento}"></form:select>
						<form:select path="mesNacimiento" items="${mesNacimiento}"></form:select>
						<form:select path="anioNacimiento" items="${aniosNacimiento}"></form:select>
					</div>
					<form:errors path="anioNacimiento" class="error"></form:errors>

					
					<form:input path="celular" placeholder="Numero de celular"/>
					<form:errors path="celular" class="error"></form:errors>
					
					<form:label path="genero" class="tituloCampo">Genero</form:label>
					
					<div class="radiosGenero">
						<label class="radioGenero">
							Hombre <form:radiobutton path="genero" value="Hombre"/>
						</label>
						
						<label class="radioGenero">
							Mujer <form:radiobutton path="genero" value="Mujer"/>
						</label>
						
						<label class="radioGenero">
							Personalizado <form:radiobutton path="genero" value="Personalizado"/>
						</label>
					</div>
					<form:errors path="genero" class="error"></form:errors>
					
					<form:label path="terminos" class="terminos">
					<form:checkbox path="terminos" value="true"/>Acepto los terminos y condiciones
					</form:label>
					<form:errors path="terminos" class="error"></form:errors>
					
					
					
					<form:button class="btn registro">Registrarse</form:button>
					
				</form:form>
					
					<a href="/ProyectoValidaciones/" class="link">¿Ya tienes cuenta?</a>
			</div>
		</div>	
	</div>
</body>
</html>