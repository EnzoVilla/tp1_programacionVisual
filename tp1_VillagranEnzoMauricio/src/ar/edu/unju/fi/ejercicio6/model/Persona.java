package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;
public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento; 
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int calcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, hoy);
    	return periodo.getYears();
	}
	public boolean mayorEdad() { 
		return calcularEdad()>= 18;
	}
	public String mostrarDatos() {
		int edad = calcularEdad();
		boolean mayor = mayorEdad();
		String esMayorMenor = mayor == true? " es mayor de edad":" es menor de edad"; //uso de operador ternario
		return "DATOS: \nDNI: " + dni + "\nNombre: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento + "\nProvincia: "
				+ provincia + "\nEdad: " + edad + "\n"+nombre+esMayorMenor;
	}
	
	
}
