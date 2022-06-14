package com.ejemplo.intro;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaDeAlturaDeUnGrupoDePersonas_20_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //creamos el ArrayList que contendr� la altura de los alumnos
	      ArrayList<Double> altura = new ArrayList();
	      int N;
	      double media;
	      //obtenemos el n�mero de alumnos de la clase
	      N = numeroAlumnos();
	      //leemos la altura de los N alumnos
	      leerAlturas(altura, N);
	      //calculamos la media
	      media = calcularMedia(altura);
	      //mostramos los resultados
	      mostrarResultados(altura, media);
	   }

	   //M�todo para pedir por teclado el n�mero de alumnos de la clase
	   public static int numeroAlumnos() {
	      Scanner sc = new Scanner(System.in);
	      int n;
	      do {
	            System.out.println("Introduce n�mero de personas: ");
	            n = sc.nextInt();
	      } while (n < 1);
	      return n;
	   }

	   //Este m�todo recibe el ArrayList y el n�mero de alumnos de la clase
	   //Pide por teclado la altura de todos los alumnos y las guarda en el ArrayList
	   public static void leerAlturas(ArrayList<Double> a, int n) {
	      Scanner sc = new Scanner(System.in);
	      int i;
	      double alto;
	      for (i = 1; i <= n; i++) {
	           do {
	                 System.out.println("Persona " + i + " altura: ");
	                 alto = sc.nextDouble();
	           } while (alto <= 0);
	           a.add(alto); //a�ade la altura al final del ArrayList
	      }
	  }

	   //Este m�todo recibe el ArrayList con todas las alturas
	   //calcula y devuelve la media
	   public static double calcularMedia(ArrayList<Double> a) {
	      double media = 0;
	      for (Double d : a) {
	            media = media + d;
	      }
	      return media / a.size();
	   }

	   //Muestra la altura de todos los alumnos, la media y calcula y muestra
	   //cuantos alumnos hay con altura superior a la media
	   //y cu�ntos con altura inferior
	   public static void mostrarResultados(ArrayList<Double> a, double media) {                                
	      int superior = 0, inferior = 0;
	      System.out.println("alturas introducidas: ");
	      System.out.println(a);
	      for (Double d : a) {
	            if (d > media)
	                superior++;
	            else if (d < media)
	                       inferior++;
	      }
	      System.out.printf("Media: %.2f %n", media);
	      System.out.println("Hay " + superior + " personas m�s altas que la media");
	      System.out.println("Hay " + inferior + " personas m�s bajas que la media");
	   }
	}
		
		/*int n1;
		String alturaMedia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la altura");
		alturaMedia = teclado.next();
		
		for(int i=0;i<4;i++) {
		System.out.println(i);
		*/
