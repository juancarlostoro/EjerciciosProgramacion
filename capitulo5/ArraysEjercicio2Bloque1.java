package capitulo5;

import java.util.Scanner;

public class ArraysEjercicio2Bloque1 {

	public static void main(String[] args) {
		
		int limiteInf, limiteSup, i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el limite inferior");
		limiteInf = sc.nextInt();
		System.out.println("Introduzca el limite superior");
		limiteSup = sc.nextInt();
		
		int[] array = new int[150];
				
		for (; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*(limiteSup - limiteInf)) + limiteInf;
			System.out.print(array[i] + " ");
		}
			
	}

}
