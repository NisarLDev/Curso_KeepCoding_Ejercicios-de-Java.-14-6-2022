package com.ejemplo.poo_30_5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona persona = new Persona("Pepito","Perez","9403492");
		Persona persona2 = new Persona("Pepito","Perez","9403492");
		Persona persona3 = new Persona("Pepito","Perez","9403492");
		Alumno alumno = new Alumno("Pepito","Perez","9403492","83048902934","Álgebra");

		
		//Llamadas a atributos o metodos estáticos
		//Calculo.valor=49000;
		System.out.println("Esto es un valor: "+Calculo.valor);
		//Calculo.calcular(20, 5);
		persona.nombre="Jose";
		persona.apellido="Perez";
		persona.dni="40.392.574-T";

		persona2.nombre="Carlos";
		persona2.apellido="Ruiz";
		persona2.dni="75.928.492-L";
		
		
		persona3.nombre="Carlos";
		persona3.apellido="Ruiz";
		persona3.dni="73.718.462-P";
		
		System.out.println(persona.mostrarDatos());
		System.out.println(persona2.mostrarDatos());
		System.out.println(persona3.mostrarDatos());
		System.out.println(alumno.mostrarDatos());

		
	}

}
