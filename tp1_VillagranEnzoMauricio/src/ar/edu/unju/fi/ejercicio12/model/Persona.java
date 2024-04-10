package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void mostrarPersona() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.printf("Nombre: %s \nFecha de nacimiento: %s \nEdad: %d \nSigno Zodiacal: %s \nEstacion: %s",nombre,sdf.format(fechaNacimiento.getTime()),aniosPersona(),signo(),estacion());          
	}
	public int aniosPersona() {
		Calendar fechaActual = Calendar.getInstance();
		int anios = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		// Si el mes actual es menor que el mes de nacimiento, restar un año
		if (fechaActual.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH)) {
		  anios--;
		}
		return anios;
	}
	public String signo() {
		String signo;
		switch(fechaNacimiento.get(Calendar.MONTH)) {
		case 0:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 19? "Capricornio" : "Acuario";
			break;
		case 1:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 18? "Acuario" : "Piscis";
			break;
		case 2:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 20? "Piscis" : "Aries";
			break;
		case 3:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 19? "Aries" : "Tauro";
			break;
		case 4:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 20? "Tauro" : "Geminis";
			break;
		case 5:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 20? "Geminis" : "Cancer";
			break;
		case 6:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22? "Cancer" : "Leo";
			break;
		case 7:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22? "Leo" : "Virgo";
			break;
		case 8:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22? "Virgo" : "Libra";
			break;
		case 9:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22? "Libra" : "Escorpio";
			break;
		case 10:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21? "Escorpio" : "Sagitario";
			break;
		case 11:
			signo = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21? "Sagitario" : "Capricornio";
			break;
		default:
			signo="";
		}
		return signo;
	}
	public String estacion() {
		String estacion;
		switch(fechaNacimiento.get(Calendar.MONTH)) {
		case 0:
			estacion = "Verano";
			break;
		case 1: 
			estacion = "Verano";
			break;
		case 2:
			estacion = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21? "Verano" : "Otoño";
			break;
		case 3:
			estacion = "Otoño";
			break;
		case 4:
			estacion = "Otoño";
			break;
		case 5:
			estacion = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21? "Otoño" : "Invierno";
			break;
		case 6 :
			estacion = "Invierno";
			break;
		case 7 :
			estacion = "Invierno";
			break;
		case 8:
			estacion = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21? "Invierno" : "Primavera";
			break;
		case 9 :
			estacion = "Primavera";
			break;
		case 10 :
			estacion = "Primavera";
			break;
		case 11:
			estacion = fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21? "Primavera" : "Verano";
			break;
		default:
			estacion="";
		}
		return estacion;
	}
	
	
	
}
