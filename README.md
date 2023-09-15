## API SALDOS
Api Para la gestión de saldos, actualización y consulta.

## IMPLEMENTACION DE SPRING SECURITY Y JWT
- En esta API se implemento spring security y jwt para poder montar el servidor de autorizacion y autenticacion.
- Para Poder obtener el token es necesario ingresar a la ruta /login.
- El usuario por defecto cargado en base de datos H2 para validar la autenticacion y obtener el token es:
{"email":"correo@correo.com","password":"hola"}, se debe enviar a travaes de una peticion POST, el token sera devuelto en el encabezado.

## BASE DE DATOS H2
Se utitlizó una base de datos H2 propia para el API, por le concepto de microservicio, en la cual el API debe tener conexión a su propia base de datos.
