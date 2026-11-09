public class forVwhile {
	public static void main(String[] args) {
		int x = 1;

		System.out.println("Bucle while:");
		while (x <= 10) {
			System.out.printf("Valor de x: %d\n", x);
			x++;
		}

		System.out.println("\nBucle for:");
		for (x = 1; x <= 10; x++)
			System.out.println("Valor de x: " + x);
	}
}
