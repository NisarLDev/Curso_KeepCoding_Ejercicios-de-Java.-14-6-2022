package com.ejemplo.intro;

public class OperadoresRelacionales_17_5 {

	public static void main(String[] args) {

       int a=10, b=5, c=5;
       boolean valor=false,valor1=false,valor2=false;
       String nombre1="Rosa",nombre2="Rosita";
      
       //Operadores de Relación
       //And &&
       if(nombre1.equals("Rosa") && a ==10) {
    	   System.out.println("AND &&, Hola Rosa");
       }
       //Or 
       if (nombre1.equals("Jose") || a ==10){
         System.out.println("OR ||, Hola Rosa");
	 }
       
       //not !
       if(!nombre1.equals("Pepe"))
    	   System.out.println("not !, es distinto de Pepe");
       //Valores String
       //si nombre1 es igual a nombre2
       // valor nombre1.equals nombre2 lo que hace es comparar letra por letra los valores introducidos
       //distinguiendo entre mayúsculas y minúsculas
       valor = nombre1.equals(nombre2);
       // valor = nombre1.equalsIgnoreCase(nombre2); la diferencia con .equals en este caso es que no compara mayúsculas con minúsculas
       valor = nombre1.equalsIgnoreCase(nombre2);
       
       //valores logicos
       //igualdad == distinto !=
       valor = valor1!=valor2;
       
       
       //Igualdad a==b
       valor = c==b;
       System.out.println("Igualdad "+valor);
       //Distinto de a!=b
       valor = c!=b;
       System.out.println("Distinto que: "+valor);

       //Mayor que a>b
       valor = a>b;
       System.out.println("Mayor que: "+valor);
       //Menor que a<b
       valor = a<b;
       System.out.println("Menor que: "+valor);
       //Mayor igual que a>=b
       valor = c>=b;
       System.out.println("Mayor o igual que: "+valor);
       //Menor igual que a<=b
       valor = c<=b;
       System.out.println("Menor o igual que: "+valor);
	}

}
