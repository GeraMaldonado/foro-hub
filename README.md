# Foro Hub

_Este proyecto es una practica emulando un foro, la aplicacion por ahora solo cuenta con la secicon de topicos (CRUD) y la seccion de usuarios con un metodo POST con el proposito de verificar la existencia del usuario, por lo que el usuairo debera crearse manualmente en la base de datos. Se utilizó Spring Boot 3 para la creación del backend.
Para probar los enpoints se uso POSTMAN_

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

### Pre-requisitos 📋

_Que cosas necesitas para instalar el software y como instalarlas_

- Java JDK 17
- Maven 3.8.1 o superior
- IntelliJ IDEA o cualquier IDE compatible con JAVA (Opcional)
- Mysql
- POSTMAN (O alguno similar)

### Instalación 🔧

#### IntelliJ IDEA
1. Clonar el repositorio
  ```sh
  git clone https://github.com/GeraMaldonado/foro-hub.git
  ```
2. Abre el proyecto en tu IDE.
3. Configura el SDK de Java en tu IDE (asegúrate de tener instalado JDK 17).
4. Espera a que Maven descargue todas las dependencias necesarias.
5. Crea las variables de entorno para la base de datos, (DB_USER, DB_NAME, DB_HOST, DB_PASSWORD y JWT_SECRET).
6. Ejecuta la clase Principal para iniciar la aplicación.
7. Crear manualmente un usuario en la tabla "usuarios" de MySQL
   7.1 Poner una clave codificada con Bcrypt
8. Usar postman para probar los endpoints
- "/topico" con (GET, POST, PUT)
- "/topico/:id" con (GET, DELETE)
- "/login" con (POST)

## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo. 
* Da las gracias públicamente 🤓.
* etc.



---
⌨️ con ❤️ por [GeraMaldonado](https://github.com/GeraMaldonado) 😊
