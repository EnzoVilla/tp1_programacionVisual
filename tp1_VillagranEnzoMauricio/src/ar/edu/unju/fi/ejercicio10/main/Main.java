package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 1 ; i <= 3 ; i++) {
			Pizza pizza = new Pizza();
			do {
				System.out.println("\nIngrese diametro de la pizza (20,30,40 unicamente)");
				pizza.setDiametro(sc.nextInt());
			}while(pizza.getDiametro() != 20 && pizza.getDiametro() != 30 && pizza.getDiametro() != 40);
			System.out.println("Desea ingresar ingredientes especiales: (true - false)");
			pizza.setIngredientesEspeciales(sc.nextBoolean());
			System.out.printf("** PIZZA %d ** \nDiametro = %d \nIngredientes especiales = %b \nPrecio Pizza = %d$ \nArea de la pizza = %f"
					,i,pizza.getDiametro(),pizza.isIngredientesEspeciales(),pizza.calcularPrecio(),pizza.calcularArea());
		}
		sc.close();
	}

}
