package com.ejemplo.herencia3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona(22,"Jos�","Gracia","Garc�a","Masculino","Programaci�n");
		System.out.println(persona.toString());
		
		Maestro maestro = new Maestro(48,"Eduardo","Gonz�lez","Magad�s","Masculino","Conducir","Qu�mica org�nica","C-34");
		System.out.println(maestro.toString());
		
		Alumno alumno = new Alumno(39,"Dalila","P�rez","Vereda","Femenino","Lectura","Qu�mica org�nica","Tarde");
		System.out.println(alumno.toString());
		
		
	}

}
