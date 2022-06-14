package com.ejemplo.calculadora;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 double n1,n2;
		 String operacion;
        Scanner teclado =new Scanner(System.in);

		System.out.println("Ingrese el primer número");
		n1 = teclado.nextDouble();
		System.out.println("Ingrese el segundo número");
		n2 = teclado.nextDouble();
		
		System.out.println("Ingrese el signo de la operacion");
		operacion = teclado.next();
		Calculadora calculadora = new Calculadora(n1,n2,operacion);
		
	}

}
