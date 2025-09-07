# Formulario de Registro con Validaciones - Spring MVC

Este proyecto es un **formulario de registro de usuario** desarrollado con **Spring MVC** y **Hibernate Validator**, que incluye validaciones tanto estándar como personalizadas.  
El objetivo es practicar y demostrar el uso de anotaciones de validación en Java, junto con controladores y vistas JSP.

---
## Características

- Formulario de registro completo con los siguientes campos:
  - **Nombre completo**: mínimo 3, máximo 50 caracteres, solo letras y espacios.
  - **Correo electrónico**: formato válido requerido.
  - **Contraseña**: mínimo 8 caracteres, con al menos una mayúscula, una minúscula, un número y un carácter especial.
  - **Confirmación de contraseña**: debe coincidir con la contraseña.
  - **Número de celular**: opcional, exactamente 10 dígitos si se ingresa.
  - **Fecha de nacimiento**: día, mes y año seleccionables; validación personalizada para el año.
  - **Género**: selección obligatoria.
  - **Términos y condiciones**: checkbox obligatorio.

- Validaciones implementadas con:
  - Anotaciones estándar de **Hibernate Validator** (`@NotBlank`, `@Email`, `@Size`, `@Pattern`, `@AssertTrue`).
  - **Validaciones personalizadas @InitBinder**:
    - Validación de confirmacion de contraseña.
    - Validación de año de nacimiento.

- Manejo de errores de validación y despliegue de mensajes en la vista.

---
## ⚙️ Requisitos

- Java 8+
- Eclipse / IntelliJ IDEA
- Servidor de aplicaciones: Apache Tomcat 9+
- Dependencias (ya incluidas):
  - Spring MVC
  - Hibernate Validator
  - Jstl
---
## Ejecutar localmente

1. Clonar el repositorio:
 ```bash
 git clone https://github.com/JuanFTorresT/PracticaValidacionesSpring-Hibernate.git
 ```
   
2. Importar el proyecto en Eclipse como Dynamic Web Project.

3. Configurar el servidor Apache Tomcat.

4. Ejecutar la aplicación en el servidor.

5. Acceder en el navegador a:

```bash
http://localhost:8080/ProyectoValidaciones/
```
Ten en cuenta el numero del puerto que tienes configurado para el servidor, el tuyo podría ser diferente.

---
## Capturas

<img width="1913" height="972" alt="image" src="https://github.com/user-attachments/assets/f7af1c29-365a-491b-875b-2425fc31a987" />
<img width="1917" height="968" alt="image" src="https://github.com/user-attachments/assets/c531c994-7850-4b15-975c-10f3ffd68b86" />
<img width="1917" height="968" alt="image" src="https://github.com/user-attachments/assets/da00c894-b6cf-4878-a5c4-9fcc01ec74a6" />
<img width="1919" height="970" alt="image" src="https://github.com/user-attachments/assets/eac64c9a-a83f-4fb3-b300-291c2d5eaeff" />

---
## Licencia

Este proyecto se creó con fines educativos y de práctica.
Puedes usarlo, modificarlo y compartirlo libremente.

---
## Feedback

Si tienes algun aporte o recomendación comunícate a: juanftorrest@gmail.com

