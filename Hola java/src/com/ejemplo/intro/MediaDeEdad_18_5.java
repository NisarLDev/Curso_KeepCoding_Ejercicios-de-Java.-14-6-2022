package com.ejemplo.intro;

import java.util.Scanner;

public class MediaDeEdad_18_5 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n1, n2, n3, promedio;        
		        Scanner obj = new Scanner(System.in);
		 
		        System.out.print("Edad de la primera persona:\t");
		        n1 = obj.nextInt();      
		 
		        System.out.print("Edad de la segunda persona:\t");
		        n2 = obj.nextInt();
		 
		        System.out.print("Valor edad de la tercera persona:\t");
		        n3 = obj.nextInt();
		 
		        promedio = ((n1+n2+n3)/3);
		 
		        System.out.println("Promedio de edad de las tres personas:\t"+promedio);
			}

		}

