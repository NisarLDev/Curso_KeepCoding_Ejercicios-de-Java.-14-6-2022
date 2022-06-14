package com.ejemplo.intro;
import java.util.Scanner;

public class PresupuestoHospitalario {

	public static void main(String[] args) {
		double presupuesto, presupuesto_urgencias,presupuesto_tramatologia,presupuesto_pedriatria; 
	    System.out.println("Ingresa el presupuesto: ");       

		//Llamada al teclado
		Scanner teclado = new Scanner(System.in);
		presupuesto = teclado.nextDouble();
	    System.out.print("El porcentaje de presupuesto de urgencias : "); 
	    presupuesto_urgencias = (presupuesto*37)/100;
	    presupuesto_tramatologia = (presupuesto*21)/100;
	    presupuesto_pedriatria = (presupuesto*42)/100;

	    System.out.println("El porcentaje de presupuesto de urgencias : "+presupuesto_urgencias); 
	    System.out.println("El porcentaje de presupuesto de traumatología : "+presupuesto_tramatologia);
	    System.out.println("El porcentaje de presupuesto de pediatría : "+presupuesto_pedriatria);

	}

}
