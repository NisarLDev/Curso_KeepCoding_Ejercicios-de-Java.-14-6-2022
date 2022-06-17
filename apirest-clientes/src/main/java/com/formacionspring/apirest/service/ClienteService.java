package com.formacionspring.apirest.service;
import java.util.List;
import com.formacionspring.apirest.entity.Cliente;

public interface ClienteService {
	//Método para mostrar todos los clientes
	public List<Cliente> mostrarTodos();
	//Método para mostrar un cliente por id
	public Cliente mostrarPorId(Long id);
	//Método para guardar un cliente
	public Cliente guardar(Cliente cliente);
	//Método para borrar un cliente
	public void borrar(Long id);
}
