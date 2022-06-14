package com.ejemplo.intro;
import java.util.Scanner;
public class Calculadora_18_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,suma,resta,multiplicacion,division;
		String simbolo;
		
		
	        // hay un next para cada tipo de variable,cuando es simbolo 
	         // por ejemplo es next solo
	       

	   
        //suma de variables
        Scanner teclado =new Scanner(System.in);
        System.out.println("ingrese numero");
        a = teclado.nextInt();
        System.out.println("ingrese numero");
        b = teclado.nextInt();

        suma = a+b;
        System.out.println("Ingrese la operación; +,-,*,/");
        simbolo = teclado.next();

        
        if(simbolo.equals("+")) {
        	System.out.println("La suma es: "+(a+b));
        }else if(simbolo.equals("-")) {
        	System.out.println("La resta es: "+(a-b));
        }else if(simbolo.equals("*")) {
        	System.out.println("La multuplicación es: "+(a*b));
        }else  {
        	System.out.println("No ingresó ningún símbolo");
        }
	}

}
