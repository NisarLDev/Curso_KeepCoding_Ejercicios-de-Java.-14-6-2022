package com.ejemplo.intro;

import java.util.Scanner;

public class AreaCirculo_17_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio, Area;    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el tama�o del radio: ");
        radio = teclado.nextDouble();
        Area = Math.PI * (radio*radio) ; 
        System.out.println("El �rea del c�rculo es de " + Area);
	}

}
