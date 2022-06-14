package com.ejemplo.intro;
import java.util.Scanner;


	public class Exponente_18_5 {

	public static void main(String[] args) {
		int n, base;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la base: ");
		base = teclado.nextInt();
		System.out.println("Ingrese el exponente");
		n = teclado.nextInt();
		int resultado = (int) Math.pow(base, n);
		System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
	}

}