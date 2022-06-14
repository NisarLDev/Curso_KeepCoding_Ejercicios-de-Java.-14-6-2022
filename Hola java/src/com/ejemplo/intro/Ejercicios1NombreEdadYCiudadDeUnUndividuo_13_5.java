package com.ejemplo.intro;

import java.util.Scanner;

public class Ejercicios1NombreEdadYCiudadDeUnUndividuo_13_5 {

	public static void main(String[] args) {
		//declaro una variable mensaje como String (Cadena)
		String mensaje;
		String nombre;
		int edad;
		String ciudad;
		// Entrada de datos
		Scanner teclado = new Scanner(System.in);
		//mensaje = teclado.next();
		System.out.print("Escriba su nombre ");
		nombre = teclado.next();
		/* a tener en cuenta el método next()
		 es solo para satos de tipo String (Cadena), y nextInt()
		 para entero y otros tipos de variables*/
		System.out.print("y su edad ");
		edad = teclado.nextInt();
		System.out.print("y su ciudad ");
		ciudad = teclado.next();
		//salida de información
		System.out.print("Hola, mi nombre es : "+nombre+" Mi edad es la siguiente "+edad+" Mi ciudad es "+ciudad);
	}

}