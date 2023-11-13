package com.kike.libreria.entidades;

public class Libro {
	private String titulo;
	private String autor;
	private float precio;
	
	public Libro(String titulo, String autor, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float getPrecio() {
		return this.precio;
	}

	public float calculaDescuento(Cliente cliente) {

		if (cliente.esVip())
			return this.precio * 0.8f;

		return this.precio;

	}
	
//	public float convertirEurosADolares(float euros) {
//		return euros * 1.2f;
//	}
}
