package com.polimorfirmo.herencia;

public class Vehiculo {
	public String matricula;
	public String marca;
	public String modelo;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	public void mostrarDatos() {
		System.out.println("Matricula: "+this.matricula+"\n"+
							"Marca: "+this.marca+"\n"+
								"Modelo: "+this.modelo);
	}

	
	
}
