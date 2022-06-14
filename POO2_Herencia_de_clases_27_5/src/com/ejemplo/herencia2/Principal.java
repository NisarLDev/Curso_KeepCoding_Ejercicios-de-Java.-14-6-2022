package com.ejemplo.herencia2;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo objvehiculo = new Vehiculo("rojo",24324);
		System.out.println(objvehiculo.mostrarDatos());
		
		System.out.println("---------------------------------------");
		
		Coche coche = new Coche("verde",32323,3600,260,"sedan");
		System.out.println(coche.mostrarDatos());
		
		Barco barco = new Barco("Rojo",32323,6000,10,"crucero");
		
	}

}
