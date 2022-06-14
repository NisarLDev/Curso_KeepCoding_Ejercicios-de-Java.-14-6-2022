package com.polimorfirmo.herencia;

public class Vehiculo_turismo extends Vehiculo {
	public int numeroPuertas;
	
	public Vehiculo_turismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		super.mostrarDatos();
		System.out.println("Número de Puertas: "+this.numeroPuertas);
	}
}