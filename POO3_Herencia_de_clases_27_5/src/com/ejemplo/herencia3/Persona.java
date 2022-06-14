package com.ejemplo.herencia3;

public class Persona {

	private int Edad;
	private String Nombre;
	private String Apellido_paterno;
	private String Apellido_materno;
	private String Genero;
	private String Intereses;
	public Persona(int edad, String nombre, String apellido_paterno, String apellido_materno, String genero,
			String intereses) {
		Edad = edad;
		Nombre = nombre;
		Apellido_paterno = apellido_paterno;
		Apellido_materno = apellido_materno;
		Genero = genero;
		Intereses = intereses;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido_paterno() {
		return Apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		Apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return Apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		Apellido_materno = apellido_materno;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getIntereses() {
		return Intereses;
	}
	public void setIntereses(String intereses) {
		Intereses = intereses;
	}
	@Override
	public String toString() {
		return "Persona [Edad=" + Edad + ", Nombre=" + Nombre + ", Apellido_paterno=" + Apellido_paterno
				+ ", Apellido_materno=" + Apellido_materno + ", Genero=" + Genero + ", Intereses=" + Intereses + "]";
	}
	
	
}
