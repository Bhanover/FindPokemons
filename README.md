# FindPokemons
# Pokemons

[![Download IntelliJ IDEA](https://img.shields.io/badge/download-IntelliJ%20IDEA-blue)](https://www.jetbrains.com/idea/download/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-^2.5.0-brightgreen)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-^3.8.1-yellow)](https://maven.apache.org/)
[![Java](https://img.shields.io/badge/Java-^11.0-orange)](https://www.java.com/)
[![Postman](https://img.shields.io/badge/Postman-FF6C37)](https://www.postman.com/downloads/postman-agent/)
<p align="center">
  <img src="https://github.com/Bhanover/FindPokemons/assets/127310131/f4d7d821-91fc-4e16-854c-0b91944415c4" alt="image" width="400px" heigth="200px">
</p>

 ## Descripción
Esta es una applicación donde introduces una url con los parametros de `latitud, longitud , radio` y te devuelve los nombres de los pokemons que se encuentran entre esa distancia 

## Características Principales
- Uso de la formula de Haversine
- Uso de Query params
  
## Bibliotecas y Dependencias

### Servidor (usando Spring Boot):
- Spring Web: Facilita el desarrollo de aplicaciones web RESTful y la interacción con la base de datos.
- Spring Data JPA: Simplifica la persistencia de datos en la base de datos.
- MySQL Driver: Permite la comunicación con la base de datos MySQL.
- Lombok : Facilita el uso de anotaciones ,se utiliza para reducir el código repetitivo

## Requisitos del Sistema
Para ejecutar este proyecto, necesitarás lo siguiente instalado en tu sistema:
- Java 11 o superior


### Instalación y Configuración del entorno de desarrollo

#### IntelliJ IDEA
1. Descarga e instala [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) Community Edition.
2. Clona el repositorio en tu máquina local.
3. Abre IntelliJ IDEA y selecciona "Open" en el diálogo inicial. Busca y selecciona la carpeta del proyecto que acabas de clonar.
4. IntelliJ IDEA detectará automáticamente el archivo `pom.xml` y configurará tu proyecto en base a él. Si se te solicita, permite que IntelliJ IDEA descargue e instale los plugins y dependencias necesarios.

### Configuración de la base de datos

Es necesario tener MySQL instalado y configurado en tu máquina local. Una vez hecho esto, debes configurar las credenciales y otros parámetros de la base de datos siguiendo el archivo `application.properties` del servidor de Spring Boot donde se encuentra el nombre que debes usar en la base de datos y el usuario que debes usar en Mysql junto con su contraseña.

```properties
spring.datasource.url= jdbc:mysql://localhost:3306/pokemon?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username= root
spring.datasource.password= 1234
```
Una ves creado en Mysql el usuario "root" con password "1234" no olvides de crear la base de datos con el comando `create database pokemon`;


## Cómo Empezar
Después de configurar el entorno de desarrollo y la base de datos, puedes iniciar el servidor y el cliente de la siguiente manera:

### También puedes empezar desde 0 (Mysql)
 - Spring Boot ya te crea las tablas (solo nesesitarias crear la base de datos) y añadir esto :
 ```  INSERT INTO pokemon (name, latitud, longitud ) VALUES ('pikachu', 43.351, -8.416);
      INSERT INTO pokemon (name, latitud, longitud )VALUES ('gato', 44.351, -7.416);
      INSERT INTO pokemon (name, latitud, longitud )VALUES ('niño', 45.351, -6.416);
      INSERT INTO pokemon (name, latitud, longitud )VALUES ('lirio', 46.351, -5.416);
```


### Servidor (Spring Boot)
1. En IntelliJ IDEA, busca la clase principal de la aplicación (usualmente nombrada `Application` o `Main`) en el panel de archivos del proyecto `/src/main/java/com/ApiRestPokemon/ApiRestPokemo` ahí encontraras la clase `MyserverApplication`.
2. Haz clic derecho en la clase principal y selecciona 'Run `Application.main()`' en el menú contextual. Esto iniciará el servidor en el puerto que se especificó en el archivo `application.properties`.

![image](https://github.com/Bhanover/MyProject/assets/127310131/e7fdda1f-6c65-4516-b273-62e29dc0fde5)


## Guía de Uso Detallada

- Nesesitaras usar `Postman Agent` para probar las peticiones.
- Ejemplo de petición:
  GET /pokemon?latitud=43.347165&longitud=-8.41307&radio=10
  
  ![image](https://github.com/Bhanover/FindPokemons/assets/127310131/288e0792-eba5-4d3c-bd3a-4735b5292bf6)

  Resultado :
  
  ![image](https://github.com/Bhanover/FindPokemons/assets/127310131/a1df1e83-fe90-40f2-a794-4e9f9ed80451)

- POST /pokemon/{id}

  ![image](https://github.com/Bhanover/FindPokemons/assets/127310131/cc48c31b-7874-4636-9cf4-e2f97f049dac)


## Contacto
Si tienes preguntas o deseas discutir algo sobre el proyecto, no dudes en contactarme a través de mi correo electrónico: billydht5@gmail.com

## Licencia
Este proyecto está licenciado bajo [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).



