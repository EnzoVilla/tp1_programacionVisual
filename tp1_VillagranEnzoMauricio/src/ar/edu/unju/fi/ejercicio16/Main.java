package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] nombres = new String [5];
		int i;
		for(i=0; i<nombres.length;i++) {
			System.out.println("Ingrese nombre: ");
			nombres[i]=sc.nextLine();
		}
		mostrar(nombres);
		System.out.println("Cantidad de elementos: "+nombres.length);
		int largo = nombres.length - 1;
		System.out.println("Ingrese la posicion a eliminar (entre 0 y 4)");
		byte j = sc.nextByte();
		do {
			if(j==largo) {
				nombres[largo]="";
				j++;
			}else {
				nombres[j]=nombres[j+1];
				j++;
			}
		} while(j<=largo);
		mostrar(nombres);
		sc.close();
	}
	public static void mostrar(String[] nombres) {
		int i=0;
		while(i<nombres.length) {
			System.out.println("Posicion ["+i+"] = "+nombres[i]);
			i++;
		}
	}
}
