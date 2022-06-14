package com.ejemplo.intro;

public class ParesImpares1A100EjemploProfesor_17_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadPares=0,cantidadImpares=0;
		for (int i=0 ; i<=100; i++) {
			if(i%2 == 0) {
				cantidadPares=cantidadPares+1;
				System.out.println("Numeros pares "+i);
			}else {
				cantidadImpares=cantidadImpares+1;
				System.out.println("Números impares "+i);
				
			}
			
		}

		System.out.println("Este es el número total de pares en la lista "+cantidadPares);
		System.out.println("Este es el número total de pares en la lista "+cantidadImpares);

	}

}
