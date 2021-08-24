# INSTRUCCIONES PARA CONFIGURAR UN MICROSERVICIO
## ADAPTACIÓN 
-Para tener un servicio base adaptado a nuestras necesidades, como primer paso debemos cambiar todas las referencias a "base" por el nuevo nombre del microservicio.
-Además de ello debemos generar el archivo .yml con la configuración para los entornos local, dev, prod y qa según sea requerido, y subirlos al repositorio que provee al microservicio de configuración (verificar que el puerto que le asignemos a nuestro ms no esté en uso). 
-Cambiar el texto en el archivo banner.txt que está en la carpeta resources por una representativa del microservicio (Aquí se puede generar el texto: https://devops.datenkollektiv.de/banner.txt/index.html)
Con estos pasos listos, podemos empezar a agregar la lógica de negocio a nuestro nuevo microservicio 
## EJECUCIÓN 
Para que un servicio se ejecute correctamente debemos tener en ejecución los siguientes microservicios:
-config-server
-discovery
-gateway 

El orden de ejecución es el siguiente: config-server>discovery>gateway>microservicio a ejecutar

