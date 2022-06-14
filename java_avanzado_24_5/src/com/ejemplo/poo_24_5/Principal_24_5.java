package com.ejemplo.poo_24_5;

public class Principal_24_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creando una instancia de coche
		//Creando un objeto de la clase coche
		Coche_24_5 coche_24_5 = new Coche_24_5();
		System.out.println("Esos son los datos del primer coche ");
		coche_24_5.color="Amarillo";
		coche_24_5.ruedas=4;
		coche_24_5.motor=2500;
		coche_24_5.velocidad=160;
		coche_24_5.cargarMarca("Toyota"+", Mercedes"+", Seat");
		coche_24_5.mostrarMarca2();
		coche_24_5.cargarPais("Japón"+", Alemania"+", España");
		coche_24_5.mostrarPais2();
		System.out.println("Color"+coche_24_5.color);
		System.out.println("Ruedas"+coche_24_5.ruedas);
		System.out.println("Motor"+coche_24_5.motor);
		System.out.println("Velocidad"+coche_24_5.velocidad);

		Coche_24_5 coche2 = new Coche_24_5();
		System.out.println("Esos son los datos del segundo coche ");

		coche2.color="Rojo";
		coche2.ruedas=4;
		coche2.motor=3600;
		coche2.velocidad=365;
		coche2.cargarMarca("Toyota");
		coche2.mostrarMarca2();
		System.out.println("Color"+coche2.color);
		System.out.println("Ruedas"+coche2.ruedas);
		System.out.println("Motor"+coche2.motor);
		System.out.println("Velocidad"+coche2.velocidad);

		/*String color;
		int ruedas;
		int velocidad;
		int motor;

		color="rojo";
		ruedas=4;*/
	}

}
