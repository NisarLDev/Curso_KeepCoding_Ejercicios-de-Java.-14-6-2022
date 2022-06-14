package com.ejemplo.poo_25_5;

public class Persona {

	//Atributos
	String nombre;
	String apellido;
	String dni;
	String direccion;
	protected int telefono;
	
	
	void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre+"\n"+
							"Apellido: "+this.apellido+"\n"+
								"dni: "+this.dni+" direccion "+this.direccion+"\n"+"telefono:"+this.telefono+"\n"+"----------------------------------");
		
		
	}
	
	//Función para mostrar telefono
	int mostrarTelefono() {
		
		return this.telefono;

	}
	
	//Función para mostrar telefono en consola
		void mostrarTelefono2() {
			
			System.out.println("El teléfono es: "+this.telefono);

		}
		
	void cargarTelefono(int valor) {
		
		this.telefono=valor;
	}
	
	//Función para mostrar nombre y apellido
	void cargarNombreApellido(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	String mostrarNombreApellido() {
		return this.nombre+this.apellido;
	}
}
