package com.ejemplo.intro;
import java.util.Scanner;

public class Condicional_17_5 {

	public static void main(String[] args) {
		int a = 10, b = 5;
		Scanner teclado = new Scanner(System.in);
		// while para finalizar el programa
				String finalizar;
				boolean programa = true;
				while(programa) {
		
		if(a>=b) {
			
			System.out.println("Ingresa a este código");
		}
		
		//Condicional anidada if else if
		if (a==b) {
			
			System.out.println("a es igual a b");
		}else if(a>b) {
			
			System.out.println("a es mayor que b");

		}else if(a<b) {
			
			System.out.println("a es menor que b");

		}else  {
			
			System.out.println("Si no se cumple ninguna de las condiciones anteriores");

		}
		
		//Condicional múltiple usando switch 
		int dia;
		dia = 2;
		switch (dia) {
		case 1: {
			System.out.println("Hoy es lunes");
			break;
		}
		case 2: {
			System.out.println("Hoy es martes");
			break;
		}
		case 3: {
			System.out.println("Hoy es miércoles");
			break;
		}
		default:
			System.out.println("Hoy no es ninguno de los días predefinidos");
			break;
		}
	
		System.out.println("Quieres continuar s/n");
		finalizar = teclado.next();
		if(finalizar.equals("n")) {
			programa = false;
		}
		}
		System.out.println("Programa finalizado");
	
	
	}
	
	
}
