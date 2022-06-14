package com.ejemplo.intro;
import java.io.*;

public class CambioMoneda_13_5 {

	public static void main(String[] args) throws IOException	{
		
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cambio=0;
		double cant;
		int moneda;
		String seguirpro;
		boolean seguirprograma=true;
		
		// elegir la moneda
		System.out.println("seleccione moneda a cambiar");
		System.out.println("1:Dólares");
		System.out.println("2:Euros");
		System.out.println("3:Yenes");
		System.out.println("4:Libras");
		moneda = Integer.parseInt(bufEntrada.readLine());
		// esto es para que te muestre el nombre de la moneda que seleccionaste
		if (moneda==1) {
			System.out.println("Ud. selecciono Dólares");
		} else {
			if (moneda==2) {
				System.out.println("Ud. selecciono Euros");
			} else {
				if (moneda==3) {
					System.out.println("Ud. selecciono Yenes");
				} else {
					if (moneda==4) {
						System.out.println("Ud. selecciono Libras");
					}
				}
			}
		}
		System.out.println(" ");
		// aqui ingresas la cantidad de dinero en dólares
		System.out.print("ingrese cantidad en Dólares para cambiar");
		cant = Double.parseDouble(bufEntrada.readLine());
		// aqui segun la variable moneda, se realizara la operacion.
		switch (moneda) {
		case 1:
			System.out.println("Cambiar a Euros");
			// esto equivale a euros
			cambio = cant*0.75;
			break;
		case 2:
			System.out.println("Cambiar a Yenes");
			// esto equivale a yenes
			cambio = cant*0.009;
			break;
		case 3:
			System.out.println("Cambiar a Libras");
			// esto equivale a Libras
			cambio = cant*1.22;
			break;
		default:
			System.out.println("la moneda elegida es invalida");
		}
		System.out.println(" ");
		System.out.println("El cambio en la moneda seleccionada es: "+cambio);
		System.out.println(" ");
		System.out.println("Presione enter para continuar");
		System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
		System.out.println("desea seguir otros numeros? s/n");
		seguirpro = bufEntrada.readLine();
		if (seguirpro.equals("n")) {
			seguirprograma = false;
		}
	}

}
