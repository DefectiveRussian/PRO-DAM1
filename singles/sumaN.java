import java.util.Scanner;

public class sumaN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la cantidad de numeros para sumar");
		int N = sc.nextInt();
		int suma = 0;

		for(int i = 1; i <= N; i++){
			suma += i;
			System.out.println(suma + ", ");
		}
		System.out.println("Suma de los primeros " + N + " numeros es " + suma);
		sc.close();
	}
}
