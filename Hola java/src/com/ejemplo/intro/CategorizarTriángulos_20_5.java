package com.ejemplo.intro;
import java.util.Scanner;

public class CategorizarTriángulos_20_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Scanner leer = new Scanner(System.in);
	 

				long l1, l2, l3;

				 

				System.out.println("Escriba el lado 1");

				l1 = leer.nextLong();

		 

				System.out.println("Escriba el lado 2");

				l2 = leer.nextLong();

		 

				System.out.println("Escriba el lado 3");

				l3 = leer.nextLong();
		 

				if(l1==l2==l3){

					System.out.println("Triangulo Equilatero");

					}else	{

							if((l1==l2!=l3) || (l1==l3!=l2) || (l2==l3!=l1));

								{

									System.out.println("Triangulo Isoseles");

								}	else	{

										System.out.println("Triangulo Escaleno");

										}

							}

			}

}
