package es.domingojunta.services;

import java.util.List;
import es.domingojunta.entities.Alumno;

public interface alumnoService {
	
	public List<Alumno> getAlumnos();
	public Alumno getAlumnoById(int id);
	public void createAlumno(Alumno alumno);
	public void deleteAlumno(int id);
	public void updateAlumno(Alumno alumno);
	public boolean existeAlumno(int id);
	
}
