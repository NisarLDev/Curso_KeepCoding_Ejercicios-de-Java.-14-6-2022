package com.formacionspring.hola.model;

import org.springframework.stereotype.Component;

//Hacemos que la clase Usuario sea inyectable por dependencias
@Component
public class Usuario {

	private String nombre;
	private String apellido;
	private int telefono;
	private String email;
	
	public Usuario(String nombre, String apellido, int telefono, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
	}
	public Usuario() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre +"\n"+ " apellido=" + apellido +"\n"+ ", telefono=" + telefono +"\n"+ ", email=" + email
				+ "]";
	}	
	
}