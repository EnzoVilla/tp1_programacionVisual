package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//uso de constructor por defecto
		Persona persona1 = new Persona();
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		persona1.setNombre(nombre);
		System.out.println("Ingrese dni: ");
		String dni = sc.next();
		persona1.setDni(dni);
		System.out.println("Ingrese fecha de nacimiento (año-mes-dia)");
		String fecha = sc.next();
		persona1.setFechaNacimiento(LocalDate.parse(fecha));
		sc.nextLine();
		System.out.println("Ingrese provincia de origen: ");
		String provincia = sc.nextLine();
		persona1.setProvincia(provincia);
		System.out.println(persona1.mostrarDatos());
		
		//usando constructor sobrecargado con provincia asignada "Jujuy" por defecto
		System.out.println("Ingrese nombre: ");
		nombre = sc.nextLine();
		System.out.println("Ingrese dni: ");
		dni = sc.next();
		System.out.println("Ingrese fecha de nacimiento (año-mes-dia)");
		fecha = sc.next();		
		Persona persona2 = new Persona(dni,nombre,LocalDate.parse(fecha));
		System.out.println(persona2.mostrarDatos());		
		
		//usando constructor parametrizado con todas las variables para asignar
		sc.nextLine();
		System.out.println("Ingrese nombre: ");
		nombre = sc.nextLine();
		System.out.println("Ingrese dni: ");
		dni = sc.next();
		System.out.println("Ingrese fecha de nacimiento (año-mes-dia)");
		fecha = sc.next();		
		sc.nextLine();
		System.out.println("Ingrese provincia de origen: ");
		provincia = sc.nextLine();
		Persona persona3 = new Persona(dni,nombre,LocalDate.parse(fecha),provincia);
		System.out.println(persona3.mostrarDatos());
		sc.close();
		
	}

}
