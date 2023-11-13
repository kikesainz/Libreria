package com.kike.libreria.interfaces;


import java.util.Scanner;

import com.kike.libreria.entidades.Cliente;
import com.kike.libreria.entidades.Libro;
import com.kike.libreria.entidades.Venta;
import com.kike.libreria.utils.UtilidadesCreacionObjetos;

public class MenuGestionVentas {
	
	public void mostrarMenu() {
		
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("***************************************");
			System.out.println("*******Menú de Gestión de Ventas*******");
			System.out.println("****Indique la operación a realizar****");
			System.out.println("***************************************");
			
			System.out.println("1.Hacer una venta.");
			System.out.println("2.Salir");
			
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
			case 1:
				realizarVenta(sc);				
				
				break;
			case 2:
				//salimos
				System.out.println("Volvemos al menú principal");
				return;
			default:
				System.out.println("Opcion incorrecta: Las opciones válidas son entre 1 y 2");
			}
		} while (opcion !=2);
		
	}

	private void realizarVenta(Scanner sc) {
		//Hacemos una venta
		Cliente c = UtilidadesCreacionObjetos.crearCliente(sc);

		
		Libro l = UtilidadesCreacionObjetos.crearLibro(sc);
		
		System.out.println("Dígame la cantidad de libros a comprar:");
		int cantidad = sc.nextInt();
		sc.nextLine();
		
		Venta venta = new Venta(c, l, cantidad);
		venta.registraVenta();
	}



}
