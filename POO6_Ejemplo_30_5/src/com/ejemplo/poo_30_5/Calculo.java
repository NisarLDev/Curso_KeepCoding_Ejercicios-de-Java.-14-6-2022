package com.ejemplo.poo_30_5;

public class Calculo {

	public int num1;
	public int num2;
	public static final double valor=3.141;
	//atributo estático
	//final para crear una variable constante o que no se pueda 
	//cambiar
	public static void calcular(int a, int b);
		double resultado = a*b/valor;
		System.out.println(resultado);
}
