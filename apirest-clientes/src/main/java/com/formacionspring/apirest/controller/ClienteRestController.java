package com.formacionspring.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspring.apirest.entity.Cliente;
import com.formacionspring.apirest.service.ClienteService;

@RestController
public class ClienteRestController {
	@Autowired
	private ClienteService servicio;
	
	@GetMapping({"/clientes","/"})
	public List<Cliente> index(){
		return servicio.mostrarTodos();
	}
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable long id) {
		return servicio.mostrarPorId(id);
	}
	@PostMapping("/clientes")
	public Cliente create(@RequestBody Cliente cliente) {
		return servicio.guardar(cliente);
	}
	//Buscar los datos de clienteUpdate por el modelo recibido
	@PutMapping("/clientes/{id}")
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		//Buscar en el registro por id y guardar el objeto en clienteUpdate
		Cliente clienteUpdate = servicio.mostrarPorId(id);
		//Reemplazo los datos de clienteUpdate por el modelo recibido
		//en @RequestBody
		clienteUpdate.setNombre(cliente.getNombre());
		clienteUpdate.setApellido(cliente.getApellido());
		clienteUpdate.setEmail(cliente.getEmail());
		clienteUpdate.setTelefono(cliente.getTelefono());
		clienteUpdate.setCreateAt(cliente.getCreateAt());
		//Guardo y retorno los datos actualizados
		return servicio.guardar(clienteUpdate);
	}
	
	@DeleteMapping("/clientes/{id}")
	public Cliente delete(@RequestBody @PathVariable Long id) {
		Cliente mostrarIdBorrada = servicio.mostrarPorId(id);
		servicio.borrar(id);
		return mostrarIdBorrada;

	}
}
