package com.ejemplo.intro;

public class RepasoEstructurasRepetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Estructuras repetitivas
		//While o mientras
		//Cuenta del 1 al 100
		int x=1;
		while (x<=100) {
			System.out.println(x);
			//estructura de control x=x+1;
			x=x+1;
		}
		//Do While o mientras que
		int y=1;
		do {
			System.out.println("Esto es Do While"+y);
			//Estructura de control	y=y+1; o y++ // no poner y=y++; si no quieres que sea infinito
			y=y+1;
		} while (y<=100);
		// Estructura repetitiva for o para
		/*Explicación de Rolando: El ciclo for permite ejecutar
		 * un conjunto de sentencias un número
		 * fijo de veces. Este ciclo se lo
		 * utiliza cuando sabemos el número de veces que se debe ejecutar el
		 * ciclo*/
		// Estructuras de control equivalentes i=i+1; i+=1; i++; //
		int f;
		for(f=1;f<=100;f++) {
			System.out.println("Esto es una repetición de tipo for"+f);
			
			
		}
	}

}
