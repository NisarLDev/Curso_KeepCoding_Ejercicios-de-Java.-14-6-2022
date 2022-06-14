package com.ejemplo.calculadora;

import java.util.Scanner;

public class Calculadora {
			private double num1;
			private double num2;
			private String operacion;
			
			public Calculadora(double num1, double num2,String operacion) {
				this.num1 = num1;
				this.num2 = num2;
				this.operacion = operacion;
				
				if(operacion.equals("+")) {
					System.out.println("La suma total es: "+sumar());
				}if(operacion.equals("-")) {
					System.out.println("La resta total es: "+restar());
				}if(operacion.equals("/")) {
					System.out.println("La división total es: "+dividir());
				}if(operacion.equals("*")) {
					System.out.println("La multiplicación total es: "+multiplicar());
				}
				
			}
			//,suma,resta,multiplicacion,division;
			
		        // hay un next para cada tipo de variable,cuando es simbolo 
		         // por ejemplo es next solo
	   public double sumar() {
			return this.num1+this.num2;
		}
		public double restar() {
			return this.num1-this.num2;
		}
		 public double multiplicar() {
				return this.num1*this.num2;
			}
		 public double dividir() {
				return this.num1/this.num2;
			}
  }
