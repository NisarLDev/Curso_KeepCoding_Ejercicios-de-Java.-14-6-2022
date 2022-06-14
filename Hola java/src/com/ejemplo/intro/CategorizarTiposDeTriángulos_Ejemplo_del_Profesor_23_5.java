package com.ejemplo.intro;

import java.util.Scanner;

public class CategorizarTiposDeTriángulos_Ejemplo_del_Profesor_23_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		
		int triangulos[];
		int cantidad_triangulos,contadorIsosceles=0,contadorEquilatero=0,contadorEscaleno=0, MenorCantidaddeTriangulos=0;
		
		//Carga del número de triángulos que hay que evaluar
		System.out.println("¿Cuántos triángulos quieres?");
		
		//Variable "cantidad_triangulos" asociada a la entrada del teclado
		cantidad_triangulos = teclado.nextInt();
		
		//Matriz bidimensional de los trialgulos declarada
		triangulos = new int[3];
		
		
		// For que representa la cantidad de los triángulos
		for(int i= 0;i<cantidad_triangulos;i++) {
			//For que carga la cantidad de los lados de los triángulos
			for (int c=0;c<3;c++) {
				System.out.println("Cargue el lado del triángulo "+c);
				triangulos[c]=teclado.nextInt();		
			}
			//Condición If para contar los triángulos Equiláteros
			if( triangulos[0]==triangulos[1] && triangulos[0]==triangulos[2] ) {
				contadorEquilatero++;
			}
			//Condición If para contar los triángulos Escalenos

			if(triangulos[0] != triangulos[1] && triangulos[0] != triangulos[2]) {
				contadorEscaleno++;
			}
			//Condición If para contar los triángulos Isósceles

			if(triangulos[0] == triangulos[1] && triangulos[0] != triangulos[2]) {
				contadorIsosceles++;
			}else if(triangulos[0] == triangulos[2] && triangulos[0] != triangulos[1]) {
				contadorIsosceles++;
			}else if(triangulos[1] == triangulos[2] && triangulos[1] != triangulos[0]) {
				contadorIsosceles++;
			}
			
			triangulos[0]=0;
			triangulos[1]=0;
			triangulos[2]=0;
			
		}	
	

			
		

		if(contadorEquilatero< contadorEscaleno && contadorEquilatero<contadorIsosceles){
			System.out.println("El de menor cantidad es el Equilatero");
		}else if (contadorEscaleno< contadorEscaleno && contadorEscaleno<contadorIsosceles) {
			System.out.println("El de menor cantidad es el Escaleno");
		}else if (contadorEscaleno< contadorEscaleno && contadorEscaleno<contadorIsosceles) {
			System.out.println("El de menor cantidad es el Escaleno");
		}else {
			
			System.out.println("Tenemos "+contadorIsosceles+" cantidad de triángulos isósceles");
			System.out.println("Tenemos "+contadorEquilatero+" cantidad de triángulos equilateros");
			System.out.println("Tenemos "+contadorEscaleno+" cantidad de triángulos escalenos");
		}
	}
}
