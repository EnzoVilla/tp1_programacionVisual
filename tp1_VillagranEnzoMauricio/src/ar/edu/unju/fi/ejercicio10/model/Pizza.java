package ar.edu.unju.fi.ejercicio10.model;
public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingredientesEspeciales;
	final int ESPECIAL_20 = 500;
	final int ESPECIAL_30 = 750;
	final int ESPECIAL_40 = 1000;
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	public int calcularPrecio() {
		int precio;
		switch(diametro) {
		 case 20:
			 precio = ingredientesEspeciales == true ? 4500+ESPECIAL_20 : 4500;
			 break;
		 case 30:
			 precio = ingredientesEspeciales == true ? 4800+ESPECIAL_30 : 4800;
			 break;
		 case 40:
			 precio = ingredientesEspeciales == true ? 5500+ESPECIAL_40 : 5500;
			 break;
		 default:
			 precio = 0;
		}
		 return precio;
	}
	public double calcularArea() {
		double radio = diametro / 2;
		return Math.PI*Math.pow(radio, 2);
	}
	
}
