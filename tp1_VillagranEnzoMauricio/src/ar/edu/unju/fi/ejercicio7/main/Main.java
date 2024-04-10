package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese legajo del empleado: ");
		String legajo = sc.nextLine();
		System.out.println("Ingrese salario: ");
		float salario = Float.parseFloat(sc.next());
		//parseFloat para transformarlo a tipo float
		Empleado empleado1 = new Empleado(nombre,legajo,salario);
		empleado1.mostrarDatosEmpleado();
		empleado1.darAumento();
		empleado1.mostrarDatosEmpleado();
		sc.close();
	}

}
