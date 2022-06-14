package com.ejemplo.herencia;

public class Alumno extends Persona {
	
	int matricula;
	String carrera;
	
	
	
	@Override
	public String MostrarDatos() {
		
		return "Nombre:"+super.nombre+"\n"+
				"Apellido:"+super.apellido+"\n"+
				"DNI:"+super.dni+"\n"+
				"matricula: "+matricula+"\n"+
				"Especialidad: "+carrera;
	}
	
	
	
	
}