package com.ejemplo.mvc;

import com.ejemplo.mvc.controller.ClienteController;
import com.ejemplo.mvc.model.Cliente;
import com.ejemplo.mvc.view.ClienteView;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ClienteView vista 
		Cliente modelo = llenarDatosCliente();
		ClienteView vista = new ClienteView();
		ClienteController controlador = new ClienteController(vista, modelo);
	}

	
	
	private static Cliente llenarDatosCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Rolando");
		cliente.setApellido("Lopez");
		
		return cliente;
	}
	
}
