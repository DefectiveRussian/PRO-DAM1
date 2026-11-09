import java.util.Scanner;

public class Game {
	public static int numIntentos = 3;
	public static int numMax = 10;

	public static void salir() {
		System.out.println("El programa va a finalizar.");
		System.out.println("¡Gracias por jugar! Hasta luego.");
		System.exit(0);
	}

	public static void jugar(Scanner sc) {
		System.out.println("¡Comienza el juego!");
		System.out.printf("Tienes %d intentos\n", numIntentos);
		int numOculto = (int) (Math.random()*numMax + 1);
		int i = 1;

		while (i <= numIntentos) {
			System.out.println("Introduce un número entre 0 y " + numMax);
			int numJugado = sc.nextInt();
			if (numJugado != numOculto) {
				System.out.printf(numJugado > numOculto ? "El número oculto es menor." : "El número oculto es mayor.");
				System.out.printf(" Te quedan %d intentos.\n", numIntentos - i);
				i++;
			}
			else if (numJugado == numOculto) {
				System.out.printf("¡Has ganado! Has necesitado %d intentos.\n", i);
				i = numIntentos;
			}
		}
		if (i > numIntentos)
			System.out.printf("------------------\n¡Te has quedado sin intentos!\n------------------\n\n");
		return ;
	}

	public static void configurar(Scanner sc) {
		System.out.println("Introduce el número máximo de intentos");
		numIntentos = sc.nextInt();
		System.out.println("Introduce número máximo para adivinar");
		numMax = sc.nextInt();

		return ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		// bucle infinito a proposito
		do {
			System.out.printf("--- Menú ---\n1. Jugar\n2. Configurar\n0. Salir\n");
			int selector = sc.nextInt();

			switch (selector) {
				case 1:
					jugar(sc);
					break;
				case 2: 
					configurar(sc);
					break;
				case 0:
					loop = false;
					salir();
				default:
					System.out.println("Número incorrecto");
					break;
				}
			} while (loop);
		sc.close();
		return ;
	}
}
