package formacionFundaulaEjercicios_Java__I;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);


		int numero;
		boolean incorrecto = true;
		do {
			System.out.println("Introduzca un n�mero");
			numero = teclado.nextInt();
			if (numero >0) {
				System.out.println("El n�mero es correcto ");
				incorrecto = false;
			}else {
				System.out.println("El n�mero no es correcto ");

			}
		} while (incorrecto);
	}

}
