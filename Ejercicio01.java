package capitulo5bloque6;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int array[] = crearArray();
		mostrarArray(array);
		
	}
	
	public static void mostrarArray(int array[]) {
		
		System.out.print("Combinación: ");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nComplementario: " + array[array.length - 1]);
		
	}
	
	public static int[] crearArray() {
		
		int array[] = new int[7];
		boolean estaRepetido;
		int numeroAlAzar;
		int i = 0;
		
		do {
			estaRepetido = true;
			numeroAlAzar = (int) Math.round(Math.random() * 49);
			for (int j = 0; j < i; j++)
				if (array[j] == numeroAlAzar)
					estaRepetido = false;
			if (estaRepetido) {
				array[i] = numeroAlAzar;
				i++;
			}
		} while (i < array.length);
		
		return array;
		
	}

}
