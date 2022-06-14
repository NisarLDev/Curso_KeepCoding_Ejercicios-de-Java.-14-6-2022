package com.ejemplo.herencia4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehiculo vehiculo = new Vehiculo("1635-M","Renault 5 ",1800);
		System.out.println(vehiculo.toString());

		Taxi taxi = new Taxi("3512-MA","Logan",3400,"42425-J83E8I3");
		System.out.println(taxi.toString());

		Autobus autobus = new Autobus("5274-B","SC6",8000,65);
		System.out.println(autobus.toString());

		/*Vehiculo vehiculo = new Vehiculo();
		*
		*
		*vehiculo.setmatricula("4325-MA")
		*vehiculo.setmodelo("4325-MA")
		*vehiculo.setpotenciaCV("4325-MA")
		*System.out.println(vehiculo.getmatricula());
		*System.out.println(vehiculo.getmatricula());
		*System.out.println(vehiculo.getmatricula());
		*Etc...
		*/
		
		
	}

}
