package capitulo5;

public class ArraysEjercicio6Bloque1 {

	public static void main(String[] args) {
		
		int[] array = new int[150];
		
		int suma = 0, i = 0;
		
		for (; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i] + " ");
			if (i % 2 == 0) {
				suma += array[i];
			}
					
		}
		
		System.out.println("\n\nLa suma de los elementos cuyo indice es par es: " + suma);
		
	}

}
