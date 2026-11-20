import java.util.Scanner;

public class Arrays {
	public static int x = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrizA = crearMatriz(sc);
		int[][] matrizB = crearMatriz(sc);

		System.out.printf("-----------------------\nMatriz A\n");
		mostrarMatriz(matrizA);
		System.out.printf("-----------------------\nMatriz B\n");
		mostrarMatriz(matrizB);
		System.out.printf("-----------------------\nSuma de matrizes\n");
		mostrarMatriz(sumarMatrices(matrizA, matrizB));
		sc.close();
		return ;
	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d\t", matriz[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
		int[][] matrizC = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		return matrizC;
	}

	public static int[][] crearMatriz(Scanner sc) {
		int[][] matriz = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (x < 9) // counts to 9 to know when the first matrix ends
					System.out.printf("Introduzca valor de posición A(%d,%d)\n",i, j);
				else
					System.out.printf("Introduzca valor de posición B(%d,%d)\n",i, j);
				matriz[i][j] = sc.nextInt();
				x++;
			}
		}
		return matriz;
	}
}
