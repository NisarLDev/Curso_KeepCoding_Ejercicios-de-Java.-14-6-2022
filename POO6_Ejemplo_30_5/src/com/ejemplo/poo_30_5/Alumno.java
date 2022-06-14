package com.ejemplo.poo_30_5;

public class Alumno extends Persona {
	String nroMatricula;
	String clases;
		
	public Alumno(String nombre, String apellido, String dni, String nroMatricula, String clases) {
		super(nombre, apellido, dni);
		this.nroMatricula = nroMatricula;
		this.clases = clases;
	}

	@Override
	public String mostrarDatos() {
		return super.mostrarDatos()+"\n"+
				"Matricula: "+this.nroMatricula+"\n"+
				"Clases: "+this.clases+"\n";
	}		
}