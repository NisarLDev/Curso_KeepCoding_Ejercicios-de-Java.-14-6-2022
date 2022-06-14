package com.ejercicio.figura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double lado_triangulo,altura_triangulo,base_triangulo,
		lado_cuadrado,ancho_rectangulo,largo_rectangulo;
		
		String eleccion_figura;
		
		Scanner teclado = new Scanner(System.in);
		
		Figura figura = new Figura();
		
		System.out.println("Con que figura desea tabajar");
		System.out.println("triangulo, rectangulo, cuadrado?");
		eleccion_figura=teclado.next();
		
		switch (eleccion_figura) {
		case "triangulo": 
			System.out.println("Ingrese el lado");
			lado_triangulo=teclado.nextDouble();
			System.out.println("Ingrese la altura");
			altura_triangulo=teclado.nextDouble();
			System.out.println("Ingrese la base");
			base_triangulo=teclado.nextDouble();
			
			figura.cargarDatosTriangulo(lado_triangulo,altura_triangulo,base_triangulo);
			break;
			
		case "rectangulo": 
			System.out.println("Ingrese el ancho");
			ancho_rectangulo=teclado.nextDouble();
			System.out.println("Ingrese el largo");
			largo_rectangulo=teclado.nextDouble();
			
			
			figura.cargarDatosRectangulo(ancho_rectangulo, largo_rectangulo);
			break;
		case "cuadrado": 
			System.out.println("Ingrese el lado");
			lado_cuadrado=teclado.nextDouble();
			
			
			figura.cargarDatosCuadrado(lado_cuadrado);
			break;	
		default:
			System.out.println("No ha seleccionado ninguna figura");
		}

	}

}
