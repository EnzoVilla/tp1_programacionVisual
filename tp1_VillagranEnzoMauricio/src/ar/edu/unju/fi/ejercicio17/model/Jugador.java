package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;




public class Jugador {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	private LocalDate fechaNacimiento;
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	public Jugador(String nombre, String apellido, String nacionalidad, float estatura, float peso, String posicion,
			LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
		this.fechaNacimiento = fechaNacimiento;
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int calcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period period = Period.between(fechaNacimiento,hoy);
		return period.getYears();
	}
	@Override
	public String toString() {
		return "------- JUGADOR -------\nNombre: " + nombre + " - Apellido: " + apellido + "\nNacionalidad: " + nacionalidad + "\nEstatura: "
				+ estatura + " m - Peso: " + peso + " kg \nPosicion: " + posicion + "\nFecha de nacimiento: " + fechaNacimiento + " - Edad: "+calcularEdad()+" años";
	}
}
