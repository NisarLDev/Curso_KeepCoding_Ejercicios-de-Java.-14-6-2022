package com.ejemplo.crud_jdbc_9_6_2022;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	
		public static String databasename="usuario";
		public static String dbURL = "jdbc:mysql://localhost:3306/"+databasename;
		public static String username ="root";
		public static String password = "";
		
		
		public static Connection conexion() {
			
			Connection conect=null;

			
			try {
				 conect = DriverManager.getConnection(dbURL,username,password);
				if(conect !=null) {
					System.out.println("Conexi�n exitosa a la base de datos");
					System.out.println("***********************************"+"\n"+"-------------------------------------");

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Fallo en el acceso a la base de datos");
				System.out.println("*************************************"+"\n"+"-------------------------------------");
			}	
			
			
			finally {
				
					System.out.println("Fin de la conexi�n a la base de datos");
					}
			
			return conect;

		}	
	
}
