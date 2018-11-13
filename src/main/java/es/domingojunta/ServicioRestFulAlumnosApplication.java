package es.domingojunta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("es.domingojunta.entities")
@ComponentScan(basePackages="es.domingojunta")
@EnableJpaRepositories(basePackages="es.domingojunta.repositories")
@SpringBootApplication
public class ServicioRestFulAlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioRestFulAlumnosApplication.class, args);
	}
}
