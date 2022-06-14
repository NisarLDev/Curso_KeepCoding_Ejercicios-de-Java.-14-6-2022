package com.ejemplo.mvc.controller;

import com.ejemplo.mvc.model.Cliente;
import com.ejemplo.mvc.view.ClienteView;

public class ClienteController {
    //Objetos de vista y modelo
    private ClienteView vista;
    private Cliente modelo;

    public ClienteController(ClienteView vista, Cliente modelo) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public int getId() {
        return this.modelo.getId();
    }
    public void setId(int id) {
        this.modelo.setId(id);;
    }
    public String getNombre() {
        return this.modelo.getNombre();
    }
    public void setNombre(String nombre) {
        this.modelo.setNombre(nombre);;
    }
    public String getApellido() {
        return modelo.getApellido();
    }
    public void setApellido(String apellido) {
        this.modelo.setApellido(apellido);
    }
    public void actualizarVista() {
        vista.imprimirDatosClientes(modelo.getId(), modelo.getNombre(), modelo.getApellido());
    }
} 