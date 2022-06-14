package com.ejemplo.herencia;

public class Principal {

	public static void main(String[] args) {
		Maestro obj= new Maestro();
		obj.nombre="Pepe";
		obj.apellido="Perez";
		obj.dni="p232323";
		obj.nroSeguridad="po23823";
		obj.especialidad="Matematicas";
		
		
		System.out.println(obj.MostrarDatos());
		
		Alumno alumno= new Alumno();
		alumno.nombre="Pepe";
		alumno.apellido="Perez";
		alumno.dni="p232323";
		alumno.matricula=534534;
		alumno.carrera="Matematicas";

		
		System.out.println(alumno.MostrarDatos());
	}
	
	

}