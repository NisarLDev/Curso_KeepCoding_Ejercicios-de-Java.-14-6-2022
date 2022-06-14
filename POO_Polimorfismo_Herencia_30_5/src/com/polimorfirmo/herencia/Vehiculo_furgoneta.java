package com.polimorfirmo.herencia;

public class Vehiculo_furgoneta extends Vehiculo {
	public int carga;

	public Vehiculo_furgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		super.mostrarDatos();
		System.out.println("Carga:"+this.carga);
	}


	
}
