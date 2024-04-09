package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=-1,fac=1; //num=-1 para que pueda ingresar sin problemas al while 
		while(num < 0 || num > 10)
		{
			System.out.println("Ingrese numero para determinar su factorial: (Entre 0 y 10) ");
			num = sc.nextInt();
		}
		if(num == 0)
			System.out.println("Factorial: "+fac);
		else
		{
			while(num != 1) 
			{
				fac=fac*num;
				num --;
			}
			System.out.println("Factorial: "+fac);
		}
		sc.close();
	}

}
