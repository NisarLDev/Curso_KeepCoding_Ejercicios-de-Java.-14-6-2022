package com.ejemplo.intro;
import java.util.Scanner;

public class ParesImpares1A100_19_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner miScanner = new Scanner(System.in);

		        int numElegido;

		        int numero = 0;

		       

		        do{

		            System.out.println("Pulse 1 para imprimir los números pares o"

		                    + " pulse 2 para imprimir los números impares: ");

		            numElegido = miScanner.nextInt();

		            if(numElegido == 1){

		                while(numero <= 100){

		                    if(numero % 2 == 0){

		                    System.out.println(numero);

		                    }

		                    numero++;

		                }

		            }

		            if(numElegido == 2){

		                while(numero <= 100){

		                    if(numero % 2 != 0) {

		                    System.out.println(numero);

		                    }

		                    numero++;

		                }

		            }

		        }while(numElegido != 1 && numElegido != 2);

		    }

}
