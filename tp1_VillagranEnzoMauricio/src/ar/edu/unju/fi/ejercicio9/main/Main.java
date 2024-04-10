package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<=3;i++) 
		{
			Producto producto = new Producto();
			System.out.println("\nIngrese nombre del producto: ");
			producto.setNombre(sc.nextLine());
			System.out.println("Ingrese codigo del producto: ");
			producto.setCodigo(sc.nextLine());
			System.out.println("Ingrese precio del producto: ");
			producto.setPrecio(Float.parseFloat(sc.next()));
			do {
				System.out.println("Ingrese porcentaje de descuento: (entre 0 y 50)");
				producto.setDescuento(sc.nextByte());
			}while(producto.getDescuento()<0 || producto.getDescuento()>50);
			System.out.printf("\nNombre Producto: %s \nCodigo: %s \nPrecio: $%,.2f \nDescuento: %d %% \nPrecio con descuento aplicado: $%,.2f"
			,producto.getNombre(),producto.getCodigo(),producto.getPrecio(),producto.getDescuento(),producto.calcularDescuento());
			sc.nextLine();
		}
		sc.close();
	}

}
