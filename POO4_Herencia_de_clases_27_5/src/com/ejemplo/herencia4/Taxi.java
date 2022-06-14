package com.ejemplo.herencia4;

public class Taxi extends Vehiculo {

	private String numeroLicencia;

	
	
	
	public Taxi(String matricula, String modelo, int potenciaCV, String numeroLicencia) {
		super(matricula, modelo, potenciaCV);
		this.numeroLicencia = numeroLicencia;
	}

	public String getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Número de licencia: "+this.numeroLicencia;
	}

	

	
	
}
