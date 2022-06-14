package com.ejemplo.herencia3;

public class Maestro extends Persona{

	private String Clases;
	private String Estacionamiento;
	public Maestro(int edad, String nombre, String apellido_paterno, String apellido_materno, String genero,
			String intereses, String clases, String estacionamiento) {
		super(edad, nombre, apellido_paterno, apellido_materno, genero, intereses);
		Clases = clases;
		Estacionamiento = estacionamiento;
	}
	public String getClases() {
		return Clases;
	}
	public void setClases(String clases) {
		Clases = clases;
	}
	public String getEstacionamiento() {
		return Estacionamiento;
	}
	public void setEstacionamiento(String estacionamiento) {
		Estacionamiento = estacionamiento;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Clases: "+this.Clases+" Estacionamiento: "+this.Estacionamiento;
	}
	
	
	
	
	
}
