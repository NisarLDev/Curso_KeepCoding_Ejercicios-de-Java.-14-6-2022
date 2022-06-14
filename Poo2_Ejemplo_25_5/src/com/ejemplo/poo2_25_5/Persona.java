package com.ejemplo.poo2_25_5;

public class Persona {

	
	//Atributos
		String nombre;
		String apellido;
		String email;
		protected int telefono;
		//Creación de un constructor
		//Constructor llenado con datos
		public Persona(String nombre, String apellido, String email, int telefono) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
			this.telefono = telefono;
		}
		//Constructor sin datos/vacio
		public Persona() {
		
		}
		
		//
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono="
					+ telefono + "]";
		}
		
}
