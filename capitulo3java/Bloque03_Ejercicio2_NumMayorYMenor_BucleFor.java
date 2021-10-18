package capitulo3java;

import java.util.Scanner;

public class Bloque03_Ejercicio2_NumMayorYMenor_BucleFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int numMayor = 0;
		int numMenor = 0;
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Por favor, introduzca un numero (0 -> terminar)");
			num = sc.nextInt();
			
			if (i != 0) {
				if (numMayor < num) {
					numMayor = num;
				}
				if (numMenor > num) {
					numMenor = num;
				}
			}
			
		}
		
		System.out.println("El numero mayor es: " + numMayor);
		System.out.println("El numero menor es: " + numMenor);
		
	}

}
