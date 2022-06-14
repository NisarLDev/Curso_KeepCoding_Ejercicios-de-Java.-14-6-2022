package com.ejemplo.herencia2;

public class Vehiculo {
	 
	 public String color;
	 public int nroSerie; 
	 
	 public Vehiculo(String color,int nroSerie) {
		 this.color = color;
		 this.nroSerie=nroSerie;
	 }
	 
	 public String mostrarDatos() {
		 return "Color:"+this.color+"\n"+
				"NroSerie:"+this.nroSerie+"\n";
	 }
	 
	}