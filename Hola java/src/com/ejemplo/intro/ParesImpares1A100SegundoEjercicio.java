package com.ejemplo.intro;

public class ParesImpares1A100SegundoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NUMEROS PARES DEL 1 AL 10 con for
		
			System.out.println("Acontinuacion se muetra la serie de numeros pares n");
		
			int x;
		
			int y;
	
			for(int i=1;i<51;i++)
		
			{
		
			x=i*2;//aqui X toma el valor del actual valor de i, multiplicado por 2
		
			System.out.println("Numero par:"+x);
		
			}
		
			 
		
			//NUMEROS IMPARES DEL 1 AL 10 con while
		
			System.out.println("Acontinuacion se muestra la serie de numeros impares n");
	
			int j=1;
		
			while(j<100)
		
			{
	
			System.out.println("Numero impar:"+j);
		
			j=j+2;/*aqui incremantamos la variable j en 2, de manera
		
			que si tenia el valor de 1, se le suma 2 y valdra 3
		
			* cuando j llegue al valor igual o mayor a 10, el ciclo termina
			 
			*/
		
			}
		
	}

}
