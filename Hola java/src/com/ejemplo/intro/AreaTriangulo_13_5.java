package com.ejemplo.intro;
import java.util.Scanner;

public class AreaTriangulo_13_5 {

	public static void main(String[] args) {
		// C�digo principal
		
		float area_triangulo = 0;
		int base = 0;
		int altura = 0;
		//Llamada al teclado
		Scanner teclado = new Scanner(System.in);
		//Ingresar la base del tri�ngulo
		System.out.print("Ingrese la base del tri�ngulo ");
		//asignar la base a la entrada del teclado
		base = teclado.nextInt();
		//Ingrese la base a la entrada del teclado
		System.out.print("Ingrese el �rea del tri�ngulo ");
		//asignar la altura a la entrada del teclado
		altura = teclado.nextInt();
		// F�rmula de c�lculo del tri�ngulo
		area_triangulo = (base*altura)/2;
		// F�rmula de c�lculo del tri�ngulo como n�mero real decimal
		area_triangulo = (float)(base*altura)/2;	
		//Salida del resutado de la f�rmula
        System.out.println("El �rea del tri�ngulo es igual a "+area_triangulo);
  
	}

}
