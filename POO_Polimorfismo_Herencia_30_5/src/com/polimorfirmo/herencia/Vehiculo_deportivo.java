package com.polimorfirmo.herencia;

public class Vehiculo_deportivo extends Vehiculo {
	public int cilindrada;

	public Vehiculo_deportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	}	
}
