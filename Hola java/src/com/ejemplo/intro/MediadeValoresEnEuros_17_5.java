package com.ejemplo.intro;

import java.util.Scanner;

public class MediadeValoresEnEuros_17_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, n4, n5, promedio;        
        Scanner obj = new Scanner(System.in);
 
        System.out.print("Valor 1:\t");
        n1 = obj.nextDouble();      
 
        System.out.print("Valor 2:\t");
        n2 = obj.nextDouble();
 
        System.out.print("Valor 3:\t");
        n3 = obj.nextDouble();
 
        System.out.print("Valor 4:\t");
        n4 = obj.nextDouble();      
 
        System.out.print("Valor 5:\t");
        n5 = obj.nextDouble();
 
        promedio = ((n1+n2+n3+n4+n5)/5);
 
        System.out.println("Promedio en € de los cinco valores introducidos:\t"+promedio);
	}

}
