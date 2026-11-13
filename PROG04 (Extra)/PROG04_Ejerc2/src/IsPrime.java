import java.util.Scanner;

public class IsPrime {

	public static boolean checker(int n) {
		if ((n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && Math.sqrt(n) - (int) Math.sqrt(n) != 0) || n <= 5 && n != 1 && n != 4)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 1000; i++) {
			System.out.printf("Enter a number to check if it's prime\n", i);
			int n = sc.nextInt();
			if (n < 1)
				System.out.println("The number cannot be less than 1");
			System.out.printf(checker(n) ? "The number %d is prime\n" : "The number %d is not prime\n", n);
		}
		sc.close();
		return ;
	}
}
// shit no workey with 221