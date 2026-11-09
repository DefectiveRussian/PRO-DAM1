import java.util.Scanner;
public class EnterOrNot {
	public static void main(String[] args) {
		int age;
		boolean acompañado = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("Write your age in numbers");
		age = sc.nextInt();
		if (age < 0)
			System.out.println("Age cannot be negative");
		else {
			if (age >= 18 || (age < 18 && acompañado))
				System.out.println("You are allowed to enter");
			else
				System.out.println("You are NOT allowed to enter");
		}

		sc.close();
	}
}

