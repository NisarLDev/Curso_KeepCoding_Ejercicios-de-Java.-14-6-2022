package com.ejemplo.intro;
import java.util.Scanner;
public class MediaAlturaPersonasEjemploProfesor_20_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		double alturas[];
		double sumatoria=0,promedio=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantas alturas desea ingresar?");
		n=teclado.nextInt();
		alturas = new double[n];
		
		for(int i=0;i<alturas.length;i++) {
			System.out.println("Ingrese la altura");
			alturas[i]=teclado.nextDouble();
			sumatoria= sumatoria + alturas[i];
		}
		promedio=sumatoria/n;
		//System.out.println("el promedio es "+promedio);
		System.out.println("El promedio de la altura es "+promedio);

	}

}
