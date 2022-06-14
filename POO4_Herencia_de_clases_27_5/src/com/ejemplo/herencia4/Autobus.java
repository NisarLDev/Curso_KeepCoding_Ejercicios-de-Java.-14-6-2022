package com.ejemplo.herencia4;

public class Autobus extends Vehiculo {

	private int numeroPlazas;

	public Autobus(String matricula, String modelo, double potenciaCV, int numeroPlazas) {
		super(matricula, modelo, potenciaCV);
		this.numeroPlazas = numeroPlazas;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Número de plazas: "+this.numeroPlazas;
	}


	
}
