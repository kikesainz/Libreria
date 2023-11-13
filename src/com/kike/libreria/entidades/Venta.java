package com.kike.libreria.entidades;


public class Venta {
	Cliente cliente;
	Libro libro;
	int cantidad;

	
	public Venta(Cliente cliente, Libro libro, int cantidad) {
		this.cliente = cliente;
		this.libro = libro;
		this.cantidad = cantidad;
	}
	
	public Venta (Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Venta() {
		
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	public Libro getLibro() {
		return this.libro;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void registraVenta() {
		//Código para registrar una venta
		
		System.out.println("Registrando venta de cliente "+ this.cliente.getNombre() + " del libro: " + libro.getTitulo() + " cantidad: " + this.cantidad);
	}
}
