<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<title>Iniciar sesion en Logotipo</title>
</head>
<body>
	<div class="contenedorPrincipal">
		<h1 class="logo">Logotipo</h1>
		<p class="mision">Logotipo te ayuda a comunicarte y compartir con las personas que forman parte de tu vida.</p>
		<div class="contenedorFormulario login">
			<form action="" class="formularioLogin">
			
				<input type="text" placeholder="Correo eléctronico o número de teléfono" disabled="disabled">
				
				<input type="password" placeholder="Contraseña" disabled="disabled">
				
				<input type="submit" value="Iniciar sesión" class="btn login" disabled="disabled">
				
				<a href="#">¿Olvidaste tu contraseña?</a>
				
				<hr>
				
				<a href="mostrarFormularioRegistro"><button type="button" class="btn registro">Crear una cuenta</button></a>
			</form>
		</div>
	</div>
</body>
</html>