package capitulo5bloque6;

public class Ejercicio04 {

	public static void main(String[] args) {

		char matriz[][] = new char[10][20];
		int a = (int) Math.round(Math.random() * (10 - 1) + 1);
		int b = (int) Math.round(Math.random() * (8 - 1) + 1);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0) {
					System.out.print('*');
				}
				if (j < matriz[i].length - 1) {
					System.out.print(' ');
				}
				if (j == matriz[i].length - 1) {
					System.out.print('*');
				}
				if (i == 0) {
					System.out.print('*');
				}
				if (i < matriz.length - 1) {
					System.out.print(' ');
				}
				if (i == matriz.length - 1) {
					System.out.print('*');
				}
				if (i == a && j == b) {
					System.out.print("0");
				}
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}

}
