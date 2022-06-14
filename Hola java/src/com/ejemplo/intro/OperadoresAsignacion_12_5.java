package com.ejemplo.intro;

public class OperadoresAsignacion_12_5 {

	public static void main(String[] args) {
		// Operadores de asignación
		
		int a = 10,b=1,c,z=0;
		//asignación normal
		System.out.print("Este es el valor de c: ");
		c= a;
		System.out.println(c);
		//suma y asignación 
		System.out.print("La suma de a mas b es igual a: ");
		b += a;
		System.out.println(b);
		//resta y asignación
		System.out.print("La resta de a mas b es igual a: ");
		b -=a;
		System.out.println(b);
		// multiplicación y asignación
		System.out.print("La multiplicación de a mas b es igual a: ");
		b*=a;
		System.out.println(b);
		// división y asignación
		System.out.print("La división de a mas b es igual a: ");
		b /=a;
		System.out.println(b);
		// módulo y asignación
		System.out.print("El módulo de a mas b es igual a: ");
		b %=a;
		System.out.println(b);
		//asignación para aumento en 1
		z++;
		System.out.println("El valor de z es "+z);
		//asignación para decremento en 1
		z--;
		System.out.println("El valor de z es "+z);

	}

}
