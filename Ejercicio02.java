package capitulo5bloque6;

public class Ejercicio02 {

	public static void main(String[] args) {

		int num = 0;
		char matriz[][] = new char[10][30];
		
		for (int i = 0; i < matriz.length; i++) {
			num = (int) Math.round(Math.random() * 29);
			System.out.println("");
			for (int j = 0; j < matriz[i].length; j++) {
				if (j < num) {
					matriz[i][j] = '*';
				}
				else {
					matriz[i][j] = ' ';
				}
				System.out.print(matriz[i][j]);
			}
		}
	}
}
