import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		// error handling loop
		do {
			System.out.println("Introduzca la cantidad de números para mostrar");
			n = sc.nextInt();
			if (n < 0)
				System.out.println("Número tiene que ser positivo");
		} while (n < 0);

		// edge case
		if (n == 0) {
			System.out.println("Has pedido enseñar 0 números");
			System.exit(0);
		}
		
		// counter i starts at 2 because 1 will always be shown if any numbers are requested
		int i = 2;
		int t;
		System.out.printf("---------------------------\nHaciendo uso de bucle while\n");
		System.out.printf("1");
		while (i <= n) {
			t = (i * (i + 1)) / 2;
			System.out.printf(", %d", t);
			i++;
		}
		System.out.println(".");
		System.out.printf("---------------------------\nHaciendo uso de bucle for\n");
		System.out.printf("1");
		for (i = 2; i <= n; i++) {
			t = (i * (i + 1)) / 2;
			System.out.printf(", %d", t);
		}
		System.out.println(".");
		sc.close();
		return ;
	}
}
