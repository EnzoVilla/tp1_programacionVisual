package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fechaNacimiento = Calendar.getInstance();
		Persona persona = new Persona();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		persona.setNombre(sc.nextLine());
		System.out.println("Año de nacimiento:");
		int anio = sc.nextInt();
		System.out.println("Mes de nacimiento:");
		int mes = sc.nextInt();
		System.out.println("Dia de nacimiento:");
		int dia = sc.nextInt();
		fechaNacimiento.set(anio, mes, dia);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.mostrarPersona();
		sc.close();
	}

}
