package com.ejemplo.mvc.view;

public class ClienteView {
	public void imprimirDatosClientes(int id,String nombre,String apellido) {
		System.out.println("****Datos de Cliente****");
		System.out.println("Id: "+id);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("********");
	}
	
}
