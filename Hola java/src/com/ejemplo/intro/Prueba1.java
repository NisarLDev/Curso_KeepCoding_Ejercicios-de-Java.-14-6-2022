package com.ejemplo.intro;
import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       int Monto_de_presupuesto; 
		       float porcentaje;
		       Scanner inputNumScanner = new Scanner(System.in);
		       
		       System.out.println("Ingresa el puntaje total, o máximo: ");       
		       total = inputNumScanner.nextInt();
		       
		       System.out.println("Ingresa el puntaje obtenido: ");
		       cantidad = inputNumScanner.nextInt();
		       
		       porcentaje = (cantidad * 100/ total);
		       
		       System.out.println("El porcentaje es = " + porcentaje + " %");
		   

	}

}
