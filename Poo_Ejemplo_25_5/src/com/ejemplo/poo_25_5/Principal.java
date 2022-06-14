package com.ejemplo.poo_25_5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Llamada/instancia a una clase
		//Crea un objeto de la clase persona llamada Pedro
		Persona persona1=new Persona();
		//persona1.nombre="Pedro";
		//persona1.apellido="Coral";
		persona1.cargarNombreApellido("Pedro", "Coral");
		persona1.dni="12340456V";
		persona1.direccion="Calle Libertad 12";
		persona1.telefono=648193743;
		persona1.mostrarDatos();
		Persona persona2=new Persona();
		
		//persona2.nombre="María";
		//persona2.apellido="Crislo";
		persona2.cargarNombreApellido("María", "Crislo");

		persona2.dni="1634616H";
		persona2.direccion="Calle Tablas 23";
		persona2.telefono=693969718;
		persona2.mostrarDatos();

		Persona persona3=new Persona();
		//persona3.nombre="Raquel";
		//persona3.apellido="Carrión";
		persona3.cargarNombreApellido("Raquel", "Carrión");
		persona3.dni="12543956C";
		persona3.direccion="Calle Casal 24";
		persona3.telefono=639528153;
		persona3.mostrarDatos();

		Persona persona4=new Persona();
		//persona4.nombre="Esperanza";
		//persona4.apellido="Mirlo";
		persona4.cargarNombreApellido("Esperanza", "Mirlo");
		persona4.dni="57826156B";
		persona4.direccion="Calle Casal 24";
		persona4.telefono=639571936;
		persona4.mostrarDatos();

	}

}
