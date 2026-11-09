import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce the amount of numbers of fibonacci sequence to display.");
		int n = sc.nextInt();
		// bucle infinito hasta que n sea un número válido 
		while (n <= 0) {
			System.out.println("Invalid number. Please try again.\n");
			n = sc.nextInt();
		}
		// edge case de solo un número solicitado 
		if (n == 1) {
			System.out.println("0.");
			System.exit(0);
		}
		// todo número que sea más grande que f92 causa overflow 
		while (n >= 94) {
			System.out.printf("Error. Out of scope of long and will cause overflow. f93 > 9,223,372,036,854,775,807.\nPlease try again.\n");
			n = sc.nextInt();
		}
		// i = 4 para que el bucle while solo itere en caso de que haya 4 o más números que mostrar 
		int i = 4;
		long x = 0;
		long y = 1;

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
