package com.kike.libreria.interfaces;

import java.util.Scanner;

import com.kike.libreria.entidades.Libro;
import com.kike.libreria.modelo.LibroDAO;
import com.kike.libreria.utils.UtilidadesCreacionObjetos;

public class MenuGestionInventario {
	
	public void mostrarMenu() {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		do{
			
			System.out.println("*******Menú Gestión de inventario*******");
			System.out.println("Indique la operación a realizar:");
			System.out.println("1.Introducir libros");
			System.out.println("2.Borrar libro");
			System.out.println("3.Salir");
					
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 1:
				insertarLibro(sc);			
				
				break;
			case 2:
				borrarLibro(sc);
				break;
			case 3: 
				System.out.println("Volviendo a menú principal");
				return;
			default:
				System.out.println("Opción incorrecta, la elección debe ser entre 1 y 3");
			}
			
			
			
		}while (opcion != 3);
		
	}

	private void borrarLibro(Scanner sc) {
		Libro libro = UtilidadesCreacionObjetos.crearLibro(sc);
		LibroDAO libroDAO = new LibroDAO();
		libroDAO.borrarLibro(libro);
	}

	private void insertarLibro(Scanner sc) {
		Libro libro = UtilidadesCreacionObjetos.crearLibro(sc);
		
		System.out.println("Introduzca la cantidad de libros a insertar en el inventario:");
		int cantidad = Integer.parseInt(sc.nextLine());
						
		LibroDAO libroDAO = new LibroDAO();
		libroDAO.insertarLibros(libro, cantidad);
	}



}
