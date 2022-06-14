package com.ejemplo.herencia;

public class Maestro extends Persona{

	String nroSeguridad;
	String especialidad;
	
	@Override
	public String MostrarDatos() {
		return  "Nombre:"+super.nombre+"\n"+
				"Apellido:"+super.apellido+"\n"+
				"DNI:"+super.dni+"\n"+
				"NroSeguridad: "+nroSeguridad+"\n"+
				"Especialidad: "+especialidad;
	}
	
	
	
}