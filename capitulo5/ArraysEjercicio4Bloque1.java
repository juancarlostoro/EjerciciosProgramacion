package capitulo5;

import java.util.Scanner;

public class ArraysEjercicio4Bloque1 {

	public static void main(String[] args) {
		
		int valor;
		
		int[] array = new int[150];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un valor para buscar en el array");
		valor = sc.nextInt();
						
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i] + " ");			
			
			if (valor == array[i]) {
				System.out.println("Valor encontrado en la posicion " + i);
			}
			else {
				System.out.println("Valor no encontrado");
			}
		}
			
	}

}
