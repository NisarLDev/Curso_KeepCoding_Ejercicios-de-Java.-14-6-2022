package com.ejemplo.herencia2;

public class Coche extends Vehiculo{

	public int cilindrada;
	public int velocidad;
	public String tipo;
	
	public Coche(String color, int nroSerie,int cilindrada,
			int velicidad,String tipo) {
		super(color, nroSerie);
		this.cilindrada = cilindrada;
		this.velocidad = velocidad;
		this.tipo = tipo;
	
	}

	@Override
	public String mostrarDatos() {
	 	
	 	return super.mostrarDatos()+"\n"+
	 		   "Color:"+this.color+"\n"+
	 		   "Velicidad"+this.velocidad+"\n"+
	 		   "Tipo:"+this.tipo;
		
	}
	
	

}