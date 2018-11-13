# Trabajo de la Asignatura Sistema de Archivos y Servicios Distribuidos

 Se trata de un Servicio Web desarrollado con Eclipse para el trabajo de la Asignatura arriba indicada de tercer curso del Grado de Informática en la Universidad de Córdoba (España). El objeto del mismo es sólo entender el funcionamiento de un servicio Rest. 
 
 para que el programa funcione hace falta crear el archivo src/main/resources/application.properties con las siguientes líneas:
- server.port=8085
- spring.datasource.url=jdbc:mysql://localhost:3306/servicioRestFulAlumnosDb
- spring.datasource.driver-class-name=com.mysql.jdbc.Driver
- spring.datasource.username=[escribe aquí el nombre de usuario del MySQL]
- spring.datasource.password= [escribe aquí la contraseña]
- spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
- spring.jpa.show-sql=true
- spring.jpa.hibernate.ddl-auto=update
 
 Licencia GPL v3
