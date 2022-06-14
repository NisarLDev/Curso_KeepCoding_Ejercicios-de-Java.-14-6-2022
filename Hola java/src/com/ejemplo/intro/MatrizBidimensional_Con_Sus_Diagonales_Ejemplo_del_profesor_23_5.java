package com.ejemplo.intro;
import java.util.Scanner;
public class MatrizBidimensional_Con_Sus_Diagonales_Ejemplo_del_profesor_23_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Descripción del problema por parte del profesor: 4-Desarrollar un programa que permita la carga de números enteros
		 * en una matriz bidimensional cuadrada de 4 columnas por 4 filas
		 * y sacar sus diagonales, la diagonal principal y la secundaria
		 * 
		 */
		
		
		/*Comentario mío: 
		 * Aquí os dejo un enlace de  sobre  y 
		 * Aquí os dejo un enlace  de un vídeo de Youtube donde  
		 * te cuentan qué es una matriz, sus características y
		 * sus distintas clases: https://www.youtube.com/watch?v=LY3p7Kl84vk                                   Lo explica una profesora de la Universidad Politécnica de Valencia.
		 */
		int matriz[][] = new int[4][4];
		Scanner teclado = new Scanner(System.in);
		for(int f=0; f<4;f++) {
			for(int c=0; c<4;c++) {
					System.out.println("Cargue el número");
					matriz[f][c]=teclado.nextInt();
				}
		}
		for(int f=0;f<4;f++) {
			for(int c=0;c<4;c++) {
				
				if(f == c) {
					System.out.println("diagonal-principal:"+matriz[f][c]);
				}
				{
				if(f+c ==4-1) {
					System.out.println("diagonal-secundaria:"+matriz[f][c]);
				}
				
			}
				
			}
		
		}
			
	}
}
