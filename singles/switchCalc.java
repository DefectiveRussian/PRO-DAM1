import java.util.Scanner;

public class switchCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nOperación: num1 operador num2\nIntroduzca num1");
		double num1 = sc.nextDouble();
		System.out.println("Introduzca el operador (+, -, *, /)");
		char op = sc.next().charAt(0);
		System.out.println("Introduzca num2");
		double num2 = sc.nextDouble();

		switch (op) {
			case '+':
				System.out.printf("\nOperación: %.1f + %.1f\nResultado = %.1f\n", num1, num2, (num1 + num2));
				break;
			case '-':
				System.out.printf("\nOperación: %.1f - %.1f\nResultado = %.1f\n", num1, num2, (num1 - num2));
				break;
			case '*':
				System.out.printf("\nOperación: %.1f * %.1f\nResultado = %.1f\n", num1, num2, (num1 * num2));
				break;
			case '/':
				if (num2 != 0)
					System.out.printf("\nOperación: %.2f / %.2f\nResultado = %.2f\n", num1, num2, (num1 / num2));
				else
					System.out.printf("No se puede dividir entre 0\n");
				break;
			default:
				System.out.printf("Operador inválido\n");
				break;
		}
		sc.close();
	}
}
