package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private String legajo;
	private float salario;
	final float SALARIO_MINIMO=210000.00f;
	final float AUMENTO_MERITO=20000.00f;
	public Empleado(String nombre, String legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= SALARIO_MINIMO)
			this.salario = salario;
		else
			this.salario = SALARIO_MINIMO;
	}
	public void mostrarDatosEmpleado()
	{
		System.out.printf( "\nNombre del empleado: %s \nLegajo: %s \nSalario $: %,.2f",nombre,legajo,salario);
		//uso del printf: %,(indica separador de miles).(indica punto decimal) 
		// 2f(indica un numero con coma flotante de 2 dijitos de precision)
	}
	public void darAumento() {
		this.salario += AUMENTO_MERITO;
	}
}
