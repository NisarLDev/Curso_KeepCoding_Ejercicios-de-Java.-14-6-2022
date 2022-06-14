package com.ejemplo.intro;

import java.util.Scanner;

public class NotaAlumnosEjemploProfesor1_19_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notas[]= new int[10];
		int nota_mayor_igual=0,nota_menor=0;
		
		Scanner teclado = new Scanner(System.in);
				
				for(int i=0; i<notas.length;i++) {
					System.out.println("Ingrese la nota de los alumno"+(i+1));
					notas[i]=teclado.nextInt();
					
					if(notas[i] >= 7) {
						nota_mayor_igual=nota_mayor_igual+1;
						
					}else if(notas[i]<7) {
						nota_menor= nota_menor+1;
					}
					

				}
				
				System.out.println("La nota es menor a 7 "+"El número de alumnos es "+nota_menor);
				System.out.println("La nota es mayor a 7 "+"El número de alumnos es "+nota_mayor_igual);
		
	}

}
