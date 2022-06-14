package com.ejemplo.herencia3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona(22,"José","Gracia","García","Masculino","Programación");
		System.out.println(persona.toString());
		
		Maestro maestro = new Maestro(48,"Eduardo","González","Magadís","Masculino","Conducir","Química orgánica","C-34");
		System.out.println(maestro.toString());
		
		Alumno alumno = new Alumno(39,"Dalila","Pérez","Vereda","Femenino","Lectura","Química orgánica","Tarde");
		System.out.println(alumno.toString());
		
		
	}

}
