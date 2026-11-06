import java.util.Scanner;

public class array {
	public static int[][] crearMatriz(int a, int b) {
		int[][] matriz = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				// coordenadas de los bordes | -1 porque las coordenadas empiezan desde 0
				if (j == 0 || j == (b - 1) || i == 0 || i == (a - 1))
					matriz[i][j] = 1;
				else
					matriz[i][j] = 0;
			}
		}
		return matriz;
	}

	public static void mostrarMatriz(int[][] miMatriz, int row, int column) {
		System.out.println("La matriz es:\n----------------------------------------------");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%d\t", miMatriz[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número de filas (1 - 10)");
		int row = sc.nextInt();
		// error handling
		while (row > MAX_SIZE || row < 1) {
			System.out.printf("Número de filas no puede ser menor que 1 o mayor que %d.\nVuelva a intentar\n", MAX_SIZE);
			row = sc.nextInt();
		}
		System.out.println("Introduzca el número de columnas (1 - 10)");
		int column = sc.nextInt();
		// also error handling
		while (column > MAX_SIZE || column < 1) {
			System.out.printf("Número de columnas no puede ser menor que 1 o mayor que %d .\nVuelva a intentar\n", MAX_SIZE);
			column = sc.nextInt();
		}

		int[][] matriz = crearMatriz(row, column);
		mostrarMatriz(matriz, row, column);
		sc.close();
		return;
	}
}

/*
 * WHEN 1: (j == 0) (j == column) (i == 0) (i == row)
 * 
 * int[][] myArrayList = {
 * {1, 2, 3},
 * {4, 5, 6},
 * {7, 8, 9}
 * };
 * 
 * int crearMatriz[][] = new int[row][column];
 * while (i < row) {
 * while (j < column) {
 * crearMatriz[i][j] = (i + 1) * 10 * (j + 1);
 * j++;
 * }
 * i++;
 * }
 * 
 * int crearMatriz[][] = new int[row][column];
 * for (i = 0; i < row; i++) {
 * for (j = 0; j < column; j++) {
 * crearMatriz[i][j] = (i + j);
 * }
 * }
 * 
 * int crearMatriz[][] = new int[row][column];
 * while (i < row) {
 * while (j < column) {
 * matriz[i][j] = 1;
 * j++;
 * }
 * i++;
 * }
 */