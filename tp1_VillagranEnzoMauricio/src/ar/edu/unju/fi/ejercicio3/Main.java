package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numSolicitado = sc.nextInt();
		System.out.println("Numero ingresado: "+numSolicitado);
		if (numSolicitado % 2 == 0)
			System.out.println("Es par \nResultado: "+(numSolicitado*3));
		else 
			System.out.println("Es impar \nResultado: "+(numSolicitado*2));
		sc.close();
	}

}
