package com.ejemplo.intro;

import java.util.Scanner;

public class Ejercicios2Calculadora_13_5 {

	public static void main(String[] args) {
	int resta,suma,multiplicacion,division,a=10,b=5;
	resta= a-b;
	suma= a+b;
	multiplicacion= a*b;
	division= a/b;
		
	Scanner teclado = new Scanner(System.in);
	//suma y asignaci�n 
	System.out.println("La suma de a mas b es igual a: "+suma);
	//
	
	//resta y asignaci�n
	System.out.println("La resta de a mas b es igual a: "+resta);	
	//
	// multiplicaci�n y asignaci�n
	System.out.println("La multiplicaci�n de a mas b es igual a: "+multiplicacion);
	//
	// divisi�n y asignaci�n
	System.out.println("La divisi�n de a mas b es igual a: "+division);
	}

}
