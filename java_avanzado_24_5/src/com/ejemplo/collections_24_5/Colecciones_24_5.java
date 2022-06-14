package com.ejemplo.collections_24_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Colecciones_24_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> conjunto = new HashSet();
		conjunto.add("Sandia");
		conjunto.add("Cereza");
		conjunto.add("Fresa");
		conjunto.add("Manzana");
		conjunto.add("ciruela");
		conjunto.add("mango");
		//conjunto.remove
		for (String frutas : conjunto) {
			System.out.println(frutas);
		}	
		System.out.println("----------Matrices---------");
		//Lista matricial
		
		
		ArrayList<String> marcas = new ArrayList<String>();
		marcas.add("Mercedes");
		marcas.add("Toyota");
		marcas.add("Volvo");
		marcas.add("Seat");
		//add para agrergar elementos a la lista matricial
		marcas.add("Ferrari");
		//funci�n get para acceder a un elemento
		System.out.println(marcas.get(2));
		System.out.println(marcas+" Estas son las marcas de coches" + " m�s vendidas en el mundo entero ");
		//funci�n set para modificar un elemento
		marcas.set(3,"BMW");
		System.out.println(marcas+" Estas son las marcas de coches" + " m�s vendidas en el mundo entero ");
		//funci�n remove para eliminar un elemento
		marcas.remove(1);
		System.out.println(marcas);
		//funci�n clear para eliminar todos los elelmentos de una lista matricial
		marcas.clear();
		//Imprimir por pantalla
		System.out.println(marcas);
		//Funci�n size() para mostrar el tama�o de la lista matricial
		marcas.size();
		//Imprimir por pantalla
		System.out.println(marcas.size());
		
		//Funci�n HashMap
		
		HashMap<String,String> ciudades = new HashMap<String,String>();
		//Funci�n put para a�adir un elemento

		ciudades.put("Espa�a", "Madrid");
		ciudades.put("USA", "Washington DC");
		ciudades.put("Germany", "Berlin");
		ciudades.put("England", "London");
		System.out.println(ciudades);
		ciudades.put("Norway", "Oslo");
		System.out.println(ciudades);
		//Funci�n get para acceder a un elemento
		System.out.println(ciudades.get("England"));
		//Funci�n replace para sustituir un elemento
		ciudades.replace("Espa�a", "Sevilla");
		System.out.println(ciudades);
		//Funci�n clear para sustituir un elemento
		ciudades.clear();
		System.out.println(ciudades);
		//Funci�n size() para mostrar el tama�o de la lista matricial
		ciudades.size();
		System.out.println(ciudades.size());

	}

}
