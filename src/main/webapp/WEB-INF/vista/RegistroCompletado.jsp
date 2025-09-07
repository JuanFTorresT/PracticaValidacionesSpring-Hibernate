<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<title>Mi perfil</title>
</head>
<body>
	<div class="contenedorPrincipal">

		<div class="contenedorTarjeta">
		
			<div class="cabecera">
				<div class="fondoFoto">
					<div class="fondo"></div>
					<div class="foto"></div>
				</div>
				<h1 class="logo">${usuario.nombre}</h1>
				<p >${usuario.email }</p>
			</div>
			<hr>
			<div>
				<label class="info">Fecha de nacimiento: <p>${usuario.fechaNacimiento}</p></label>
				<label class="info">Contacto: <p>${usuario.celular }</p></label>
				<label class="info">Genero: <p>${usuario.genero }</p></label>
			</div>
			<a href="/ProyectoValidaciones/"><button class="btn cerrarSesion">Cerrar sesion</button></a>
		</div>
	</div>
</body>
</html>