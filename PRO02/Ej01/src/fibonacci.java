import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca cantidad de números de serie Fibonacci para mostrar.");
		int n = sc.nextInt();
		// bucle infinito hasta que n sea un número válido
		while (n <= 0) {
			System.out.println("Número inválido, vuelva a intentar.");
			n = sc.nextInt();
		}
		// edge case de solo un número solicitado
		if (n == 1) {
			System.out.println("0.");
			System.exit(0);
		}
		// i = 4 para que el bucle while solo itere en caso de que haya más de 4 números que mostrar 
		int i = 4;
		int x = 0;
		int y = 1;

		System.out.printf("%d, %d", x, y);
		while (i <= n) {
			x = x + y;
			y = x + y;
			System.out.printf(", %d, %d", x, y);
			i += 2;
		}
		// if para escribir solo 1 número en caso de que el total sea impar
		if (i >= n && (n % 2 != 0)) 
			System.out.printf(", %d", (x + y));
		System.out.println(".");
		sc.close();
		return;
	}
}
/*
		Alternative loop

		for (i = 4; i <= n; i += 2) {
			x = x + y;
			y = x + y;
			System.out.printf(", %d, %d", x, y);
		}
*/
