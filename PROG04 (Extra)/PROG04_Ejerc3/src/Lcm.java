import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int x = sc.nextInt();
		System.out.println("Enter the second number");
		int y = sc.nextInt();

		if (x < 0 || y < 0) {
			System.out.println("Numbers cannot be negative");
			System.exit(1);
		}

		int i = 1;
		int j = 1;

		while ((x * i) != (y * j)) {
			if ((x * i) < (y * j))
				i++;
			else if ((x * i) > (y * j))
				j++;
		}

		System.out.printf("LCM (Least Common Multiple) is: %d\n", (x * i));
		System.out.printf("First number -> %d * %d = %d\nSecond number -> %d * %d = %d", x, i, (x * i), y, j, (y * j));
		sc.close();
		return ;
	}
}
