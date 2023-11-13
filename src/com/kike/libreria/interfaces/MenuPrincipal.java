package com.kike.libreria.interfaces;


import java.util.Scanner;

public class MenuPrincipal {

	public void mostrarMenuPrincipal() {

		Integer opcion = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("*********APLICACIÓN GESTIÓN DE LIBRERÍA*********");
			System.out.println("*****************MENÚ PRINCIPAL*****************");
			System.out.println("Introduzca, por favor, la opción que quiere realizar: ");
			System.out.println("1.Gestión de VENTAS");
			System.out.println("2.Gestión de INVENTARIO");
			System.out.println("3.Gestión de DESCUENTOS");
			System.out.println("4.Salir");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				// Mostramos submenú de gestión ventas
				MenuGestionVentas mv = new MenuGestionVentas();
				mv.mostrarMenu();		
				break;
			case 2:
				// Mostramos submenú de gestión de inventario
				MenuGestionInventario mi = new MenuGestionInventario();
				mi.mostrarMenu();
				break;
			case 3:
				// Mostramos submenú Gestión de descuentos
				MenuGestionDescuentos md = new MenuGestionDescuentos();
				md.muestraMenu();
				break;
			case 4:
				// salimos
				System.out.println("Salimos de la aplicación, bye");
				return;
			default:
				System.out.println("Opción incorrecta: El número debe estar comprendido entre 1 y 4");
			}

		} while (opcion != 4);
	}

}
