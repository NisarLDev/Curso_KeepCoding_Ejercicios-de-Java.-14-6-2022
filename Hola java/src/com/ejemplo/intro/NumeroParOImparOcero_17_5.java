package com.ejemplo.intro;

import java.util.Scanner;

public class NumeroParOImparOcero_17_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;

				//entrada de datos
				Scanner teclado = new Scanner(System.in);
				
				
				//cargar los datos por teclado
				System.out.println("Ingrese el número");
				num1 = teclado.nextInt();
				
				if (num1==0) {
		        	 System.out.println("El número es cero");
		        	} else if ((num1 % 2) == 0){
		        		System.out.println(num1 + " es par");
		        	}else {
		        		System.out.println(num1 + " es impar");
		            
		        }
		
	}

}