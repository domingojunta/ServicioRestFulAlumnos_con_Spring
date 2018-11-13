package es.domingojunta.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.domingojunta.entities.Alumno;
import es.domingojunta.repositories.alumnoRepository;

@Service
public class alumnoServiceImpl implements alumnoService{

	@Autowired
	private alumnoRepository repository;
	
	@Override
	public List<Alumno> getAlumnos() {
		List<Alumno> alumnos = repository.findAll();
		return alumnos;
	}
	@Override
	public Alumno getAlumnoById(int id) {
		Alumno alumno = null;
		Optional<Alumno> optAlumno = repository.findById(id);
		if (optAlumno.isPresent()) {
			alumno = optAlumno.get();
		}
		return alumno;
	}
	@Override
	public void createAlumno(Alumno alumno) {
		repository.save(alumno);
	}
	@Override
	public void deleteAlumno(int id) {
		repository.deleteById(id);
	}
	@Override
	public void updateAlumno(Alumno alumno) {
		repository.save(alumno);
	}
	@Override
	public boolean existeAlumno(int id) {
		boolean respuesta = false;
		respuesta = repository.existsById(id);
		return respuesta;
	}
	
	

}
