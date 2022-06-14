package com.ejemplo.intro;

import java.util.Scanner;

public class SueldoDeEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int sueldo[]= new int[10];
				int nota_mayor_igual=0,nota_menor=0;
				
				Scanner teclado = new Scanner(System.in);
						
						for(int i=0; i<sueldo.length;i++) {
							System.out.println("Ingrese el sueldo del empleado"+(i+1));
							sueldo[i]=teclado.nextInt();
							
							if(sueldo[i] >= 100 && sueldo [i]<=300) {
								nota_mayor_igual=nota_mayor_igual+1;
								
							}else if(sueldo[i] >= 300 && sueldo [i]<=500) {
								nota_menor= nota_menor+1;
							}
							

						}
						
						System.out.println("La nota es menor a 7 "+"El número de alumnos es "+nota_menor);
						System.out.println("La nota es mayor a 7 "+"El número de alumnos es "+nota_mayor_igual);
				
			}


		
		
	}

