package formacionFundaulaEjercicios_Java__I;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero;
		System.out.println("Introduzca el n�mero");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El n�mero introducido es m�ltiplo de 2 ");
		}else {
			System.out.println("El n�mero introducido no es m�ltiplo de 2 ");
		}
		
	}

}
