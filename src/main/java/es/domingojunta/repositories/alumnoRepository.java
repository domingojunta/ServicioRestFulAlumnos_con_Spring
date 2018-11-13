package es.domingojunta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.domingojunta.entities.Alumno;

@Repository
public interface alumnoRepository extends JpaRepository<Alumno, Integer>{

}
