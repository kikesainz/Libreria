package com.kike.libreria.interfaces;

import java.util.Scanner;

import com.kike.libreria.entidades.Cliente;
import com.kike.libreria.entidades.Libro;
import com.kike.libreria.utils.UtilidadesCreacionObjetos;

public class MenuGestionDescuentos {

	public void muestraMenu() {

		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("****Submenú de cálculo de descuentos****");
		System.out.println("*******Teclee la opción que desee*******");
		System.out.println("1.Calcular descuento");
		System.out.println("2.Salir");

		opcion = Integer.parseInt(sc.nextLine());

		switch (opcion) {
		case 1:
			Libro libro = UtilidadesCreacionObjetos.crearLibro(sc);
			Cliente cliente = UtilidadesCreacionObjetos.crearCliente(sc);

//			float descuento = libro.calculaDescuento(cliente);

			System.out.println("El descuento para el cliente " + cliente.getNombre() + " y el libro "
					+ libro.getTitulo() + " es " + libro.calculaDescuento(cliente));
			break;
		case 2:
			return;
		default:
			System.out.println("Opción incorrecta: Debe teclear un número comprendido entre 1 y 2.");
		}

	}

}
