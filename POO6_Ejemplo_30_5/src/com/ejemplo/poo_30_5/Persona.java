package com.ejemplo.poo_30_5;

public class Persona {

//atributos o variables de la clase persona
	String nombre;
	String apellido;
	String dni;
	
	//constructores
	
	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	
	public Persona(String Nombre) {
		
	}
	
	public Persona() {
		
	}
	
	//funciones
	//funciones void sin retorno
	
	
	
	


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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void cargarNombre(String pepe) {
		
		this.nombre=name;
		this.apellido=lastname;
		/*if(this.apellido.equals("Fernandez")) {
			this.nombre = name;
		}*/
		System.out.println(mostrarDatos());
	}
	public String mostrarDatos() {
		
		String todos = "Nombre:"+this.nombre+"\n"+
						"Apellido: "+this.apellido+"\n"+
						"DNI: "+this.dni+"\n"+
						"------------------";
		return todos;
		
	}

}
