package ap.utn.grupo6;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombrex, String apellidox) {
		this.nombre = nombrex;
		this.apellido = apellidox;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
}
