package com.ejemplo.herencia2;

public class Barco extends Vehiculo{

	public int motor;
	public int capacidad;
	public String tipo;
	
	public Barco(String color, int nroSerie,
			int motor,int capacidad, String tipo) {
		super(color,nroSerie);
		
	}
	
}