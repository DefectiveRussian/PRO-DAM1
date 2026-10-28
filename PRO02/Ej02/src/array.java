import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		int i, j;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número de filas (1 - 10)");
		int row = sc.nextInt();
		System.out.println("Introduzca el número de columanas (1 - 10)");
		int column = sc.nextInt();

		if (row > 10 || row < 1 || column > 10 || column < 1) {
			System.out.printf("El número de columnas o filas no puede superar %d, o ser menor de 1!", MAX_SIZE);
			System.exit(1);
		}

		int crearMatriz[][] = new int[row][column];
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				crearMatriz[i][j] = (i + 1) * 10 * (j + 1);
			}
		}

		System.out.println("La matriz es:");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(crearMatriz[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}

/*
		int[][] myArrayList = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		int crearMatriz[][] = new int[row][column];
		while (i < row) {
			while (j < column) {
				crearMatriz[i][j] = (i + 1) * 10 * (j + 1);
				j++;
			}
			i++;
		}
 */