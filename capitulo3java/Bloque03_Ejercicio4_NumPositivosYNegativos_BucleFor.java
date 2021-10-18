package capitulo3java;

import java.util.Scanner;

public class Bloque03_Ejercicio4_NumPositivosYNegativos_BucleFor {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 4");
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int numPositivos = 0;
		int numNegativos = 0;
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Por favor, introduzca un numero (0 -> terminar)");
			num = sc.nextInt();
			
		if (i != 0)
				if (num > 0) {
					numPositivos++;
				}
				if (num < 0) {
					numNegativos++;
				}
		
		}
		
		System.out.println("Cantidad de numeros positivos: " + numPositivos);
		System.out.println("Cantidad de numeros negativos: " + numNegativos);

	}

}
