package com.ejemplo.intro;
import java.util.Scanner;
		public class Sueldo {

		    public static void main(String[] args) {

		    double sueldo,antiguedad;

		    Scanner aumento=new Scanner(System.in);

		    System.out.println("ingresa aca tu sueldo actual");
		    sueldo=aumento.nextDouble();
		    System.out.println("cuanto tiempo llevas en la empresa?");
		    antiguedad=aumento.nextDouble();

		    if (sueldo>=500) {
		        System.out.println("no calificas para ningun aumento");
		    } else if (sueldo<500 && antiguedad>=10) {
		        System.out.println("calificas para un aumento del 20%, tu sueldo ahora es de:"+(sueldo+(sueldo*0.2)));
		    } else if (sueldo<500 && antiguedad<10) {
		        System.out.println("calificas para un aumento del 5%, su sueldo ahora es de:"+(sueldo+(sueldo*0.05)));
		}

		    }
		    }
