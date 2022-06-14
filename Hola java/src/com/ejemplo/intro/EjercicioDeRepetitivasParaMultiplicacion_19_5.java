package com.ejemplo.intro;

import java.util.Scanner;

public class EjercicioDeRepetitivasParaMultiplicacion_19_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número");
		numero = teclado.nextInt();
		for (int i = 2; i <= 1000; i++) {
			
			System.out.println(numero+" X "+i+"="+(numero*i));
		} */
		
		// for anidado
		int cantidad_tablas;
		// while para finalizar el programa
		String finalizar;
		boolean programa = true;
		while(programa) {
			//
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese el límite de la tabla de multiplicar");
			cantidad_tablas = teclado.nextInt();
			
			for (int i = 1; i <=cantidad_tablas ; i++) {
				System.out.println("La tabla de "+i);
				
				for (int y = 1; y <= 5; y++) {
					
					System.out.println(y+"x"+i+"="+(i*y));
				}
			}
			
			System.out.println("Quieres continuar s/n");
			finalizar = teclado.next();
			if(finalizar.equals("n")) {
				programa = false;
			System.out.println("Programa finalizado");
			}
}
	}
	}
/*
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int numero;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese un número");
	numero = teclado.nextInt();
	for (int i = 2; i <= 1000; i++) {
		
		System.out.println("2 X "+i+"="+(2*i));
	}
	
}

} */