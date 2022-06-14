package com.ejemplo.crud_jdbc_9_6_2022;
import java.util.*;

import com.ejemplo.crud_jdbc_9_6_2022.controller.UsuarioController;
import com.ejemplo.crud_jdbc_9_6_2022.model.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Llamada a la clase y el método de conexixón a la base de datos		
	//Conexion.conexion();		
	
	
	//Crear un objeto de la Clase UsuarioController
		
	//UsuarioController usuario = new UsuarioController();	
		
		int x, y = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número >= 1 y <= 6: ");                                                   
        x = sc.nextInt();
        switch (x){
                case 1: 
                case 2: x+=5;
                case 3: x = x + y;
                        break;
                case 4:
                case 5: 
                case 6: x++;
                        break;
                default : System.out.println("Número no válido");                                                 
        }
        System.out.println("x = " + x);
    }
		
	// llama al método de insertar datos en los campos de la tabla
	 		
	//Usuario usuario1 = new Usuario("Juan","ihoehfweof","Juan García","idosod@ididf.off");
	//usuario.insertar(usuario1);	
		
	//Usuario usuario2 = new Usuario("hetui","ihoehfweof","Juan García","idgrrd@idetf.off");
	//usuario2.setId(9);
	//usuario.insertar(usuario2);	
	
	//Listar los campos de la tabla usuario
	//UsuarioController usuario22 = new UsuarioController();
	//usuario22.listarUsuario();
	
	//Actualizar los campos de la tabla
	//UsuarioController actualizar = new UsuarioController();
	//actualizar.actualizar(usuario2);
	
	//Listar los campos de la tabla usuario
		UsuarioController usuario23 = new UsuarioController();
		usuario23.listarUsuario();
		
	//Eliminar campos de la  tabla
		usuario23.eliminar(5);
		
	//Listar los campos de la tabla usuario
			usuario23.listarUsuario();
	}	
	

}
