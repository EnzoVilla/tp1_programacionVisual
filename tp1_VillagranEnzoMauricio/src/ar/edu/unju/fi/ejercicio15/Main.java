package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cantidadElementos;
		do {
			System.out.println("Ingrese un numero entre 5 y 10: ");
			cantidadElementos = scanner.nextInt();
		}while(cantidadElementos <5 || cantidadElementos > 10); // control de rango
		scanner.nextLine();
		String[] nombres = new String[cantidadElementos];
		int i;
		for( i = 0; i<nombres.length;i++) {
			System.out.println("Ingrese nombre: ");
			nombres[i] = scanner.nextLine();
		}
		System.out.println("Ascendente: ");
		for( i=0;i<nombres.length;i++) {
			System.out.println("Posicion ["+i+"] = "+nombres[i]);
		}
		System.out.println("Descendente: ");
		for(i=nombres.length-1;i>=0;i--) {
			System.out.println("Posicion ["+i+"] = "+nombres[i]);
		}
		scanner.close();
	}

}