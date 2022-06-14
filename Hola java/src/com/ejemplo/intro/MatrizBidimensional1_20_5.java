package com.ejemplo.intro;

import java.util.Scanner;

public class MatrizBidimensional1_20_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarando la matriz
		String nombres[][];
		//Dándole tamaño a la matriz
		nombres = new String[3][2];
		
		Scanner teclado = new Scanner(System.in);
		
		for(int f=0; f<3;f++) {
			for(int c=0; c<2;c++) {
				System.out.println("Cargue el nombre");
				nombres[f][c]= teclado.next();

			}
		}
		/*nombres[0][0]="María ";
		nombres[0][1]="Juana ";
		nombres[1][0]="Pepe ";
		nombres[1][1]="Luis ";
		nombres[2][0]="Enrique ";
		nombres[2][1]="Óscar ";	
		*/
		for(int f=0; f<3;f++) {
			for(int c=0; c<2;c++) {
			System.out.println(nombres[f][c]);
		} 
	}

	}
}