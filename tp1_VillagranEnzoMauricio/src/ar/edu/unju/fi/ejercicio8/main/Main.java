package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		System.out.println("Ingrese valor para calcular sumatoria y productoria: ");
		int n = sc.nextInt();
		calculadora.setN(n);
		System.out.println("Valor ingresado: "+calculadora.getN());
		System.out.println("Sumatoria:"+calculadora.calcularSumatoria());
		System.out.println("Productoria: "+calculadora.calcularProductoria());
		sc.close();
	}

}
