package com.ejemplo.intro;
import java.util.Scanner;
public class MatrizBidimensional_Con_Sus_Diagonales_Ejemplo_del_profesor_23_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Descripci�n del problema por parte del profesor: 4-Desarrollar un programa que permita la carga de n�meros enteros
		 * en una matriz bidimensional cuadrada de 4 columnas por 4 filas
		 * y sacar sus diagonales, la diagonal principal y la secundaria
		 * 
		 */
		
		
		/*Comentario m�o: 
		 * Aqu� os dejo un enlace de  sobre  y 
		 * Aqu� os dejo un enlace  de un v�deo de Youtube donde  
		 * te cuentan qu� es una matriz, sus caracter�sticas y
		 * sus distintas clases: https://www.youtube.com/watch?v=LY3p7Kl84vk                                   Lo explica una profesora de la Universidad Polit�cnica de Valencia.
		 */
		int matriz[][] = new int[4][4];
		Scanner teclado = new Scanner(System.in);
		for(int f=0; f<4;f++) {
			for(int c=0; c<4;c++) {
					System.out.println("Cargue el n�mero");
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
