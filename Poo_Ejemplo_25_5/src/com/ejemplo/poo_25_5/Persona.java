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
	
	//Funci�n para mostrar telefono
	int mostrarTelefono() {
		
		return this.telefono;

	}
	
	//Funci�n para mostrar telefono en consola
		void mostrarTelefono2() {
			
			System.out.println("El tel�fono es: "+this.telefono);

		}
		
	void cargarTelefono(int valor) {
		
		this.telefono=valor;
	}
	
	//Funci�n para mostrar nombre y apellido
	void cargarNombreApellido(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	String mostrarNombreApellido() {
		return this.nombre+this.apellido;
	}
}
