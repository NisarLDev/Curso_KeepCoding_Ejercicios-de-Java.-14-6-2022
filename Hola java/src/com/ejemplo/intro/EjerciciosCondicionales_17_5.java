package com.ejemplo.intro;

import java.util.Scanner;

public class EjerciciosCondicionales_17_5 {

	public static void main(String[] args) {
		/* Declarar e ingresar dos valores numéricos distintos.
		* cuál de los dos valores es mayor y mostrarlo en la pantalla
		*/
		//declara las variables antes de usarlas
		int num1,num2;
		
		//entrada de datos
		Scanner teclado = new Scanner(System.in);
		
		
		//cargar los datos por teclado
		System.out.println("Ingrese el primer número");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo número");
		num2 = teclado.nextInt();
		
		if (num1==num2) {
			System.out.println("Los valores son iguales");
			
			
		} else if (num1>num2) {
			System.out.println("El primer valor es el mayor ");
			
			
		} else if (num1<num2) {
			System.out.println("El segundo valor es el mayor ");
			
			
		}
			
	}

}
