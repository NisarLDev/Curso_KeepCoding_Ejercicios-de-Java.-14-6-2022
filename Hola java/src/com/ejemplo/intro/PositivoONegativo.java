package com.ejemplo.intro;

import java.util.Scanner;

public class PositivoONegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		valor = teclado.nextInt();
		
		
		if ( valor<0 ) {
			
			System.out.println("El valor es negativo");
		}else if (valor>0) {
			
			System.out.println("El valor es positivo");
		}else if (valor==0) {
	
			System.out.println("El valor es cero");
			}

		}

}
