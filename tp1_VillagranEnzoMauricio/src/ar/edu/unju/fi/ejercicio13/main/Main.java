package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[8];
		for(int i = 0; i<numeros.length;i++) {
			System.out.println("Ingrese numero: ");
			numeros[i] = sc.nextInt();
		}
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Posicion ["+i+"] = "+numeros[i]);
		}
		sc.close();
	}
	
}
