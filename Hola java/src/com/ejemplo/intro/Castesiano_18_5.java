package com.ejemplo.intro;
import java.util.Scanner;
public class Castesiano_18_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec= new Scanner(System.in);
		  int x, y;
		  System.out.println("Ingrese un valor para el punto X (Distinto de 0)");
		  x= tec.nextInt();
		  System.out.println("Ingrese un valor para el punto Y (Distinto de 0)");
		  y = tec.nextInt();
		  if(x > 0 && y > 0){
		   System.out.println("El punto (" + x + "," + y + ") esta en el primer cuadrante"); 
		  }
		  else 
		   if(x < 0 && y > 0){
		    System.out.println("El punto (" + x + "," + y + ") esta en el segundo cuadrante"); 
		   }
		   else
		    if(x < 0 && y < 0){
		     System.out.println("El punto (" + x + "," + y + ") esta en el tercer cuadrante"); 
		    }
		    else
		     if(x > 0 && y < 0){
		      System.out.println("El punto (" + x + "," + y + ") esta en el cuarto cuadrante"); 
		     }
		 }
	}

