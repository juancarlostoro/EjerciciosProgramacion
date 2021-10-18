package capitulo3java;

import java.util.Scanner;

public class Bloque03_Ejercicio3_TablaMultiplicar_BucleFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int resultado = 0;
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Por favor, introduzca un numero (0 -> terminar)");
			num = sc.nextInt();
			
			for (i = 0; i <=10; i++) {
				if (num != 0) {
					resultado = num * i;
				}
				System.out.println(num + "x" + i + "=" + resultado);
			}
		}
		
	}

}
