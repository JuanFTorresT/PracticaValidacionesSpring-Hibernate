<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrate en Logo</title>
</head>
<body>
	<div class="contenedorPrincipal">
		<h1>LOGO</h1>
		<div class="contenedorFormulario">
			<div class="tituloFormulario">
				<h2>Cree una cuenta</h2>
				<p>Es rápido y fácil</p>
			</div>
			<hr>
			<div class="formulario">
				<form:form action="submit" method="post" modelAttribute="usuario">
				
					<form:input path="nombre" placeholder="Nombre Completo"/>
					
					<form:input path="email" placeholder="Correo electrónico"/>
					
					<form:input path="contrasenia" placeholder="Contraseña"/>
					
					<form:input path="ConfirmacionContrasenia" placeholder="Confirmación de contraseña"/>
					
					<form:label path="fechaNacimiento">Fecha de nacimiento</form:label>
					
					<div>
						<form:select path="diaNacimiento" items="${diaNacimiento}"></form:select>
						<form:select path="mesNacimiento" items="${mesNacimiento}"></form:select>
						<form:select path="anioNacimiento" items="${aniosNacimiento}"></form:select>
					</div>

					
					<form:input path="celular" placeholder="Numero de celular"/>
					
					<form:label path="genero">Genero</form:label>
					
					<div>
						<label>
							Hombre <form:radiobutton path="genero" value="Hombre"/>
						</label>
						
						<label>
							Mujer <form:radiobutton path="genero" value="Mujer"/>
						</label>
						
						<label>
							Personalizado <form:radiobutton path="genero" value="Personalizado"/>
						</label>
					</div>
					
					<form:label path="terminos">
					<form:checkbox path="terminos" value="true"/>Acepto los terminos y condiciones
					</form:label>
					
					<form:button>Registrarse</form:button>
					
				</form:form>
					
					<a href="#">¿Ya tienes cuenta?</a>
			</div>
		</div>	
	</div>
</body>
</html>