package capitulo3java;

import java.util.Scanner;

public class Bloque03_Ejercicio1_SumaYMedia_BucleFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int suma = 0;
		int media = 0;
		
		for (; num != 0;) {
			System.out.println("Por favor, introduzca un numero (0 -> terminar)");
			num = sc.nextInt();
			if (num != 0) {
				suma += num;
				media = (suma / num);
			}
		}

		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la media es: " + media);
		
	}

}
