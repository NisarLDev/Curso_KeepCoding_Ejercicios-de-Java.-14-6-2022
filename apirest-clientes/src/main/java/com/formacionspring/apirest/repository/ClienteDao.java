package com.formacionspring.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.apirest.entity.Cliente;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long >{

	
	
}
