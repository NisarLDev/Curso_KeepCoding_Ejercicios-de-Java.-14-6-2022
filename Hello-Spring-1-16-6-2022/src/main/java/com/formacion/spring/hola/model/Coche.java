package com.formacion.spring.hola.model;

import org.springframework.stereotype.Component;

@Component
public class Coche {

	private String Marca;
	private String Modelo;
	private String Color;
	private int Cilindrada;
	private int velocidad_maxima;
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getCilindrada() {
		return Cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}
	public int getVelocidad_maxima() {
		return velocidad_maxima;
	}
	public void setVelocidad_maxima(int velocidad_maxima) {
		this.velocidad_maxima = velocidad_maxima;
	}
	
	
}
