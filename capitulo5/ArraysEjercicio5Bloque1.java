package capitulo5;

public class ArraysEjercicio5Bloque1 {

	public static void main(String[] args) {
		
		int[] array = new int[150];
		
		int sumaPares = 0, sumaImpares = 0, i = 0;
		
		for (; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i] + " ");
			
			if (array[i] % 2 == 0) {
				sumaPares += array[i];
			}
			else {
				sumaImpares += array[i];
			}
				
		}
		
		System.out.println("\n\nLa suma de los numeros pares es: " + sumaPares);
		System.out.println("La suma de los numeros impares es: " + sumaImpares);

	}

}
