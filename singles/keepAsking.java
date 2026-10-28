//Solicita al usuario un número mayor que 0.
//En caso de que el numero introducido no cumpla esta condición,
//se le volverá a solicitar

import java.util.Scanner; 

public class keepAsking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número mayor que 0");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Número incorrecto. Vuelva a intentar.");
			n = sc.nextInt();
		}
		System.out.println("Número introducido correcto = " + n);
		sc.close();
	}
}
