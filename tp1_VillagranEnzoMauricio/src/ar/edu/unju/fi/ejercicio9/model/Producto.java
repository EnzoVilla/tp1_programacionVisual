package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	private byte descuento;
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public byte getDescuento() {
		return descuento;
	}
	public void setDescuento(byte descuento) {
		this.descuento = descuento;
	}
	public float calcularDescuento() {
		if (descuento > 0) 
			return precio-(precio*descuento/100);
		else
			return precio;
	}

} // 1125
