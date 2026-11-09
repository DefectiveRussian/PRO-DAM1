import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class randomNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the floor number");
		int minNum = sc.nextInt();
		System.out.println("Enter the ceiling number");
		int maxNum = sc.nextInt();
		int randomNum = ThreadLocalRandom.current().nextInt(minNum, maxNum + 1);

		System.out.printf("A number between %d and %d is: %d\n", minNum, maxNum, randomNum);
		sc.close();
		return ;
	}
}
