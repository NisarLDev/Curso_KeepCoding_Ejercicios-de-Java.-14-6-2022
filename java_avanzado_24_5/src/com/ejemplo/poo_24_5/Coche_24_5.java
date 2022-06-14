package com.ejemplo.poo_24_5;

public class Coche_24_5 {

	String color;
	int ruedas;
	int velocidad;
	int motor;
	String marca;
	String pais;

	//Función de la clase Coche
	//Void para que no declare nada
	void mostrarDatos()  {
	System.out.println("Color"+color);
	System.out.println("Ruedas"+ruedas);
	System.out.println("Motor"+motor);
	System.out.println("Velocidad"+velocidad);
	System.out.println("Esos son los datos del segundo coche ");
	}
	int mostrarVelocidad()  {
	
		return this.velocidad;
		}
	
	
	
	
	void cargarRuedas(int cantidadRuedas) {
		this.ruedas = cantidadRuedas;
	}
	//Función para cargar la marca
	void cargarMarca(String marca) {
		this.marca = marca;
	}
	
	//Función para cargar el pais de origen
		void cargarPais(String pais) {
			this.pais = pais;
		}
	//Función para mostrar la marca
	String mostrarMarca()  {
		
		return this.marca;
		}

	void mostrarMarca2() {
		System.out.println(marca);
	}

	//Función para mostrar el pais de origen
		String mostrarPais()  {
			
			return this.pais;
			}
		void mostrarPais2() {
			System.out.println(pais);
		}
}
