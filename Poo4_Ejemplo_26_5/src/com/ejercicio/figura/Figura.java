package com.ejercicio.figura;

public class Figura {
	
	private double lado_triangulo;
	private double altura_triangulo;
	private double base_triangulo;
	private double lado_cuadrado;
	private double ancho_rectangulo;
	private double largo_rectangulo;
	
	
	public void cargarDatosTriangulo(double lado,double altura,double base) {
		this.lado_triangulo=lado;
		this.altura_triangulo=altura;
		this.base_triangulo=base;
		areaTriangulo();
		perimetroTriangulo();
	}
	
	public void cargarDatosCuadrado(double lado) {
		this.lado_cuadrado = lado;
		areaCuadrado();
		perimetroCuadrado();
	}
	
	public void cargarDatosRectangulo(double ancho, double largo) {
		this.ancho_rectangulo=ancho;
		this.largo_rectangulo=largo;
		areaRectangulo();
		perimetroRectangulo();
	}
	
	
	

	
	public void areaTriangulo(){
		double resultado;
		resultado = (base_triangulo*altura_triangulo)/2;
		System.out.println("El area del triangulo es: "+resultado);
		
	}
	public void perimetroTriangulo(){
		double resultado = lado_triangulo*3;
		System.out.println("El perimetro del triangulo es: "+resultado);
	}
	public void areaCuadrado(){
		double resultado= lado_cuadrado*lado_cuadrado;
		System.out.println("El area del cuadrado es: "+resultado);
	}
	public void perimetroCuadrado(){
		double resultado = lado_cuadrado*4;
		System.out.println("El perimetro del cuadrado es: "+resultado);
	}
	public void areaRectangulo(){
		double resultado = largo_rectangulo*ancho_rectangulo;
		System.out.println("El area del rectangulo es: "+resultado);
	}
	public void perimetroRectangulo(){
		double resultado = (largo_rectangulo*2)+(ancho_rectangulo*2);
		System.out.println("El perimetro del rectangulo es: "+resultado);
	}
	
}