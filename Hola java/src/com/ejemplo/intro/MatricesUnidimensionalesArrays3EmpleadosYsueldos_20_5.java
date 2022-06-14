package com.ejemplo.intro;

import java.util.Scanner;

public class MatricesUnidimensionalesArrays3EmpleadosYsueldos_20_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,sueldoMayor=0,sueldoMenor=0;
		double sueldos[];
		double totalSueldo=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de empleados");
		n = teclado.nextInt();
		
		sueldos = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Ingrese el sueldo de los empleados"+i);
			sueldos[i]=teclado.nextDouble();
			
			if(sueldos[i]>=100 && sueldos[i] <= 300) {
				sueldoMenor++;
			}else if(sueldos[i]>300) {
				sueldoMayor++;
				
			}
			totalSueldo = totalSueldo+sueldos[i];
		}
		System.out.println("Cantidad de empleados que cobran de sueldo entre 100 y 300 € son "+sueldoMenor);
		System.out.println("Cantidad de empleados que cobran de sueldo entre 300 y 500 € son "+sueldoMayor);

		System.out.println("El total del sueldo a pagar es "+totalSueldo+" €");
	}
	

}
