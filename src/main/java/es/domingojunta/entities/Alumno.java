package es.domingojunta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alumno {

	@Id
	@GeneratedValue
	private int id;
	
	private String nombre;
	private String apellidos;
	private String curso;
	
	//Getters and Setters
	//Constructores
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno(String nombre, String apellidos, String curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
	}
	
	
	
	
}
