package com.ejemplo.herencia3;

public class Alumno extends Persona{

	private String Clases_a_tomar;
	private String Grupo;
	public Alumno(int edad, String nombre, String apellido_paterno, String apellido_materno, String genero,
			String intereses, String clases_a_tomar, String grupo) {
		super(edad, nombre, apellido_paterno, apellido_materno, genero, intereses);
		Clases_a_tomar = clases_a_tomar;
		Grupo = grupo;
	}
	public String getClases_a_tomar() {
		return Clases_a_tomar;
	}
	public void setClases_a_tomar(String clases_a_tomar) {
		Clases_a_tomar = clases_a_tomar;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Clases a tomar: "+this.Clases_a_tomar+" Grupo: "+this.Grupo;
	}
	
	
}
