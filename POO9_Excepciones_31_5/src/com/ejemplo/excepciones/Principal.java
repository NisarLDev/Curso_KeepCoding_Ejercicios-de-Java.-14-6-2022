package com.ejemplo.excepciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Uso de Date

		
			//	Date fecha = new Date();
				//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				
				//getCalendar;
		
		int array []  = new int [4];
		
		try
		{
		
		array[5]=10;
		
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("********************************");
		System.err.println("Aquí está el error de la excepción");
		
	}finally {
		System.out.println("********************************"+"\n"+"--------------------------------");
		System.out.println("Este es el final de la excepción");

	}
		System.out.println("--------------------------------");

		System.out.println("Hola");

		
		/*catch (ArrayIndexOutOfBoundsException) {
			
		System.out.println("Aquí está el error de la excepción");
		}*/
		
		
		
	}
}
