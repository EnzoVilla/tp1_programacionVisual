package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidadElementos;
		do {
			System.out.println("Ingrese un numero entre 3 y 10: ");
			cantidadElementos = sc.nextInt();
		}while(cantidadElementos <3 || cantidadElementos > 10); // controla que los numeros esten en el rango
		int[] numeros = new int[cantidadElementos];
		int suma = 0;
		for(int i = 0; i<numeros.length;i++) {
			System.out.println("Ingrese numero: ");
			numeros[i] = sc.nextInt();
			suma += numeros [i];
		}
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Posicion ["+i+"] = "+numeros[i]);
		}
		System.out.println("Total suma de todos los elementos: "+suma);
		sc.close();
	}

}
