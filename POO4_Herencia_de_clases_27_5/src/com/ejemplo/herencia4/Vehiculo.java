package com.ejemplo.herencia4;

public class Vehiculo {

	private String matricula;
	private String modelo;
	private double potenciaCV;
	
	
	
	
	public Vehiculo(String matricula, String modelo, double potenciaCV2) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.potenciaCV = potenciaCV2;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPotenciaCV() {
		return potenciaCV;
	}
	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", potenciaCV=" + potenciaCV + "]";
	}
	
	
}
