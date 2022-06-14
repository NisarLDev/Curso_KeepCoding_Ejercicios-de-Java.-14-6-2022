package com.ejemplo.poo_30_5;

public class Cliente {

	private int cod_clientes;
	private String nombre;
	private String apellido;
	private String direccion;
	
	//Encapsulamiento
	
	public int getCod_clientes() {
		return cod_clientes;
	}
	public void setCod_clientes(int cod_clientes) {
		this.cod_clientes = cod_clientes;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
}
