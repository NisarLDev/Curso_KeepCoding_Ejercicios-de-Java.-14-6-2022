package com.ejemplo.intro;

import java.util.Scanner;
public class Ejercicio3CalculoDeProductoComprado_13_5 {

	public static void main(String[] args) {
		
		int cantidad;
		double precio, total;
		// Invocar la clase Scanner
		Scanner teclado = new Scanner(System.in);
		// cargando valor a la variable precio
		System.out.print("Ingrese el precio del artículo");
		precio = teclado.nextDouble();
		//cargando valor a la variable cantidad por teclado
		System.out.print("Ingrese la cantidad del artículo a comprar");
		cantidad = teclado.nextInt();
		//asignar valor a la variable total
		total = precio*cantidad;
		//mostrar el resultado
		System.out.print("El total a pagar es "+total);
		System.out.print(" Gracias por comprar en nuestro establecimiento " + "Vuelva de nuevo");

		}

	

}
