package com.ejemplo.poo3;

public class Torta {

	private double harina;
	private double levadura;
	private double mantequilla;
	private double azucar;
	private String tipo;
	
	
	public Torta(double harina, double levadura, double mantequilla, double azucar, String tipo) {
		this.harina = harina;
		this.levadura = levadura;
		this.mantequilla = mantequilla;
		this.azucar = azucar;
		this.tipo = tipo;
		mostrarTipoTorta();
	}
	
	
	 public void mostrarTipoTorta() {
		
		if(this.tipo.equals("chocolate")) {
			System.out.println("Tienes los ingredientes para una tarta de chocolate");
		}else if(this.tipo.equals("naranja")) {
			System.out.println("Tienes los ingredientes para una tarta de naranja");
		}else if (this.tipo.equals("fresa")) {
			System.out.println("Tienes los ingredientes para una tarta de fresa");
		}
	}

	
	
	
	//Ingredientes añadibles a la tarta base
	/*private double chocolate;
	private int naranjas;
	private int huevos;
	private int fresas;
	private int zanahoria;
	*/
	
	

}
