package com.ejemplo.intro;

public class OperadoresAsignacion_12_5 {

	public static void main(String[] args) {
		// Operadores de asignaci�n
		
		int a = 10,b=1,c,z=0;
		//asignaci�n normal
		System.out.print("Este es el valor de c: ");
		c= a;
		System.out.println(c);
		//suma y asignaci�n 
		System.out.print("La suma de a mas b es igual a: ");
		b += a;
		System.out.println(b);
		//resta y asignaci�n
		System.out.print("La resta de a mas b es igual a: ");
		b -=a;
		System.out.println(b);
		// multiplicaci�n y asignaci�n
		System.out.print("La multiplicaci�n de a mas b es igual a: ");
		b*=a;
		System.out.println(b);
		// divisi�n y asignaci�n
		System.out.print("La divisi�n de a mas b es igual a: ");
		b /=a;
		System.out.println(b);
		// m�dulo y asignaci�n
		System.out.print("El m�dulo de a mas b es igual a: ");
		b %=a;
		System.out.println(b);
		//asignaci�n para aumento en 1
		z++;
		System.out.println("El valor de z es "+z);
		//asignaci�n para decremento en 1
		z--;
		System.out.println("El valor de z es "+z);

	}

}
