package com.ejemplo.intro;

import java.util.Scanner;

public class RepasoDeMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matrices unidimendionales
		//Declaración
		String nombres[]= new String[4];
		Scanner teclado = new Scanner(System.in);
		int contadorCarlos=0;
		//Para contar automáticamente el tamaño de la matriz que se está usando y que la recorra entera aunque no sepas su tamaño
		//nombres.length;
		for(int x=1; x < nombres.length;x++) {
			System.out.println("Ingrese el nombre");
			nombres[x] = teclado.next();
			//equalsIgnoreCase para que si introduces la palabra en mayúsculas o minúsculas lo reconozca igualmente
			if(nombres[x].equals("carlos")) {
				contadorCarlos=contadorCarlos+1;
			}
		}
		
		System.out.println("Cantidad de carlos "+contadorCarlos+" Esa es la cantidad");

		/*nombres[0]="Mirta";
		nombres[1]="Álamo";
		nombres[2]="Roble";
		nombres[3]="Clavo";*/

		//nombre.length es igual a poner i<4
		/*for(int i=0;i<4;i++) {
			System.out.println(nombres[i]);
		}*/
		/*
		System.out.println(nombres[2]);
		System.out.println(nombres[2]);
		System.out.println(nombres[2]);
		System.out.println(nombres[2]);
*/
		
	}

}
