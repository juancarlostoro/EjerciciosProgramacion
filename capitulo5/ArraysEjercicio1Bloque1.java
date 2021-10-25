package capitulo5;

public class ArraysEjercicio1Bloque1 {

	public static void main(String[] args) {
		
		int[] array = new int[150];
		
		int suma = 0, mayor = array[0], menor = array[0], i = 0;
		
		for (; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i] + " ");
			suma = suma + array[i];
			
			if (array[i] > mayor) {
				mayor = array[i];
			}
			
			if (array[i] == 0) {
				menor = array[i];
			}
			if (array[i] == 1) {
				menor = array[i];		
			}
			if (array[i] == 2) {
				menor = array[i];
			}
			if (array[i] == 3) {
				menor = array[i];		
			}
			if (array[i] == 4) {
				menor = array[i];
			}
			
		}
		
		System.out.println("\n\nLa suma es: " + suma);
		System.out.println("La media es: " + (suma/i));
		System.out.println("El menor es: " + menor);
		System.out.println("El mayor es: " + mayor);

	}

}
