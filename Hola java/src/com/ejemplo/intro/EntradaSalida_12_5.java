package com.ejemplo.intro;

import java.util.Scanner;

public class EntradaSalida_12_5 {

	public static void main(String[] args) {
		//declaro una variable mensaje como String (Cadena)
		String mensaje;
		String nombre;
		String edad;
		// Entrada de datos
		Scanner teclado = new Scanner(System.in);
		//mensaje = teclado.next();
		System.out.print("Escriba su nombre ");
		/* a tener en cuenta el método next()
		 es solo para satos de tipo String (Cadena), y nextInt()
		 para entero y otros tipos de variables*/
		System.out.print("y su edad ");
		nombre = teclado.next();
		edad = teclado.next();

		//salida de información
		System.out.print("Hola, mi nombre es : "+nombre+" Mi edad es la siguiente "+edad);
	}

}
