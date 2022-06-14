package com.ejemplo.intro;

import java.util.Scanner;

public class EntradaSalida2_13_5 {

    public static void main(String[] args) {
        //Entrada de Datos por la clase Scanner
        //Entrada de datos
        String valor1;
        int valor2;
        double valor3;
        Scanner pinocho = new Scanner(System.in);

        System.out.println("Ingrese dato para valor 1");
        valor1 = pinocho.next();
        System.out.println("Ingrese dato para valor 2");
        valor2 = pinocho.nextInt();
        System.out.println("Ingrese dato para valor 3");
        valor3 = pinocho.nextDouble();
        //salida de datos
        System.out.println("esto es lo que ingresaste por teclado "+ valor1);
        System.out.println("esto es lo que ingresaste por teclado "+ valor2);
        System.out.println("esto es lo que ingresaste por teclado "+ valor3);

    }

}