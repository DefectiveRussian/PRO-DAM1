import java.util.Scanner;

public class Game {
	public static int numIntentos = 3;
	public static int numMax = 10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		// infinite loop of the game menu
		while (loop) {
			System.out.printf("-----Menú-----\n1. Jugar\n2. Configurar\n3. Salir\n--------------\n");
			int selector = sc.nextInt();

			switch (selector){
				case 1: 
					jugar(sc);
					break;
				case 2:
					configurar(sc);
					break;
				case 3: 
					loop = false;
					salir();
				default:
					System.out.println("Valor introducido no válido");
					break;
			}
		}
		sc.close();
		return ;
	}
	
	public static void configurar(Scanner sc) {
		System.out.println("Introduzca el numero de intentos");
		numIntentos = sc.nextInt();
		System.out.println("Introduzca el numero máximo a generar");
		numMax = sc.nextInt();
	}

	public static void salir() {
		System.out.println("Hasta luego!");
		System.exit(0);
	}

	public static void jugar(Scanner sc) {	
		int i = 0;
		int j = 0;
		int guess;
		do {
			double calcA = Math.random() * numMax;
			double calcB = Math.random() * numMax;
			int numA = (int) calcA + 1;
			int numB = (int) calcB + 1;
			System.out.printf("--------------\nTienes %d intento/s.\n%d + %d = ", (numIntentos - i), numA, numB);
			guess = sc.nextInt();
			if (guess == (numA + numB)) {
				System.out.println("Has acertado!");
				j++;
			}
			else 
				System.out.println("Incorrecto!");
			i++;
			} while (i < numIntentos);
			System.out.println("Te has quedado sin intentos!");
			if (j == 1)
				System.out.println("Acertaste 1 vez");
			else
				System.out.printf("Acertaste %d veces\n", j);
	}
}
