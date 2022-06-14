package com.ejemplo.intro;
import java.util.Scanner;

public class PorcentajeAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Scanner t=new Scanner(System.in);
       
        int numtotal,numhombres,nummujeres,porcmujeres,porchombres;
       
        System.out.println("Ingrese el numero de alumnos que son hombres");
        numhombres=t.nextInt();
       
        System.out.println("Ingrese el numero de alumnos que son mujeres");
        nummujeres=t.nextInt();
       
       
        numtotal=numhombres+nummujeres;
       
        porchombres=(100*numhombres)/numtotal;
        porcmujeres=(100*nummujeres)/numtotal;
       
       
       
        System.out.println("El total de hombres y mujeres son : "+numtotal);
        System.out.println(""+porchombres+"% de alumnos");
        System.out.println(""+porcmujeres+"% de alumnas");
       
       
			    }

	}
}