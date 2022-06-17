package com.formacion.spring.hola.controller;
import com.formacion.spring.hola.model.Coche;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.spring.hola.service.CocheService;

@RestController
public class CocheController {

	@Autowired
	private CocheService servicio;
	
	@GetMapping("/coches")
	public List<Coche> mostrarCoches(){
		
		return servicio.listaCoches();
		
	}
	
	
}
