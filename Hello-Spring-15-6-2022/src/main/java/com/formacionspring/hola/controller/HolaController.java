package com.formacionspring.hola.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspring.hola.model.Usuario;

@RestController
public class HolaController {

	//Inyeccion de dependencia de la clase Usuario
	@Autowired
	private Usuario pedrito;

	
	//Metodo http de tipo get
	@GetMapping("/index")
	public String hola() {
		return "Hola como vamos";
	}
	
	@GetMapping("/usuarios")
	public String usuarios() {
		Usuario user = new Usuario("Enrique","Iglesias",653222,"eiglesias@email.com");
		return user.toString();
	}
	
	@GetMapping("/usuarios2")
	public List<Usuario> usuarios2() {
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		pedrito.setNombre("Pedro");
		pedrito.setApellido("Perez");
		pedrito.setTelefono(8273222);
		pedrito.setEmail("pperez@email.com");
		
		Usuario user = new Usuario("Enrique","Iglesias",653222,"eiglesias@email.com");
		
		lista.add(pedrito);
		lista.add(user);
		return lista;
	}
		
}
