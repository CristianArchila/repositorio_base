# SUPPORT MS
## Función



El Support MS es el encargado de recibir las peticiones de soporte de los usuarios que usan la aplicación, teniendo los datos ya solo se encarga de enviar un correo con esta información, haciendo uso del  MAIL BROKER.

## Servicios

|Servicio |Método | URL |Descripción|
| ------ | ------ | ------ |-------| 
| Solicitar soporte por correo|POST| /support |Se envía la información del remitente, asunto  y sus preguntas sobre la plataforma al MicroService Mail.  |





## Build

Para poder realizar el build del microservicio, deben encontrarse en ejecución los siguientes microservicios:

- config-server
- discovery
- gateway



## Run

Para poder ejecutar el microservicio de manera correcta, en el entorno de ejecución deben configurarse las siguientes variables de entorno: 
|Variable de Entorno |Descripción |
| ------ | ------ | 
|MAIL_MS_DOMAIN|Host del mail microservice|
|MAIL_MS_NAME|Nombre del microservicio|


El microservicio utiliza el Mail Microservice para enviar las solicitudes de soporte, por ello debe estar en ejecución para que el microservicio funcione correctamente.
