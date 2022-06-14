package com.ejemplo.intro;
import java.util.Scanner;

public class AreaTriangulo_13_5 {

	public static void main(String[] args) {
		// Código principal
		
		float area_triangulo = 0;
		int base = 0;
		int altura = 0;
		//Llamada al teclado
		Scanner teclado = new Scanner(System.in);
		//Ingresar la base del triángulo
		System.out.print("Ingrese la base del triángulo ");
		//asignar la base a la entrada del teclado
		base = teclado.nextInt();
		//Ingrese la base a la entrada del teclado
		System.out.print("Ingrese el área del triángulo ");
		//asignar la altura a la entrada del teclado
		altura = teclado.nextInt();
		// Fórmula de cálculo del triángulo
		area_triangulo = (base*altura)/2;
		// Fórmula de cálculo del triángulo como número real decimal
		area_triangulo = (float)(base*altura)/2;	
		//Salida del resutado de la fórmula
        System.out.println("El área del triángulo es igual a "+area_triangulo);
  
	}

}
