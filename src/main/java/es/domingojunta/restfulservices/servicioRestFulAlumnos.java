package es.domingojunta.restfulservices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.domingojunta.entities.Alumno;
import es.domingojunta.services.alumnoService;

@RestController
@RequestMapping("/api-rest")
public class servicioRestFulAlumnos {
	
	@Autowired
	private alumnoService service;
	
	@GetMapping(value="/alumnos")
	public ResponseEntity<List<Alumno>> getAllAlumnos(){
		
		List<Alumno> listado = service.getAlumnos();
		ResponseEntity<List<Alumno>> response = new ResponseEntity<List<Alumno>>(listado,HttpStatus.OK);
		return response;
		
	}
	
	@GetMapping("/alumno/{id}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable(name="id") int id){
		Alumno alumno = service.getAlumnoById(id);
		ResponseEntity<Alumno> response = null;
		
		if (alumno != null) {
			response = new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
		} else {
			response = new ResponseEntity<Alumno>(HttpStatus.NO_CONTENT);
		} 
		
		return response;
		
	}
	
	@PostMapping("/alumno")
	public ResponseEntity<Alumno> createAlumno (@RequestBody Alumno alumno){
		ResponseEntity<Alumno> response = null;
		service.createAlumno(alumno);
		response = new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/alumno")
	public ResponseEntity<Alumno> updateAlumno (@RequestBody Alumno alumno){
		ResponseEntity<Alumno> response = null;
		if (service.existeAlumno(alumno.getId())) {
			service.updateAlumno(alumno);
			response = new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
		} else {
			response = new ResponseEntity<Alumno>(HttpStatus.NO_CONTENT);
		}
				
		return response;
	}
	
	@DeleteMapping("/alumno/{id}")
	public ResponseEntity<Alumno> deleteAlumno(@PathVariable(name="id") int id){
		ResponseEntity<Alumno> response = null;
		if (service.existeAlumno(id)) {
			service.deleteAlumno(id);
			response = new ResponseEntity<Alumno>(HttpStatus.OK);
		} else {
			response = new ResponseEntity<Alumno>(HttpStatus.NO_CONTENT);
		}
				
		return response;
	}
	

}
