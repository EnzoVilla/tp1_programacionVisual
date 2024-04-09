package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do
		{
			System.out.println("Ingrese un numero entre 1 y 9: ");
			num = sc.nextInt();
		}while(num < 1 || num > 9); //uso de do while para el control del ingreso de numero entre 1 y 9
		
		for(int i=0; i<=10; i++) //uso de for para la tabla de multiplicar
			System.out.println(num+" X "+i+" = "+(num*i));
		sc.close();
	}

}
